import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacerTest extends JPanel {
	private Image leftShoe, rightShoe;

	// Constructor
	public PacerTest()
	  {
	    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
	    rightShoe = (new ImageIcon("rightshoe.gif")).getImage();
	  }

	// Called automatically when the panel needs repainting
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 100;
		int y = 100;
		int stepLength = 150;
		

		Foot foot = new Foot(x, y, rightShoe);
		foot.turn(180);

		for (int count = 1; count <= 4; count++) {
			foot.draw(g);
			foot.moveForward(-stepLength);
		}
		
		x = 100;
		y = 150;
		foot = new Foot(x, y, leftShoe);
		foot.turn(180);

		for (int count = 1; count <= 4; count++) {
			foot.draw(g);
			foot.moveForward(-stepLength);
		}

	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Feet");
		window.setBounds(100, 100, 700, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PacerTest panel = new PacerTest();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}
}
