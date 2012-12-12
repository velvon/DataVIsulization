package lab1b;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.green);
      window.fillOval(450, 200, 75, 50);
      window.setColor(Color.green);
      window.fillOval(300, 200, 75, 50);
      window.setColor(Color.black);
      window.fillOval(375, 300, 50, 50);
      window.setColor(Color.red);
      window.drawArc(250, 350, 300, 75, 200, 150);

		//add more code here


   }
}