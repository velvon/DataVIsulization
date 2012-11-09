package proc;

import java.awt.Color;
import java.awt.Font;

import processing.core.PApplet;

public class Proc extends PApplet {
Shape sh;
Shape p1;
Shape p2;
int count = 0;
int cnt1 = 0;
int cnt2 = 0;

public void setup() {
size(1000, 1000);
background(255, 255, 51);
setVisible(true);
sh = new Shape(300, 300, 20, 20, Color.YELLOW, 5, 3, this);
p1 = new Shape(20, 300, 20, 20, Color.BLUE, 1, 2, this);
p2 = new Shape(40, 300, 20, 20, Color.BLUE, 1, 2, this);
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public void draw() {

frameRate(100 + 3*count);
if (cnt1 == 10) {
noLoop();
System.out.println("Player one wins!!");
}
if (cnt2 == 10) {
noLoop();
System.out.println("Player two wins!!");
}
p2.setX(getWidth() - 40);
p2.seth((int) (getHeight() / 5));
p1.seth((int) (getHeight() / 5));
fill(255, 255, 51);
rect(0, 0, getWidth(), getHeight());
fill(0, 0, 0);
text(cnt1, 75, 75);
text(cnt2, getWidth() - 75, 75);
sh.moveAndDraw();
p1.draw(2);
p2.draw(2);
if (keyPressed)
{
if (key=='w'||key=='W')
p1.sety(p1.gety()-7);
if (key=='s'||key=='S')
p1.sety(p1.gety()+7);
if (key == CODED) {
if (keyCode == UP) {
p2.sety(p2.gety()-7);
}
if (keyCode == DOWN) {
p2.sety(p2.gety()+7);
}

}
}

if (!(sh.getX() >= 5 && sh.getX() <= getWidth() - 25)) {
if (sh.getX() < 5)
cnt2++;
else
cnt1++;
sh.setX(500);
sh.sety(500);
count = 0;
sh.setxsp(-sh.getxsp());
}
if (!(sh.gety() >= 5 && sh.gety() <= getHeight() - 25)) {
sh.setysp(-sh.getysp());

}
if (sh.getX() >= p1.getX() + 15 && sh.getX() <= p1.getX() + 25)
if (sh.gety() >= p1.gety()
&& sh.gety() <= p1.gety() + (int) (getHeight() / 5)) {
count++;
sh.setxsp(-sh.getxsp());
}
if (sh.getX() >= p2.getX() - 25 && sh.getX() <= p2.getX() - 15)
if (sh.gety() >= p2.gety()
&& sh.gety() <= p2.gety() + (int) (getHeight() / 5)) {
count++;
sh.setxsp(-sh.getxsp());
}
}
}