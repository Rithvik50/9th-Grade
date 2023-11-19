import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 *          Period - TODO Your Period Assignment - TODO Name of Assignment
 * 
 *          Sources - TODO list collaborators
 */
public class Landscape extends JPanel implements KeyListener, MouseListener {
	
	private Image tree, house, sun, character;
	private Image character_left = (new ImageIcon("character_left.gif")).getImage(),
			character_right = (new ImageIcon("character_right.gif")).getImage();
	private char keyTyped;
	private int x, y;
	private Rectangle hitbox;
	private boolean isClickedOn = false;

	public Landscape() {
		super();
		addKeyListener(this);
		addMouseListener(this);
		setFocusable(true);
		tree = (new ImageIcon("tree.gif")).getImage();
		house = (new ImageIcon("house.png")).getImage();
		sun = (new ImageIcon("sun.png")).getImage();
		x = 250;
		y = 375;
		character = character_right;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

		int width = getWidth();
		int height = getHeight();

		double ratioX = width / 800.0;
		double ratioY = height / 600.0;

		Graphics2D g2 = (Graphics2D) g;
		g2.scale(ratioX, ratioY);

		// SUN
		if (keyTyped == '1') {
			g2.drawImage(sun, 550, 30, this);
			repaint();
		} else {
			g2.setColor(Color.ORANGE);
			g2.drawOval(600, 75, 100, 100);
			repaint();
		}

		// TREE
		if (keyTyped == '2') {
			g2.drawImage(tree, 120, 200, this);
			repaint();
		} else {
			g2.setColor(Color.BLACK);
			g2.fillRect(200, 250, 50, 200);
			g2.setColor(Color.GREEN);
			g2.fillOval(150, 200, 150, 100);
			repaint();
		}

		// HOUSE
		if (keyTyped == '3') {
			g2.drawImage(house, 550, 250, this);
			repaint();
		} else {
			g2.setColor(new Color(125, 0, 125));
			g2.fillRect(550, 300, 150, 150);
			g2.setColor(Color.BLUE);
			Polygon p = new Polygon();
			p.addPoint(550, 300);
			p.addPoint(700, 300);
			p.addPoint(620, 250);
			g2.fillPolygon(p);
			repaint();
		}
		g2.setColor(Color.WHITE);
		hitbox = new Rectangle(x, y, character.getWidth(this), character.getHeight(this));
		g2.drawRect(x, y, hitbox.width, hitbox.height);
		g2.drawImage(character, x, y, this);
		repaint();
		
		if (x > 700) {
			x = 699;
		} else if (x < 0) {
			x = 0;
		} else if (y > 374) {
			y = 373;
		} else if (y < 0) {
			y = 0;
		}

		if (isClickedOn) {
			x = 580;
			y = 375;
		} else {
			
		}

		g2.setColor(Color.GREEN);
		g2.drawLine(0, 450, 800, 450);
		g2.setColor(new Color(125, 0, 125));
		g2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 40));
		g2.drawString("Sunnyvale, CA: A Scenic Landscape", 100, 525);

	}

	public void keyPressed(KeyEvent e) {
		int arrowKeys = e.getKeyCode();
		if (arrowKeys == KeyEvent.VK_UP) {
			y -= 30;
		} else if (arrowKeys == KeyEvent.VK_DOWN) {
			y += 30;
		} else if (arrowKeys == KeyEvent.VK_LEFT) {
			x -= 30;
			character = character_left;
		} else if (arrowKeys == KeyEvent.VK_RIGHT) {
			x += 30;
			character = character_right;
		}
	}

	public void keyTyped(KeyEvent e) {
		keyTyped = e.getKeyChar();
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (hitbox.contains(x, y)) {
			isClickedOn = true;
		}
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (hitbox.contains(x, y)) {
			isClickedOn = false;
		}
		repaint();
	}

}