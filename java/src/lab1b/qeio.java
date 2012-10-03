package lab1b;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      head(window);
      upperBody(window);
      lowerBody(window);

      //call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.RED);
      window.fillOval(330, 115, 15, 15);
      window.fillOval(430, 115, 15, 15);
      window.setColor(Color.BLACK);
      window.fillOval(370, 135, 25, 10);
      window.setColor(Color.RED);
      window.drawArc(330, 150, 100, 25, 190, 190);
      
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	     window.setColor(Color.PINK);
	      window.fillRect(340, 225, 120, 75);
	      window.setColor(Color.BLACK);
	      window.drawLine(340, 225, 270, 200);
	      window.drawLine(460, 225, 520, 200);

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.GREEN);
	      window.fillRect(340, 315, 120, 75);
	      window.setColor(Color.BLACK);
	   window.drawLine(340, 315, 270, 300);
	   window.drawLine(460, 315, 515, 300);
	   
	   window.setColor(Color.GRAY);
	      window.fillRect(340, 405, 120, 75);
	      window.setColor(Color.BLACK);
	   window.drawLine(340, 480, 270, 525);
	   window.drawLine(460, 480, 515, 525);
   }
}