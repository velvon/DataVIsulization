package proc;

import processing.core.PApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
private int xPos;
private int yPos;
private int width;
private int height;
private Color color;
private int xSpeed;
private int ySpeed;
PApplet p;

   /*
*The constructor is used to initialize all instance variables.
*The constructor makes the object.
*/
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd, PApplet P)
   {
p=P;
xPos = x;
yPos=y;
width = wid;
height = ht;
color = col;
xSpeed = xSpd;
ySpeed = ySpd;
//finish this constructor
   }

      /*
*The draw method draws the shape on the screen.
*/
  
   public void draw()
   {
      p.fill(165, 42, 40);
      p.ellipse(xPos, yPos, width, height);

      //draw whatever you want
      // ^
      // [ :: ]
      // ()

   }

   /*
*This draw method will be used to erase the shape.
*/
   public void draw(int i)
   {
      p.fill(23, 43, 150);
      p.rect(xPos, yPos, width, height);
   }

   public void moveAndDraw()
   {
xPos = xPos+xSpeed;
yPos = yPos+ySpeed;
draw();
     //not needed yet
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
    return xPos;
   }

   public void setX( int x )
   {
xPos=x;
    //add code here
   }
   public int gety()
   {
    return yPos;
   }

   public void sety( int x )
   {
yPos=x;
    //add code here
   }
   public int getxsp()
   {
    return xSpeed;
   }

   public void seth(int hei)
   {
height=hei;
   }
   public void setxsp( int x )
   {
xSpeed=x;
    //add code here
   }
   public int getysp()
   {
    return ySpeed;
   }

   public void setysp( int x )
   {
ySpeed=x;
    //add code here
   }



   public String toString()
   {
    return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}