import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacerTestC extends JPanel {
	private Image leftShoe, rightShoe;

	// Constructor
	public PacerTestC()
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
		

		Pacer pacer = new Pacer(x,y, leftShoe, rightShoe);
		
		for (int i=0;i<4;i++) {
			pacer.draw(g);
			pacer.moveForward(stepLength);
			pacer.turnRight();
			
		}

	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Feet");
		window.setBounds(100, 100, 400, 380);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PacerTestC panel = new PacerTestC();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}
}
