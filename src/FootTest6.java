import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest6 extends JPanel
{
  private Image shoe;

  // Constructor
  public FootTest6()
  {
    shoe = (new ImageIcon("leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    int x=100;
    int y=100;
    int stepLength = 100;
    
    Foot foot = new Foot(x, y, shoe);
    foot.turn(-90);
    for (int count=1;count<=4;count++) {
    	foot.draw(g);
    	foot.moveSideways(stepLength);
    }
    
    x=100;
    y=300;
    
    foot = new Foot(x,y,shoe);
    foot.turn(180);
    for (int count=1;count<=4;count++) {
    	foot.draw(g);
    	foot.moveForward(-stepLength);
    }
    
    x=600;
    y=100;
    stepLength=50;
    foot = new Foot(x,y,shoe);
    for (int count=1;count<=4;count++) {
    	foot.draw(g);
    	foot.moveForward(stepLength);
    	foot.turn(90);
    	foot.moveForward(stepLength);
    }

    /*int x = 300;
    int y = 100;
    int stepLength = 100;

    Foot foot = new Foot(x, y, shoe);

    for (int count = 1; count <= 8; count++)
    {
      foot.draw(g);
      foot.turn(45);
      foot.moveForward(stepLength);
    }

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);*/
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 800, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest6 panel = new FootTest6();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}