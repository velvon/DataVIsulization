package visual;

import processing.core.PApplet;


public class Visual extends PApplet {
	int a=100;
	Read r =new Read();
	public void setup() {
		r.build();
		size(1000,625);
		
	}

	public void draw() {
		frameRate(30);
		background(0,0,0);
		fill(0,255,0);
		rect(50,600,75, (float) -(a*r.get5()/(double)r.cnt()));
		rect(150,600, 75, (float) -(a*r.get10()/(double)r.cnt()));
		rect(250,600,75, (float) -(a*r.get15()/(double)r.cnt()));
		rect(350,600,75, (float) -(a*r.get20()/(double)r.cnt()));
		rect(450,600,75, (float) -(a*r.get25()/(double)r.cnt()));
		rect(550,600,75, (float) -(a*r.get30()/(double)r.cnt()));
		rect(650,600,75, (float) -(a*r.get35()/(double)r.cnt()));
		rect(750,600,75, (float) -(a*r.get40()/(double)r.cnt()));
		rect(850,600,75, (float) -(a*r.get45()/(double)r.cnt()));
		fill(255,255,255);
		text("Ages 0-5",55,615);
		text("Ages 5-10",155,615);
		text("Ages 10-15",255,615);
		text("Ages 15-20",355,615);
		text("Ages 20-25",455,615);
		text("Ages 25-30",555,615);
		text("Ages 30-35",655,615);
		text("Ages 35-40",755,615);
		text("Ages 40-45",855,615);
		text("Ages of passengers on the ship The Princes Royal", 350,75);
		a+=10;
		if(a==1200)
			noLoop();

	}
}
