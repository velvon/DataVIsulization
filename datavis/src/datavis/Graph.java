package datavis;
import processing.core.PApplet;

public class Graph {
	PApplet p;
	int xspeed=0;
	int yspeed=0;
	int xpos=0;
	int ypos=0;
	public Graph(PApplet p1, int xp, int yp, int xs, int ys)
	{
		p=p1;
		xspeed=xs;
		yspeed=ys;
		xpos=xp;
		ypos=yp;
	}
	public void move()
	{
		
		xpos+=xspeed;
		ypos+=yspeed;
	}
	public void setx(int x)
	{
		xspeed=x;
	}
	public void sety(int y)
	{
		yspeed=y;
	}
	public int getxs()
	{
		return xspeed;
	}
	public int getys()
	{
		return yspeed;
	}
	public int getx()
	{
		return xpos;
	}
	public int gety()
	{
		return ypos;
	}
	public void setxp(int x)
	{
		xpos=x;
	}
	public void setyp(int y)
	{
		ypos=y;
	}
}
