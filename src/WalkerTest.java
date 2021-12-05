import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WalkerTest extends JPanel {
	private Image leftShoe, rightShoe,leftSandal, rightSandal;

	// Constructor
	public WalkerTest()
	  {
	    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
	    rightShoe = (new ImageIcon("rightshoe.gif")).getImage();
	    leftSandal = (new ImageIcon("leftsandal.gif")).getImage();
	    rightSandal = (new ImageIcon("rightsandal.gif")).getImage();
	  }

	// Called automatically when the panel needs repainting
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 100;
		int y = 100;
		int stepLength = 150;
		

		Foot foot = new Foot(x, y, leftShoe);

		for (int count = 1; count <= 4; count++) {
			foot.draw(g);
			foot.moveForward(stepLength);
		}
		
		x = 100;
		y = 150;
		foot = new Foot(x, y, rightShoe);

		for (int count = 1; count <= 4; count++) {
			foot.draw(g);
			foot.moveForward(stepLength);
		}
		
		x = 100;
		y = 300;
		stepLength = 150;
		

		foot = new Foot(x, y, leftSandal);

		for (int count = 1; count <= 4; count++) {
			if (count!=3)
				foot.draw(g);
			foot.moveForward(stepLength);
		}
		
		x = 100;
		y = 350;
		foot = new Foot(x, y, rightSandal);

		for (int count = 1; count <= 4; count++) {
			if (count!=3) 
				foot.draw(g);
			foot.moveForward(stepLength);
		}
				

		
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Feet");
		window.setBounds(100, 100, 700, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WalkerTest panel = new WalkerTest();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}
}
