import processing.core.*; 
import processing.data.*; 
import processing.opengl.*; 

import processing.core.PApplet; 
import java.util.*; 
import java.util.*; 
import java.io.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Gov extends PApplet {




 
  read r =new read();
  int c=0;
  int mo=0;

   public void setup() {
    size(displayWidth,displayHeight);
    background(0,0,0);
    
  }
   public void draw() {
    background(0,0,0);
    int b=0;
    ArrayList<String> temp = r.dat();
    fill(255,255,255);
    for(String a: temp)
    {
      if (b%2==0)
      text(a,(b+1)*width/42,height-20);
      if (b%2==1)
        text(a,(b+1)*width/42,height-40);
      b++;
    }
    fill(255,0,255);
    for (int i=0;i<35;i++)
    {
      rect((1+i)*width/42,height-50,width/43,-(height-50)*(r.num()[i][c])/100);
    }
    String[] temp2 = r.nam();
    int o=1;
    fill(0,255,0);
    for (String m: temp2)
    {
      text(m,36*width/42,o*height/17);
      o++;
    }
    fill(255,255,255);
    text(r.nam()[c],width/3,height/20);
    if (mousePressed&&mo==0)
    {
    if (mouseX>(36*width/42)&&mouseY<1.5f*height/17)
    {
      c=0;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<2.5f*height/17)
    {
      c=1;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<3.5f*height/17)
    {
      c=2;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<4.5f*height/17)
    {
      c=3;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<5.5f*height/17)
    {
      c=4;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<6.5f*height/17)
    {
      c=5;
      mo=1;
    }else if (mouseX>(36*width/42)&&mouseY<7.5f*height/17)
    {
      c=6;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<8.5f*height/17)
    {
      c=7;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<9.5f*height/17)
    {
      c=8;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<10.5f*height/17)
    {
      c=9;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<11.5f*height/17)
    {
      c=10;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<12.5f*height/17)
    {
      c=11;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<13.5f*height/17)
    {
      c=12;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<14.5f*height/17)
    {
      c=13;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<15.5f*height/17)
    {
      c=14;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<16.5f*height/17)
    {
      c=15;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<17.5f*height/17)
    {
      c=16;
      mo=1;
    }
    mo=1;
  }
    fill(0,255,0);
    text("50%",0,(height-50)/2);
    text("25%",0,(height-50)/4*3);
    text("75%",0,(height-50)/4);

    }
  public void mouseReleased(){
    mo=0;
  }





class read {
  int[][] nums = new int[35][16];
  String[] names = new String[16];
  ArrayList<String> dates = new ArrayList<String>();
  Scanner scan;
  String temp;
  int a = 0;
  int b = 0;

  read() {
    try {
      scan = new Scanner(
          new File(
              "C:\\EclipseWorkspaces\\csse120\\New folder\\gov\\src\\data\\inst.txt"));
    } catch (Exception e) {
      System.out.println(e);
    }
    scan.useDelimiter("  ");

    while (scan.hasNext()) {

      if (a % 17 == 0) {
        dates.add(0,scan.nextLine());

        // System.out.println("1");
      } else {
        temp = scan.nextLine();
        if (!(temp.equals("--"))) {

          nums[34-(a / 17)][a % 17 - 1] = Integer.valueOf(temp);

          // System.out.println("2");
        }

      }

      a++;
    }
    names[0] = "The church";
    names[1] = "The Military";
    names[2] = "The U.S. Supreme Court";
    names[3] = "Banks";
    names[4] = "The public schools";
    names[5] = "Newspapers";
    names[6] = "Congress";
    names[7] = "Television News";
    names[8] = "Organized labor";
    names[9] = "The Presidency";
    names[10] = "The police";
    names[11] = "The Medical system";
    names[12] = "The criminal justice system";
    names[13] = "Big business";
    names[14] = "Small business";
    names[15] = "Health Maintenance Organizations";

    int d = 0;
    for (String k : dates) {
      dates.set(d, k.substring(0, 4));
      d++;
    }
  }

  public int[][] num() {
    return nums;
  }

  public ArrayList<String> dat() {
    return dates;
  }

  public String[] nam() {
    return names;

  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "Gov" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
