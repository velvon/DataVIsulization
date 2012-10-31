package moving;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MovingShapePanel extends JPanel implements Runnable
{
   

	private Shape sh,p1,p2;
	
	//use an array of Molecule
	//Molecule[] molecules;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
		sh = new Shape(300,300,20,20,Color.YELLOW,3,1);
		p1=new Shape(20, 300, 20, 20, Color.BLUE,1,2);
		p2=new Shape(40, 300, 20, 20, Color.BLUE,1,2);
		//refer sh to a new Shape


		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		p2.setX(getWidth()-40);
		p2.seth((int)(getHeight()/5));
		p1.seth((int)(getHeight()/5));
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		sh.moveAndDraw(window);
		p1.draw(window, Color.BLUE);
		p2.draw(window, Color.GREEN);
		//tell sh to move and draw

		//this code handles the left and right walls
		if(!(sh.getX()>=5 && sh.getX()<=getWidth()-25))
		{
			sh.setX(300);
			sh.sety(300);
		}
		if(!(sh.gety()>=5 && sh.gety()<=getHeight()-25))
		{
			sh.setysp(-sh.getysp());
		}
		if (sh.getX()>=p1.getX()+17 && sh.getX()<=p1.getX()+23)
			if (sh.gety()>=p1.gety() && sh.gety()<=p1.gety()+(int)(getHeight()/5))
				sh.setxsp(-sh.getxsp());
		if (sh.getX()>=p2.getX()-23 && sh.getX()<=p2.getX()-17)
			if (sh.gety()>=p2.gety() && sh.gety()<=p2.gety()+(int)(getHeight()/5))
				sh.setxsp(-sh.getxsp());
		//add code to handle the top and bottom walls
		

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}



}