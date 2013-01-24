package slideshow;

import processing.core.PApplet;
import processing.core.PImage;


public class Slideshow extends PApplet {
	PImage i1;
	PImage i2;
	PImage i3;
	PImage i4;
	PImage i5;
	PImage i6;
	PImage i7;
	PImage i8;
	PImage i9;
	String temp;
	String[] txt = new String[9];
	PImage[] ima= new PImage[9];
	int a =0;
	int k=0;
	public void setup() {
		size(displayWidth,displayHeight);
//		size(1020,600);
		background(255,255,255);
		i1 = loadImage("data/image1.jpg");
		i1.resize(displayWidth,displayHeight);
		i2 = loadImage("data/image2.jpg");
		i2.resize(displayWidth, displayHeight);

		i3 = loadImage("data/image3.jpg");
		i3.resize(displayWidth, displayHeight);

		i4 = loadImage("data/image4.jpg");
		i4.resize(displayWidth, displayHeight);

		i5 = loadImage("data/image5.jpg");
		i5.resize(displayWidth, displayHeight);

		i6 = loadImage("data/image6.jpg");
		i6.resize(displayWidth, displayHeight);

		i7 = loadImage("data/image7.jpg");
		i7.resize(displayWidth, displayHeight);

		i8 = loadImage("data/image8.jpg");
		i8.resize(displayWidth, displayHeight);

		i9 = loadImage("data/image9.jpg");
		i9.resize(displayWidth, displayHeight);

		temp="Prototype of scoring mechanism";
		txt[0]=temp;
		temp="Old robot frame";
		txt[1]=temp;
		temp="Scissors jack";
		txt[2]=temp;
		temp="New robot frame";
		txt[3]=temp;
		temp="Test electronics board";
		txt[4]=temp;
		temp="Test pneumatics board";
		txt[5]=temp;
		temp="Combined test board";
		txt[6]=temp;
		temp="Drivers station";
		txt[7]=temp;
		temp="New prototype of scoring mechanism";
		txt[8]=temp;
		
		
		ima[0]=i1;
		ima[1]=i2;
		ima[2]=i3;
		ima[3]=i4;
		ima[4]=i5;
		ima[5]=i6;
		ima[6]=i7;
		ima[7]=i8;
		ima[8]=i9;
			
	}

	public void draw() {
	

		
		fill(255,0,0);
		textSize(36);
		image(ima[a],0,0);
		text(txt[a],0,height-60);

		if (mousePressed)
			if (k==0)
			{
				a++;
				if (a==9)
					a=0;
				k=1;
			}
	}

public void mouseReleased()
{
	k=0;
}
}
