//Author: Rithvik Muthyalapati
//Date: 10/31/18
//Version: 2.0
//Version Notes:
//v2.0: Added this header here

import java.awt.*;
import javax.swing.*;

public class BadStyle extends JPanel {

	public void paintComponent(Graphics GRAPHICS) // This paints the graphics
	{

		super.paintComponent(GRAPHICS);
		GRAPHICS.setColor(Color.GREEN);
		GRAPHICS.fillRect(0, 60, 185, 50);
		GRAPHICS.setColor(Color.CYAN);
		GRAPHICS.fillRect(0, 0, 185, 60);
		GRAPHICS.setColor(Color.WHITE);
		GRAPHICS.fillOval(125, 5, 10, 10);
		GRAPHICS.fillOval(145, 3, 9, 9);
		GRAPHICS.fillOval(165, 1, 8, 8);
		GRAPHICS.setColor(Color.BLACK);
		GRAPHICS.fillRect(120, 20, 17, 40);
		GRAPHICS.setColor(Color.RED);
		GRAPHICS.fillRect(30, 40, 130, 45);
		GRAPHICS.setColor(Color.BLACK);
		GRAPHICS.fillRect(88, 57, 16, 28);
		GRAPHICS.setColor(Color.YELLOW);
		GRAPHICS.fillOval(95, 67, 5, 5);
		GRAPHICS.fillOval(-10, -10, 40, 40);
		GRAPHICS.setColor(Color.CYAN);
		GRAPHICS.fillRect(45, 50, 13, 13);
		GRAPHICS.fillRect(135, 50, 13, 13);
		GRAPHICS.setColor(Color.BLUE);

		Polygon roof = new Polygon(); // Changed the name to an appropriate object name
		roof.addPoint(30, 40);
		roof.addPoint(160, 40);
		roof.addPoint(95, 20);
		GRAPHICS.fillPolygon(roof);

		GRAPHICS.setColor(Color.MAGENTA);
		GRAPHICS.fillOval(90, 25, 10, 10);

	}

	public static void main(String[] args) {

		JFrame houseScenery = new JFrame("A Nice House Scenery");
		houseScenery.setBounds(300, 300, 200, 150);
		houseScenery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BadStyle panel = new BadStyle();
		panel.setBackground(Color.WHITE);
		Container c = houseScenery.getContentPane();
		c.add(panel);
		houseScenery.setVisible(true);

	}

}
