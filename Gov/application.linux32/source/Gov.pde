import processing.core.PApplet;
import java.util.*;

 
  read r =new read();
  int c=0;
  int mo=0;

   void setup() {
    size(displayWidth,displayHeight);
    background(0,0,0);
    
  }
   void draw() {
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
    if (mouseX>(36*width/42)&&mouseY<1.5*height/17)
    {
      c=0;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<2.5*height/17)
    {
      c=1;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<3.5*height/17)
    {
      c=2;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<4.5*height/17)
    {
      c=3;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<5.5*height/17)
    {
      c=4;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<6.5*height/17)
    {
      c=5;
      mo=1;
    }else if (mouseX>(36*width/42)&&mouseY<7.5*height/17)
    {
      c=6;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<8.5*height/17)
    {
      c=7;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<9.5*height/17)
    {
      c=8;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<10.5*height/17)
    {
      c=9;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<11.5*height/17)
    {
      c=10;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<12.5*height/17)
    {
      c=11;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<13.5*height/17)
    {
      c=12;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<14.5*height/17)
    {
      c=13;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<15.5*height/17)
    {
      c=14;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<16.5*height/17)
    {
      c=15;
      mo=1;
    }
    else if (mouseX>(36*width/42)&&mouseY<17.5*height/17)
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


