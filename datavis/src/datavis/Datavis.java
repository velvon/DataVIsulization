package datavis;

import processing.core.PApplet;

public class Datavis extends PApplet {
	boolean bar=false, t1=false,t2=false, t3=false, t4=false, t5=false, t6=false, t7=false, t8=false, t9 = false;
	Graph g = new Graph(this, 40, 40, 3, 3);
	Graph g2 = new Graph(this, 40, 40, 2, 3);
	Graph g3 = new Graph(this, 40, 40, 3, 1);
	Graph g4 = new Graph(this, 40, 40, 1, 3);
	Graph g5 = new Graph(this, 40, 40, 3, 2);
	Graph g6 = new Graph(this, 40, 40, 2, 1);
	Graph g7 = new Graph(this, 40, 40, 1, 1);
	Graph g8 = new Graph(this, 40, 40, 2, 2);
	Graph g9 = new Graph(this, 40, 40, 1, 2);
	int mous = 0;
	Read r = new Read(this);
	int a=10, b=10, c=10, d=10, e=10, f=10, j=10, h=10, i = 10;

	public void setup() {
		size(displayWidth, displayHeight);
		background(0,0,0);
		g.setxp(width/2);
		g.setyp((height/2));
		g2.setxp(width/2);
		g2.setyp((height/2));
		g3.setxp(width/2);
		g3.setyp((height/2));
		g4.setxp(width/2);
		g4.setyp((height/2));
		g5.setxp(width/2);
		g5.setyp((height/2));
		g6.setxp(width/2);
		g6.setyp((height/2));
		g7.setxp(width/2);
		g7.setyp((height/2));
		g8.setxp(width/2);
		g8.setyp((height/2));
		g9.setxp(width/2);
		g9.setyp((height/2));
	}

	public void draw() {
		background(0,0,0);

		fill(255,0,0);
		rect(10*width/11,height/2-40,15,15);
		fill(0,255,0);
		rect(10*width/11,height/2-20,15,15);
		fill(0,0,255);
		rect(10*width/11,height/2,15,15);
		fill(255,255,0);
		rect(10*width/11,height/2+20,15,15);
		fill(255,255,255);
		rect(10*width/11,height/2+40,15,15);
		rect(10*width/11-8,height-20,2,-(height-20));
		textAlign(LEFT);
		text("fives",10*width/11+20,height/2-28);
		text("fours",10*width/11+20,height/2-8);
		text("threes",10*width/11+20,height/2+12);
		text("twos",10*width/11+20,height/2+32);
		text("ones",10*width/11+20,height/2+52);
		textAlign(CENTER);
		text("2003",width/11,height-10);
		textAlign(CENTER);
		text("2004",2*width/11,height-10);
		textAlign(CENTER);
		text("2005",3*width/11,height-10);
		textAlign(CENTER);
		text("2006",4*width/11,height-10);
		textAlign(CENTER);
		text("2007",5*width/11,height-10);
		textAlign(CENTER);
		text("2008",6*width/11,height-10);
		textAlign(CENTER);
		text("2009",7*width/11,height-10);
		textAlign(CENTER);
		text("2010",8*width/11,height-10);
		textAlign(CENTER);
		text("2011",9*width/11,height-10);
		textAlign(CENTER);
		text("Graph",10*width/11,height-10);
		if((mouseX>=(width/11-24))&&(mouseX<=(width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(2*width/11-24))&&(mouseX<=(2*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(3*width/11-24))&&(mouseX<=(3*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(4*width/11-24))&&(mouseX<=(4*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(5*width/11-24))&&(mouseX<=(5*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(6*width/11-24))&&(mouseX<=(6*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(7*width/11-24))&&(mouseX<=(7*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(8*width/11-24))&&(mouseX<=(8*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(9*width/11-24))&&(mouseX<=(9*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else if((mouseX>=(10*width/11-24))&&(mouseX<=(10*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
		{
			cursor(HAND);
			
		}
		else 
			cursor(ARROW);
		if (mousePressed)
		{
			if (mous==0)
			{
				if(mouseX>=width/11-24&&mouseX<=width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					a=10;
					if(t1)
						t1=false;
					else
						t1=true;
				}
				if(mouseX>=2*width/11-24&&mouseX<=2*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					b=10;
					if(t2)
						t2=false;
					else
						t2=true;
				}
				if(mouseX>=3*width/11-24&&mouseX<=3*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					c=10;
					if(t3)
						t3=false;
					else
						t3=true;
				}
				if(mouseX>=4*width/11-24&&mouseX<=4*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					d=10;
					if(t4)
						t4=false;
					else
						t4=true;
				}
				if(mouseX>=5*width/11-24&&mouseX<=5*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					e=10;
					if(t5)
						t5=false;
					else
						t5=true;
				}
				if(mouseX>=6*width/11-24&&mouseX<=6*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					f=10;
					if(t6)
						t6=false;
					else
						t6=true;
				}
				if(mouseX>=7*width/11-24&&mouseX<=7*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					h=10;
					if(t7)
						t7=false;
					else
						t7=true;
				}
				if(mouseX>=8*width/11-24&&mouseX<=8*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					i=10;
					if(t8)
						t8=false;
					else
						t8=true;
				}
				if(mouseX>=9*width/11-24&&mouseX<=9*width/11+24&&mouseY>=height-20&&mouseY<=height-5)
				{
					mous=1;
					j=10;
					if(t9)
						t9=false;
					else
						t9=true;
				}
				if((mouseX>=(10*width/11-24))&&(mouseX<=(10*width/11+24))&&(mouseY>=(height-20))&&(mouseY<=(height-5)))
				{
					mous=1;
					if (bar==false)
				{
					t1=false;
					t2=false;
					t3=false;
					t4=false;
					t5=false;
					t5=false;
					t6=false;
					t7=false;
					t8=false;
					t9=false;
					bar=true;
				}
					else if (bar)
					{
						t1=false;
						t2=false;
						t3=false;
						t4=false;
						t5=false;
						t5=false;
						t6=false;
						t7=false;
						t8=false;
						t9=false;
						bar=false;
					}
				}
			}
		}
		if (bar==false)
		{
		if (t1) {
			fill(255,255,255);
			ellipse(g.getx(), g.gety(),(float) (a / 100 * r.totals()[0] / r.count()), (float) (a/100 * r.totals()[0] / r.count()));
			fill(255,0,0);
			arc(g.getx(), g.gety(),(float) (a / 100 * r.totals()[0] / r.count()), (float) (a/100 * r.totals()[0] / r.count()), 0,(float) (PI * 2 * r.fives()[0]/100));
			fill(0, 255, 0);
			arc(g.getx(), g.gety(),(float) (a / 100 * r.totals()[0] / r.count()), (float) (a/100 * r.totals()[0] / r.count()),(float) (PI * 2 * r.fives()[0]/100),(float) ((PI * 2 * r.fives()[0] / 100) + PI * 2* r.fours()[0] / 100));
			fill(0, 0, 255);
			arc(g.getx(),g.gety(),(float) (a / 100 * r.totals()[0] / r.count()),(float) (a / 100 * r.totals()[0] / r.count()),(float) ((PI * 2 * r.fives()[0] / 100) + PI * 2* r.fours()[0] / 100),(float) (((PI * 2 * r.fives()[0] / 100) + PI * 2* r.fours()[0] / 100) + (PI * 2 * r.threes()[0] / 100)));
			fill(255, 255, 0);
			arc(g.getx(),g.gety(),(float) (a / 100 * r.totals()[0] / r.count()),(float) (a / 100 * r.totals()[0] / r.count()),(float) (((PI * 2 * r.fives()[0] / 100) + PI * 2* r.fours()[0] / 100) + (PI * 2 * r.threes()[0] / 100)),(float) (((PI * 2 * r.fives()[0] / 100) + PI * 2* r.fours()[0] / 100)+ (PI * 2 * r.threes()[0] / 100) + (PI * 2* r.twos()[0] / 100)));
			if(a<=100000)
			a+=1000;
			if(!(g.getx()>(1000 * r.totals()[0] / r.count())/2&&g.getx()<10*width/11-5-(1000 * r.totals()[0] / r.count())/2))
				g.setx(-g.getxs());
			if(!(g.gety()>(1000 * r.totals()[0] / r.count())/2&&g.gety()<height-(30+1000 * r.totals()[0] / r.count())/2))
				g.sety(-g.getys());
			g.move();
			fill(0,0,0);
			text("2003",(int)(g.getx()-(a / 100 * r.totals()[0] / r.count())/4),(int)(g.gety()+(a / 100 * r.totals()[0] / r.count())/4));
		}
		if (t2) {
			fill(255,255,255);
			ellipse(g2.getx(), g2.gety(),(float) (b / 100 * r.totals()[1] / r.count()), (float) (b/100 * r.totals()[1] / r.count()));
			fill(255,0,0);
			arc(g2.getx(), g2.gety(),(float) (b / 100 * r.totals()[1] / r.count()), (float) (b/100 * r.totals()[1] / r.count()), 0,(float) (PI * 2 * r.fives()[1]/100));
			fill(0, 255, 0);
			arc(g2.getx(), g2.gety(),(float) (b / 100 * r.totals()[1] / r.count()), (float) (b/100 * r.totals()[1] / r.count()),(float) (PI * 2 * r.fives()[1]/100),(float) ((PI * 2 * r.fives()[1] / 100) + PI * 2* r.fours()[1] / 100));
			fill(0, 0, 255);
			arc(g2.getx(),g2.gety(),(float) (b / 100 * r.totals()[1] / r.count()),(float) (b / 100 * r.totals()[1] / r.count()),(float) ((PI * 2 * r.fives()[1] / 100) + PI * 2* r.fours()[1] / 100),(float) (((PI * 2 * r.fives()[1] / 100) + PI * 2* r.fours()[1] / 100) + (PI * 2 * r.threes()[1] / 100)));
			fill(255, 255, 0);
			arc(g2.getx(),g2.gety(),(float) (b / 100 * r.totals()[1] / r.count()),(float) (b / 100 * r.totals()[1] / r.count()),(float) (((PI * 2 * r.fives()[1] / 100) + PI * 2* r.fours()[1] / 100) + (PI * 2 * r.threes()[1] / 100)),(float) (((PI * 2 * r.fives()[1] / 100) + PI * 2* r.fours()[1] / 100)+ (PI * 2 * r.threes()[1] / 100) + (PI * 2* r.twos()[1] / 100)));
			if(b<=100000)
			b+=1000;
			if(!(g2.getx()>(1000 * r.totals()[1] / r.count())/2&&g2.getx()<10*width/11-5-(1000 * r.totals()[1] / r.count())/2))
				g2.setx(-g2.getxs());
			if(!(g2.gety()>(1000 * r.totals()[1] / r.count())/2&&g2.gety()<height-(30+1000 * r.totals()[1] / r.count())/2))
				g2.sety(-g2.getys());
			g2.move();
			fill(0,0,0);
			text("2004",(int)(g2.getx()-(b / 100 * r.totals()[1] / r.count())/4),(int)(g2.gety()+(b / 100 * r.totals()[1] / r.count())/4));
		}
		if (t3) {
			fill(255,255,255);
			ellipse(g3.getx(), g3.gety(),(float) (c / 100 * r.totals()[2] / r.count()), (float) (c/100 * r.totals()[2] / r.count()));
			fill(255,0,0);
			arc(g3.getx(), g3.gety(),(float) (c / 100 * r.totals()[2] / r.count()), (float) (c/100 * r.totals()[2] / r.count()), 0,(float) (PI * 2 * r.fives()[2]/100));
			fill(0, 255, 0);
			arc(g3.getx(), g3.gety(),(float) (c / 100 * r.totals()[2] / r.count()), (float) (c/100 * r.totals()[2] / r.count()),(float) (PI * 2 * r.fives()[2]/100),(float) ((PI * 2 * r.fives()[2] / 100) + PI * 2* r.fours()[2] / 100));
			fill(0, 0, 255);
			arc(g3.getx(),g3.gety(),(float) (c / 100 * r.totals()[2] / r.count()),(float) (c / 100 * r.totals()[2] / r.count()),(float) ((PI * 2 * r.fives()[2] / 100) + PI * 2* r.fours()[2] / 100),(float) (((PI * 2 * r.fives()[2] / 100) + PI * 2* r.fours()[2] / 100) + (PI * 2 * r.threes()[2] / 100)));
			fill(255, 255, 0);
			arc(g3.getx(),g3.gety(),(float) (c / 100 * r.totals()[2] / r.count()),(float) (c / 100 * r.totals()[2] / r.count()),(float) (((PI * 2 * r.fives()[2] / 100) + PI * 2* r.fours()[2] / 100) + (PI * 2 * r.threes()[2] / 100)),(float) (((PI * 2 * r.fives()[2] / 100) + PI * 2* r.fours()[2] / 100)+ (PI * 2 * r.threes()[2] / 100) + (PI * 2* r.twos()[2] / 100)));
			if(c<=100000)
			c+=1000;
			if(!(g3.getx()>(1000 * r.totals()[2] / r.count())/2&&g3.getx()<10*width/11-5-(1000 * r.totals()[2] / r.count())/2))
				g3.setx(-g3.getxs());
			if(!(g3.gety()>(1000 * r.totals()[2] / r.count())/2&&g3.gety()<height-(30+1000 * r.totals()[2] / r.count())/2))
				g3.sety(-g3.getys());
			g3.move();
			fill(0,0,0);
			text("2005",(int)(g3.getx()-(c / 100 * r.totals()[2] / r.count())/4),(int)(g3.gety()+(c / 100 * r.totals()[2] / r.count())/4));
		}

		if (t4) {
			fill(255,255,255);
			ellipse(g4.getx(), g4.gety(),(float) (d / 100 * r.totals()[3] / r.count()), (float) (d/100 * r.totals()[3] / r.count()));
			fill(255,0,0);
			arc(g4.getx(), g4.gety(),(float) (d / 100 * r.totals()[3] / r.count()), (float) (d/100 * r.totals()[3] / r.count()), 0,(float) (PI * 2 * r.fives()[3]/100));
			fill(0, 255, 0);
			arc(g4.getx(), g4.gety(),(float) (d / 100 * r.totals()[3] / r.count()), (float) (d/100 * r.totals()[3] / r.count()),(float) (PI * 2 * r.fives()[3]/100),(float) ((PI * 2 * r.fives()[3] / 100) + PI * 2* r.fours()[3] / 100));
			fill(0, 0, 255);
			arc(g4.getx(),g4.gety(),(float) (d/ 100 * r.totals()[3] / r.count()),(float) (d / 100 * r.totals()[3] / r.count()),(float) ((PI * 2 * r.fives()[3] / 100) + PI * 2* r.fours()[3] / 100),(float) (((PI * 2 * r.fives()[3] / 100) + PI * 2* r.fours()[3] / 100) + (PI * 2 * r.threes()[3] / 100)));
			fill(255, 255, 0);
			arc(g4.getx(),g4.gety(),(float) (d / 100 * r.totals()[3] / r.count()),(float) (d / 100 * r.totals()[3] / r.count()),(float) (((PI * 2 * r.fives()[3] / 100) + PI * 2* r.fours()[3] / 100) + (PI * 2 * r.threes()[3] / 100)),(float) (((PI * 2 * r.fives()[3] / 100) + PI * 2* r.fours()[3] / 100)+ (PI * 2 * r.threes()[3] / 100) + (PI * 2* r.twos()[3] / 100)));
			if(d<=100000)
			d+=1000;
			if(!(g4.getx()>(1000 * r.totals()[3] / r.count())/2&&g4.getx()<10*width/11-5-(1000 * r.totals()[3] / r.count())/2))
				g4.setx(-g4.getxs());
			if(!(g4.gety()>(1000 * r.totals()[3] / r.count())/2&&g4.gety()<height-(30+1000 * r.totals()[3] / r.count())/2))
				g4.sety(-g4.getys());
			g4.move();
			fill(0,0,0);
			text("2006",(int)(g4.getx()-(d / 100 * r.totals()[3] / r.count())/4),(int)(g4.gety()+(d / 100 * r.totals()[3] / r.count())/4));
		}
		if (t5) {
			fill(255,255,255);
			ellipse(g5.getx(), g5.gety(),(float) (e / 100 * r.totals()[4] / r.count()), (float) (e/100 * r.totals()[4] / r.count()));
			fill(255,0,0);
			arc(g5.getx(), g5.gety(),(float) (e / 100 * r.totals()[4] / r.count()), (float) (e/100 * r.totals()[4] / r.count()), 0,(float) (PI * 2 * r.fives()[4]/100));
			fill(0, 255, 0);
			arc(g5.getx(), g5.gety(),(float) (e / 100 * r.totals()[4] / r.count()), (float) (e/100 * r.totals()[4] / r.count()),(float) (PI * 2 * r.fives()[4]/100),(float) ((PI * 2 * r.fives()[4] / 100) + PI * 2* r.fours()[4] / 100));
			fill(0, 0, 255);
			arc(g5.getx(),g5.gety(),(float) (e / 100 * r.totals()[4] / r.count()),(float) (e / 100 * r.totals()[4] / r.count()),(float) ((PI * 2 * r.fives()[4] / 100) + PI * 2* r.fours()[4] / 100),(float) (((PI * 2 * r.fives()[4] / 100) + PI * 2* r.fours()[4] / 100) + (PI * 2 * r.threes()[4] / 100)));
			fill(255, 255, 0);
			arc(g5.getx(),g5.gety(),(float) (e / 100 * r.totals()[4] / r.count()),(float) (e / 100 * r.totals()[4] / r.count()),(float) (((PI * 2 * r.fives()[4] / 100) + PI * 2* r.fours()[4] / 100) + (PI * 2 * r.threes()[4] / 100)),(float) (((PI * 2 * r.fives()[4] / 100) + PI * 2* r.fours()[4] / 100)+ (PI * 2 * r.threes()[4] / 100) + (PI * 2* r.twos()[4] / 100)));
			if(e<=100000)
			e+=1000;
			if(!(g5.getx()>(1000 * r.totals()[4] / r.count())/2&&g5.getx()<10*width/11-5-(1000 * r.totals()[4] / r.count())/2))
				g5.setx(-g5.getxs());
			if(!(g5.gety()>(1000 * r.totals()[4] / r.count())/2&&g5.gety()<height-(30+1000 * r.totals()[4] / r.count())/2))
				g5.sety(-g5.getys());
			g5.move();
			fill(0,0,0);
			text("2007",(int)(g5.getx()-(e / 100 * r.totals()[4] / r.count())/4),(int)(g5.gety()+(e / 100 * r.totals()[4] / r.count())/4));
		}
		if (t6) {
			fill(255,255,255);
			ellipse(g6.getx(), g6.gety(),(float) (f / 100 * r.totals()[5] / r.count()), (float) (f/100 * r.totals()[5] / r.count()));
			fill(255,0,0);
			arc(g6.getx(), g6.gety(),(float) (f / 100 * r.totals()[5] / r.count()), (float) (f/100 * r.totals()[5] / r.count()), 0,(float) (PI * 2 * r.fives()[5]/100));
			fill(0, 255, 0);
			arc(g6.getx(), g6.gety(),(float) (f / 100 * r.totals()[5] / r.count()), (float) (f/100 * r.totals()[5] / r.count()),(float) (PI * 2 * r.fives()[5]/100),(float) ((PI * 2 * r.fives()[5] / 100) + PI * 2* r.fours()[5] / 100));
			fill(0, 0, 255);
			arc(g6.getx(),g6.gety(),(float) (f / 100 * r.totals()[5] / r.count()),(float) (f / 100 * r.totals()[5] / r.count()),(float) ((PI * 2 * r.fives()[5] / 100) + PI * 2* r.fours()[5] / 100),(float) (((PI * 2 * r.fives()[5] / 100) + PI * 2* r.fours()[5] / 100) + (PI * 2 * r.threes()[5] / 100)));
			fill(255, 255, 0);
			arc(g6.getx(),g6.gety(),(float) (f / 100 * r.totals()[5] / r.count()),(float) (f / 100 * r.totals()[5] / r.count()),(float) (((PI * 2 * r.fives()[5] / 100) + PI * 2* r.fours()[5] / 100) + (PI * 2 * r.threes()[5] / 100)),(float) (((PI * 2 * r.fives()[5] / 100) + PI * 2* r.fours()[5] / 100)+ (PI * 2 * r.threes()[5] / 100) + (PI * 2* r.twos()[5] / 100)));
			if(f<=100000)
			f+=1000;
			if(!(g6.getx()>(1000 * r.totals()[5] / r.count())/2&&g6.getx()<10*width/11-5-(1000 * r.totals()[5] / r.count())/2))
				g6.setx(-g6.getxs());
			if(!(g6.gety()>(1000 * r.totals()[5] / r.count())/2&&g6.gety()<height-(30+1000 * r.totals()[5] / r.count())/2))
				g6.sety(-g6.getys());
			g6.move();
			fill(0,0,0);
			text("2008",(int)(g6.getx()-(f / 100 * r.totals()[5] / r.count())/4),(int)(g6.gety()+(f / 100 * r.totals()[5] / r.count())/4));
		}
		if (t7) {
			fill(255,255,255);
			ellipse(g7.getx(), g7.gety(),(float) (h / 100 * r.totals()[6] / r.count()), (float) (h/100 * r.totals()[6] / r.count()));
			fill(255,0,0);
			arc(g7.getx(), g7.gety(),(float) (h / 100 * r.totals()[6] / r.count()), (float) (h/100 * r.totals()[6] / r.count()), 0,(float) (PI * 2 * r.fives()[6]/100));
			fill(0, 255, 0);
			arc(g7.getx(), g7.gety(),(float) (h / 100 * r.totals()[6] / r.count()), (float) (h/100 * r.totals()[6] / r.count()),(float) (PI * 2 * r.fives()[6]/100),(float) ((PI * 2 * r.fives()[6] / 100) + PI * 2* r.fours()[6] / 100));
			fill(0, 0, 255);
			arc(g7.getx(),g7.gety(),(float) (h / 100 * r.totals()[6] / r.count()),(float) (h / 100 * r.totals()[6] / r.count()),(float) ((PI * 2 * r.fives()[6] / 100) + PI * 2* r.fours()[6] / 100),(float) (((PI * 2 * r.fives()[6] / 100) + PI * 2* r.fours()[6] / 100) + (PI * 2 * r.threes()[6] / 100)));
			fill(255, 255, 0);
			arc(g7.getx(),g7.gety(),(float) (h / 100 * r.totals()[6] / r.count()),(float) (h / 100 * r.totals()[6] / r.count()),(float) (((PI * 2 * r.fives()[6] / 100) + PI * 2* r.fours()[6] / 100) + (PI * 2 * r.threes()[6] / 100)),(float) (((PI * 2 * r.fives()[6] / 100) + PI * 2* r.fours()[6] / 100)+ (PI * 2 * r.threes()[6] / 100) + (PI * 2* r.twos()[6] / 100)));
			if(h<=100000)
			h+=1000;
			if(!(g7.getx()>(1000 * r.totals()[6] / r.count())/2&&g7.getx()<10*width/11-5-(1000 * r.totals()[6] / r.count())/2))
				g7.setx(-g7.getxs());
			if(!(g7.gety()>(1000 * r.totals()[6] / r.count())/2&&g7.gety()<height-(30+1000 * r.totals()[6] / r.count())/2))
				g7.sety(-g7.getys());
			g7.move();
			fill(0,0,0);
			text("2009",(int)(g7.getx()-(h / 100 * r.totals()[6] / r.count())/4),(int)(g7.gety()+(h / 100 * r.totals()[6] / r.count())/4));
		}
		if (t8) {
			fill(255,255,255);
			ellipse(g8.getx(), g8.gety(),(float) (i / 100 * r.totals()[7] / r.count()), (float) (i/100 * r.totals()[7] / r.count()));
			fill(255,0,0);
			arc(g8.getx(), g8.gety(),(float) (i / 100 * r.totals()[7] / r.count()), (float) (i/100 * r.totals()[7] / r.count()), 0,(float) (PI * 2 * r.fives()[7]/100));
			fill(0, 255, 0);
			arc(g8.getx(), g8.gety(),(float) (i / 100 * r.totals()[7] / r.count()), (float) (i/100 * r.totals()[7] / r.count()),(float) (PI * 2 * r.fives()[7]/100),(float) ((PI * 2 * r.fives()[7] / 100) + PI * 2* r.fours()[7] / 100));
			fill(0, 0, 255);
			arc(g8.getx(),g8.gety(),(float) (i / 100 * r.totals()[7] / r.count()),(float) (i / 100 * r.totals()[7] / r.count()),(float) ((PI * 2 * r.fives()[7] / 100) + PI * 2* r.fours()[7] / 100),(float) (((PI * 2 * r.fives()[7] / 100) + PI * 2* r.fours()[7] / 100) + (PI * 2 * r.threes()[7] / 100)));
			fill(255, 255, 0);
			arc(g8.getx(),g8.gety(),(float) (i / 100 * r.totals()[7] / r.count()),(float) (i / 100 * r.totals()[7] / r.count()),(float) (((PI * 2 * r.fives()[7] / 100) + PI * 2* r.fours()[7] / 100) + (PI * 2 * r.threes()[7] / 100)),(float) (((PI * 2 * r.fives()[7] / 100) + PI * 2* r.fours()[7] / 100)+ (PI * 2 * r.threes()[7] / 100) + (PI * 2* r.twos()[7] / 100)));
			if(i<=100000)
			i+=1000;
			if(!(g8.getx()>(1000 * r.totals()[7] / r.count())/2&&g8.getx()<10*width/11-5-(1000 * r.totals()[7] / r.count())/2))
				g8.setx(-g8.getxs());
			if(!(g8.gety()>(1000 * r.totals()[7] / r.count())/2&&g8.gety()<height-(30+1000 * r.totals()[7] / r.count())/2))
				g8.sety(-g8.getys());
			g8.move();
			fill(0,0,0);
			text("2010",(int)(g8.getx()-(i / 100 * r.totals()[7] / r.count())/4),(int)(g8.gety()+(i / 100 * r.totals()[7] / r.count())/4));
		}
		if (t9) {
			fill(255,255,255);
			ellipse(g9.getx(), g9.gety(),(float) (j / 100 * r.totals()[8] / r.count()), (float) (j/100 * r.totals()[8] / r.count()));
			fill(255,0,0);
			arc(g9.getx(), g9.gety(),(float) (j / 100 * r.totals()[8] / r.count()), (float) (j/100 * r.totals()[8] / r.count()), 0,(float) (PI * 2 * r.fives()[8]/100));
			fill(0, 255, 0);
			arc(g9.getx(), g9.gety(),(float) (j / 100 * r.totals()[8] / r.count()), (float) (j/100 * r.totals()[8] / r.count()),(float) (PI * 2 * r.fives()[8]/100),(float) ((PI * 2 * r.fives()[8] / 100) + PI * 2* r.fours()[8] / 100));
			fill(0, 0, 255);
			arc(g9.getx(),g9.gety(),(float) (j / 100 * r.totals()[8] / r.count()),(float) (j / 100 * r.totals()[8] / r.count()),(float) ((PI * 2 * r.fives()[8] / 100) + PI * 2* r.fours()[8] / 100),(float) (((PI * 2 * r.fives()[8] / 100) + PI * 2* r.fours()[8] / 100) + (PI * 2 * r.threes()[8] / 100)));
			fill(255, 255, 0);
			arc(g9.getx(),g9.gety(),(float) (j / 100 * r.totals()[8] / r.count()),(float) (j / 100 * r.totals()[8] / r.count()),(float) (((PI * 2 * r.fives()[8] / 100) + PI * 2* r.fours()[8] / 100) + (PI * 2 * r.threes()[8] / 100)),(float) (((PI * 2 * r.fives()[8] / 100) + PI * 2* r.fours()[8] / 100)+ (PI * 2 * r.threes()[8] / 100) + (PI * 2* r.twos()[8] / 100)));
			if(j<=100000)
			j+=1000;
			if(!(g9.getx()>(1000 * r.totals()[8] / r.count())/2&&g9.getx()<10*width/11-5-(1000 * r.totals()[8] / r.count())/2))
				g9.setx(-g9.getxs());
			if(!(g9.gety()>(1000 * r.totals()[8] / r.count())/2&&g9.gety()<height-(30+1000 * r.totals()[8] / r.count())/2))
				g9.sety(-g9.getys());
			g9.move();
			fill(0,0,0);
			text("2011",(int)(g9.getx()-(j / 100 * r.totals()[8] / r.count())/4),(int)(g9.gety()+(j / 100 * r.totals()[8] / r.count())/4));
		}
		}
		if(bar)
		{
			fill(255,255,255);
			rect(width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[0] / r.count())));
			rect(2*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[1] / r.count()));
			rect(3*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[2] / r.count()));
			rect(4*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[3] / r.count()));
			rect(5*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[4] / r.count()));
			rect(6*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[5] / r.count()));
			rect(7*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[6] / r.count()));
			rect(8*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[7] / r.count()));
			rect(9*width/11-width/22+10,height-40,width/11-20,(float) (-6*height*r.totals()[8] / r.count()));
			if (t1) {
				fill(255,0,0);
				rect(width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[0] / r.count()*(r.fives()[0] / 100))));
				fill(0, 255, 0);
				rect(width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[0] / r.count())*r.fives()[0]/100),width/11-20,(float)(-6*height*(r.totals()[0] / r.count())*r.fours()[0]/100));
				fill(0, 0, 255);
				rect(width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[0] / r.count())*r.fives()[0]/100)+(float)(-6*height*(r.totals()[0] / r.count())*r.fours()[0]/100),width/11-20,(float)(-6*height*(r.totals()[0] / r.count())*r.threes()[0]/100));
				fill(255, 255, 0);
				rect(width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[0] / r.count())*r.fives()[0]/100)+(float)(-6*height*(r.totals()[0] / r.count())*r.fours()[0]/100)+(float)(-6*height*(r.totals()[0] / r.count())*r.threes()[0]/100),width/11-20,(float)(-6*height*(r.totals()[0] / r.count())*r.twos()[0]/100));
				
			}
			if (t2) {
				fill(255,0,0);
				rect(2*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[1] / r.count()*(r.fives()[1] / 100))));
				fill(0, 255, 0);
				rect(2*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[1] / r.count())*r.fives()[1]/100),width/11-20,(float)(-6*height*(r.totals()[1] / r.count())*r.fours()[1]/100));
				fill(0, 0, 255);
				rect(2*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[1] / r.count())*r.fives()[1]/100)+(float)(-6*height*(r.totals()[1] / r.count())*r.fours()[1]/100),width/11-20,(float)(-6*height*(r.totals()[1] / r.count())*r.threes()[1]/100));
				fill(255, 255, 0);
				rect(2*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[1] / r.count())*r.fives()[1]/100)+(float)(-6*height*(r.totals()[1] / r.count())*r.fours()[1]/100)+(float)(-6*height*(r.totals()[1] / r.count())*r.threes()[1]/100),width/11-20,(float)(-6*height*(r.totals()[1] / r.count())*r.twos()[1]/100));
				}
			if (t3) {
				fill(255,0,0);
				rect(3*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[2] / r.count()*(r.fives()[2] / 100))));
				fill(0, 255, 0);
				rect(3*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[2] / r.count())*r.fives()[2]/100),width/11-20,(float)(-6*height*(r.totals()[2] / r.count())*r.fours()[2]/100));
				fill(0, 0, 255);
				rect(3*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[2] / r.count())*r.fives()[2]/100)+(float)(-6*height*(r.totals()[2] / r.count())*r.fours()[2]/100),width/11-20,(float)(-6*height*(r.totals()[2] / r.count())*r.threes()[2]/100));
				fill(255, 255, 0);
				rect(3*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[2] / r.count())*r.fives()[2]/100)+(float)(-6*height*(r.totals()[2] / r.count())*r.fours()[2]/100)+(float)(-6*height*(r.totals()[2] / r.count())*r.threes()[2]/100),width/11-20,(float)(-6*height*(r.totals()[2] / r.count())*r.twos()[2]/100));
				
			}
			if (t4) {
				fill(255,0,0);
				rect(4*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[3] / r.count()*(r.fives()[3] / 100))));
				fill(0, 255, 0);
				rect(4*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[3] / r.count())*r.fives()[3]/100),width/11-20,(float)(-6*height*(r.totals()[3] / r.count())*r.fours()[3]/100));
				fill(0, 0, 255);
				rect(4*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[3] / r.count())*r.fives()[3]/100)+(float)(-6*height*(r.totals()[3] / r.count())*r.fours()[3]/100),width/11-20,(float)(-6*height*(r.totals()[3] / r.count())*r.threes()[3]/100));
				fill(255, 255, 0);
				rect(4*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[3] / r.count())*r.fives()[3]/100)+(float)(-6*height*(r.totals()[3] / r.count())*r.fours()[3]/100)+(float)(-6*height*(r.totals()[3] / r.count())*r.threes()[3]/100),width/11-20,(float)(-6*height*(r.totals()[3] / r.count())*r.twos()[3]/100));
				
			}
			if (t5) {
				fill(255,0,0);
				rect(5*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[4] / r.count()*(r.fives()[4] / 100))));
				fill(0, 255, 0);
				rect(5*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[4] / r.count())*r.fives()[4]/100),width/11-20,(float)(-6*height*(r.totals()[4] / r.count())*r.fours()[4]/100));
				fill(0, 0, 255);
				rect(5*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[4] / r.count())*r.fives()[4]/100)+(float)(-6*height*(r.totals()[4] / r.count())*r.fours()[4]/100),width/11-20,(float)(-6*height*(r.totals()[4] / r.count())*r.threes()[4]/100));
				fill(255, 255, 0);
				rect(5*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[4] / r.count())*r.fives()[4]/100)+(float)(-6*height*(r.totals()[4] / r.count())*r.fours()[4]/100)+(float)(-6*height*(r.totals()[4] / r.count())*r.threes()[4]/100),width/11-20,(float)(-6*height*(r.totals()[4] / r.count())*r.twos()[4]/100));
				
			}
			if (t6) {
				fill(255,0,0);
				rect(6*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[5] / r.count()*(r.fives()[5] / 100))));
				fill(0, 255, 0);
				rect(6*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[5] / r.count())*r.fives()[5]/100),width/11-20,(float)(-6*height*(r.totals()[5] / r.count())*r.fours()[5]/100));
				fill(0, 0, 255);
				rect(6*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[5] / r.count())*r.fives()[5]/100)+(float)(-6*height*(r.totals()[5] / r.count())*r.fours()[5]/100),width/11-20,(float)(-6*height*(r.totals()[5] / r.count())*r.threes()[5]/100));
				fill(255, 255, 0);
				rect(6*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[5] / r.count())*r.fives()[5]/100)+(float)(-6*height*(r.totals()[5] / r.count())*r.fours()[5]/100)+(float)(-6*height*(r.totals()[5] / r.count())*r.threes()[5]/100),width/11-20,(float)(-6*height*(r.totals()[5] / r.count())*r.twos()[5]/100));
				
			}
			if (t7) {
				fill(255,0,0);
				rect(7*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[6] / r.count()*(r.fives()[6] / 100))));
				fill(0, 255, 0);
				rect(7*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[6] / r.count())*r.fives()[6]/100),width/11-20,(float)(-6*height*(r.totals()[6] / r.count())*r.fours()[6]/100));
				fill(0, 0, 255);
				rect(7*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[6] / r.count())*r.fives()[6]/100)+(float)(-6*height*(r.totals()[6] / r.count())*r.fours()[6]/100),width/11-20,(float)(-6*height*(r.totals()[6] / r.count())*r.threes()[6]/100));
				fill(255, 255, 0);
				rect(7*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[6] / r.count())*r.fives()[6]/100)+(float)(-6*height*(r.totals()[6] / r.count())*r.fours()[6]/100)+(float)(-6*height*(r.totals()[6] / r.count())*r.threes()[6]/100),width/11-20,(float)(-6*height*(r.totals()[6] / r.count())*r.twos()[6]/100));
				
			}
			if (t8) {
				fill(255,0,0);
				rect(8*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[7] / r.count()*(r.fives()[7] / 100))));
				fill(0, 255, 0);
				rect(8*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[7] / r.count())*r.fives()[7]/100),width/11-20,(float)(-6*height*(r.totals()[7] / r.count())*r.fours()[7]/100));
				fill(0, 0, 255);
				rect(8*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[7] / r.count())*r.fives()[7]/100)+(float)(-6*height*(r.totals()[7] / r.count())*r.fours()[7]/100),width/11-20,(float)(-6*height*(r.totals()[7] / r.count())*r.threes()[7]/100));
				fill(255, 255, 0);
				rect(8*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[7] / r.count())*r.fives()[7]/100)+(float)(-6*height*(r.totals()[7] / r.count())*r.fours()[7]/100)+(float)(-6*height*(r.totals()[7] / r.count())*r.threes()[7]/100),width/11-20,(float)(-6*height*(r.totals()[7] / r.count())*r.twos()[7]/100));
				
			}
			if (t9) {
				fill(255,0,0);
				rect(9*width/11-width/22+10,height-40,width/11-20,(float)(-6*height*(r.totals()[8] / r.count()*(r.fives()[8] / 100))));
				fill(0, 255, 0);
				rect(9*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[8] / r.count())*r.fives()[8]/100),width/11-20,(float)(-6*height*(r.totals()[8] / r.count())*r.fours()[8]/100));
				fill(0, 0, 255);
				rect(9*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[8] / r.count())*r.fives()[8]/100)+(float)(-6*height*(r.totals()[8] / r.count())*r.fours()[8]/100),width/11-20,(float)(-6*height*(r.totals()[8] / r.count())*r.threes()[8]/100));
				fill(255, 255, 0);
				rect(9*width/11-width/22+10,height-40+(float)(-6*height*(r.totals()[8] / r.count())*r.fives()[8]/100)+(float)(-6*height*(r.totals()[8] / r.count())*r.fours()[8]/100)+(float)(-6*height*(r.totals()[8] / r.count())*r.threes()[8]/100),width/11-20,(float)(-6*height*(r.totals()[8] / r.count())*r.twos()[8]/100));
				
			}
		}
fill(255,255,255);
	text("ap computer science a test scores",width/2,40);
	}
	public void mouseReleased() {
		mous=0;
		}
}
