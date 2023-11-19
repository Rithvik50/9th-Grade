// A PollDisplayPanel holds the vote counts and
// displays the numbers and the pie chart for
// the current vote counts.

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel {
	private String name1, name2, name3, name4;
	// STEP 1: Declare the int fields count1, count2, count3:
	int count1, count2, count3, count4;

	// Constructor
	public PollDisplayPanel(String nm1, String nm2, String nm3, String nm4) {
		setBackground(Color.WHITE);
		name1 = nm1;
		name2 = nm2;
		name3 = nm3;
		name4 = nm4;
		count1 = 0; // optional
		count2 = 0; // optional
		count3 = 0; // optional
		count4 = 0; // optional
	}

	// Increments count1
	public void vote1() {
		count1++;
	}

	// Increments count2
	public void vote2() {
		count2++;
	}

	// Increments count3
	public void vote3() {
		count3++;
	}
	
	// Increments count4
	public void vote4() {
		count4++;
	}
	

	// Returns a string representation of this object
	public String toString() {
		// STEP 3: Complete the toString() method
		// This method should return a String in the form:
		// Tami: 1 Brian: 2 Liz: 0 Rithvik: 20
		String name = "Tami : " + count1 + "Brian : " + count2 + "Liz : " + count3 + "Rithvik: " + count4;
		return name;
	}

	// Redefines JPanel's paintComponent to draw this pie chart
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int w = getWidth();
		int h = getHeight();
		int x = w / 2;
		int y = h / 2;
		int r = Math.min(w, h) / 4;
		drawPieChart(g, x, y, r);
		drawLegend(g, x, y, r);
	}

	// Draws the pie chart.
	// To avoid gaps in the picture, the following algorithm is used:
	// 1. set fromDegree to 0;
	// 2. draw the red sector and increment fromDegree by its size
	// 3. draw the green sector and increment fromDegree by its size
	// 4. set the size of the blue sector to the remaining
	// area, 360 - fromDegree, but not less than 0:
	// degrees = Math.max(360 - fromDegree, 0);
	// (Occasionally, due to rounding errors, fromDegree may become 361,
	// for example, count1 = 5, count2 = 11, count3 = 0.)
	private void drawPieChart(Graphics g, int x, int y, int r) {
		int total = count1 + count2 + count3 + count4;
		int fromDegree = 0;

		if (total > 0) {
			int degrees;
			g.setColor(Color.RED);
			degrees = countToDegrees(count1, total);
			drawSector(g, x, y, r, fromDegree, degrees);

			fromDegree += degrees;
			g.setColor(Color.GREEN);
			degrees = countToDegrees(count2, total);
			drawSector(g, x, y, r, fromDegree, degrees);

			fromDegree += degrees;
			g.setColor(Color.BLUE);
			degrees = countToDegrees(count3, total);
			drawSector(g, x, y, r, fromDegree, degrees);
			
			fromDegree += degrees;
			g.setColor(Color.MAGENTA);
			degrees = Math.max(360 - fromDegree, 0);
			drawSector(g, x, y, r, fromDegree, degrees);

			// STEP 5: Finish the drawPieChart() method so that it correctly
			// draws all 3 sectors of the pie chart.
		} else {
			g.setColor(Color.LIGHT_GRAY);
			drawSector(g, x, y, r, fromDegree, 360);
		}
	}

	// Draws the vote counts and the corresponding color squares.
	private void drawLegend(Graphics g, int x, int y, int r) {
		// Display the counts:
		y += (r + 20);
		g.setColor(Color.BLACK);

		// STEP 6: Finish the drawLegend() method by uncommenting and
		// completing the following three lines
		g.drawString(name1, x - r + 10, y + 30);
		g.drawString("" + count1, x - r + 10, y);

		g.drawString(name2, x + 10, y + 30);
		g.drawString("" + count2, x + 10, y);

		g.drawString(name3, x + r + 10, y + 30);
		g.drawString("" + count3, x + r + 10, y);
		
		g.drawString(name4, x + r + 60, y + 30);
		g.drawString("" + count4, x + r + 60, y);

		// Display the color squares:
		y += 5;
		x -= 2;
		g.setColor(Color.RED);
		g.fillRect(x - r, y, 10, 10);
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 10, 10);
		g.setColor(Color.BLUE);
		g.fillRect(x + r, y, 10, 10);
		g.setColor(Color.MAGENTA);
		g.fillRect(x + r + 60, y, 10, 10);
	}

	// Returns the number of degrees in a pie slice that
	// corresponds to count / total, rounded to the nearest integer.
	private int countToDegrees(int count, int total) {
		// STEP 4: Complete the countToDegrees method so that it returns
		// the correct number of degrees
		int degree = (int) (Math.round(((double) count / total * 360)));
		return degree;
	}

	// Draws a sector, centered at x, y, of radius r,
	// of angle measure degrees, starting at fromDegree.
	private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees) {
		if (degrees > 359)
			g.fillOval(x - r, y - r, 2 * r, 2 * r);
		else
			g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
	}
}
