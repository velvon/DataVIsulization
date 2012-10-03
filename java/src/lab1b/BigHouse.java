package lab1b;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
	   bigHouse(window);
      //call bigHouse
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      window.setColor(Color.WHITE);
      window.fillRect(375, 425, 75, 150);
      window.setColor(Color.YELLOW);
      window.fillRect(300, 250, 50, 50);
      window.fillRect(500, 250, 50, 50);
      window.setColor(Color.GREEN);
      window.fillRect(150, 125, 500, 75);

   }
}