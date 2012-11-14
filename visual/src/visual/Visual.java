package visual;

import processing.core.PApplet;


public class Visual extends PApplet {
	int a=100;
	Read r =new Read();
	public void setup() {
		r.build();
		size(1400,625);
		background(0,0,0);
//		ellipse(1175,325, 300,300);
		fill(255,255,255);
		text("Guardian Institution",1005,595);
		text("Guardian Asylum",1005,575);
		text("Workhouse",1005,555);
		text("London Penitentiary",1005,535);
		text("Other",1005,515);
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
		rect(950,getHeight(),5,-getHeight());
		text("Where the passengers are from", 1100, 75);
	}

	public void draw() {
		frameRate(30);
		
		fill(0,255,0);
		rect(50,600,75, (float) -(a*r.getnum()[0]/(double)r.cnt()));
		rect(150,600, 75, (float) -(a*r.getnum()[1]/(double)r.cnt()));
		rect(250,600,75, (float) -(a*r.getnum()[2]/(double)r.cnt()));
		rect(350,600,75, (float) -(a*r.getnum()[3]/(double)r.cnt()));
		rect(450,600,75, (float) -(a*r.getnum()[4]/(double)r.cnt()));
		rect(550,600,75, (float) -(a*r.getnum()[5]/(double)r.cnt()));
		rect(650,600,75, (float) -(a*r.getnum()[6]/(double)r.cnt()));
		rect(750,600,75, (float) -(a*r.getnum()[7]/(double)r.cnt()));
		rect(850,600,75, (float) -(a*r.getnum()[8]/(double)r.cnt()));
		fill(255,255,255);
		
		fill(245,255,230);
		if(mouseX>1005&&mouseX<1100&&mouseY>495&&mouseY<594)
		cursor(HAND);
		else
			cursor(ARROW);
		rect(975,500,15,15);
		if (mousePressed == true)
			if(mouseX>1005&&mouseX<1100&&mouseY>495&&mouseY<514)
				arc(1175,325,300,300,(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt())+(2*PI*r.geta()[3]/r.cnt()),2*PI);
		fill(0,255,0);

		if (mousePressed == true)
			if(mouseX>1005&&mouseX<1100&&mouseY>515&&mouseY<534)
				arc(1175,325,300,300,0,2*PI*r.geta()[0]/r.cnt());
		rect(975,520,15,15);
		
		fill(255,0,0);
		if (mousePressed == true)
			if(mouseX>1005&&mouseX<1100&&mouseY>535&&mouseY<554)
		arc(1175,325,300,300,2*PI*r.geta()[0]/r.cnt(),(2*PI*r.geta()[0]/r.cnt())+2*PI*r.geta()[1]/r.cnt());
		rect(975,540,15,15);
	
		fill(0,0,255);
		if (mousePressed == true)
			if(mouseX>1005&&mouseX<1100&&mouseY>555&&mouseY<574)
		arc(1175,325,300,300,(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt()),(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt()));
		rect(975,560,15,15);
		fill(255,255,0);
		if (mousePressed == true)
			if(mouseX>1005&&mouseX<1100&&mouseY>575&&mouseY<594)
		arc(1175,325,300,300,(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt()),(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt())+(2*PI*r.geta()[3]/r.cnt()));
		rect(975,580,15,15);
		
//		fill(0,255,255);
//		arc(1175,325,300,300,(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt())+(2*PI*r.geta()[3]/r.cnt()),(2*PI*r.geta()[0]/r.cnt())+(2*PI*r.geta()[1]/r.cnt())+(2*PI*r.geta()[2]/r.cnt())+(2*PI*r.geta()[3]/r.cnt())+(2*PI*r.ser()/r.cnt()));
		
		if(a!=1200)
		a+=10;
		

	}
}
