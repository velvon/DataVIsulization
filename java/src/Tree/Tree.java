package Tree;

import java.awt.Graphics;
import java.util.*;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas {
	Scanner scan = new Scanner(System.in);

	public Tree() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		

		tree(window);
		star(window);

	}

	public void tree(Graphics window) {
		int[] treeXPoints = { 400, 200, 600 };
		int[] treeYPoints = { 100, 500, 500 };
		Polygon tree = new Polygon(treeXPoints, treeYPoints, treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);

	}

	public void star(Graphics window) {
		String s = "";
		int x = 0;

		Color[][] temp = new Color[6][4];
		temp[0][0] = Color.BLUE;
		temp[1][0] = Color.ORANGE;
		temp[2][0] = Color.PINK;
		temp[3][0] = Color.MAGENTA;
		temp[4][0] = Color.YELLOW;
		temp[5][0] = Color.RED;
		temp[3][1] = Color.BLUE;
		temp[2][1] = Color.ORANGE;
		temp[5][1] = Color.PINK;
		temp[4][1] = Color.MAGENTA;
		temp[0][1] = Color.YELLOW;
		temp[1][1] = Color.RED;
		temp[4][2] = Color.BLUE;
		temp[5][2] = Color.ORANGE;
		temp[3][2] = Color.PINK;
		temp[1][2] = Color.MAGENTA;
		temp[2][2] = Color.YELLOW;
		temp[3][2] = Color.RED;
		temp[2][3] = Color.BLUE;
		temp[4][3] = Color.ORANGE;
		temp[1][3] = Color.PINK;
		temp[5][3] = Color.MAGENTA;
		temp[3][3] = Color.YELLOW;
		temp[0][3] = Color.RED;
		int[] polyx = new int[5];
		int[] polyy = new int[5];
		polyx[0] = 400;
		polyy[0] = 100;
		polyx[1] = 400 - 16;
		polyy[1] = 100 - 12;
		polyx[4] = 400 + 16;
		polyy[4] = 100 - 12;
		polyx[3] = 400 + 10;
		polyy[3] = 100 - 24;
		polyx[2] = 400 - 10;
		polyy[2] = 100 - 24;
		window.setColor(Color.YELLOW);
		window.fillPolygon(polyx, polyy, 5);
		int[] t1x = new int[3];
		t1x[0] = polyx[0];
		t1x[1] = polyx[1];
		t1x[2] = 400 - 23;
		int[] t1y = new int[3];
		t1y[0] = polyy[0];
		t1y[1] = polyy[1];
		t1y[2] = 100 + 20;
		int[] t2x = new int[3];
		t2x[0] = polyx[4];
		t2x[1] = polyx[0];
		t2x[2] = 400 + 23;
		int[] t2y = new int[3];
		t2y[0] = polyy[4];
		t2y[1] = polyy[0];
		t2y[2] = 100 + 20;
		int[] t3x = new int[3];
		t3x[0] = polyx[2];
		t3x[1] = polyx[3];
		t3x[2] = 400;
		int[] t3y = new int[3];
		t3y[0] = polyy[2];
		t3y[1] = polyy[3];
		t3y[2] = 100 - 24 - 17;
		int[] t4x = new int[3];
		t4x[0] = polyx[3];
		t4x[1] = polyx[4];
		t4x[2] = 400 + 30;
		int[] t4y = new int[3];
		t4y[0] = polyy[3];
		t4y[1] = polyy[4];
		t4y[2] = 100 - 25;
		int[] t5x = new int[3];
		t5x[0] = polyx[1];
		t5x[1] = polyx[2];
		t5x[2] = 400 - 30;
		int[] t5y = new int[3];
		t5y[0] = polyy[1];
		t5y[1] = polyy[2];
		t5y[2] = 100 - 25;
		int col = 0;
		while (true) {
			if (col == 0)
			window.setColor(Color.BLUE);
			else if(col == 1)
				window.setColor(Color.PINK);
			else if(col == 2)
				window.setColor(Color.ORANGE);
			else if(col == 3)
				window.setColor(Color.YELLOW);
			else
				window.setColor(Color.GRAY);
			window.fillPolygon(t1x, t1y, 3);

			if (col == 1)
				window.setColor(Color.BLUE);
				else if(col == 2)
					window.setColor(Color.PINK);
				else if(col == 3)
					window.setColor(Color.ORANGE);
				else if(col == 4)
					window.setColor(Color.YELLOW);
				else
					window.setColor(Color.GRAY);			
			window.fillPolygon(t5x, t5y, 3);
			if (col == 3)
				window.setColor(Color.BLUE);
				else if(col == 4)
					window.setColor(Color.PINK);
				else if(col == 0)
					window.setColor(Color.ORANGE);
				else if(col == 1)
					window.setColor(Color.YELLOW);
				else
					window.setColor(Color.GRAY);		
			window.fillPolygon(t4x, t4y, 3);
			if (col == 2)
				window.setColor(Color.BLUE);
				else if(col == 3)
					window.setColor(Color.PINK);
				else if(col == 4)
					window.setColor(Color.ORANGE);
				else if(col == 0)
					window.setColor(Color.YELLOW);
				else
					window.setColor(Color.GRAY);		
			window.fillPolygon(t3x, t3y, 3);
			if (col == 4)
				window.setColor(Color.BLUE);
				else if(col == 0)
					window.setColor(Color.PINK);
				else if(col == 1)
					window.setColor(Color.ORANGE);
				else if(col == 2)
					window.setColor(Color.YELLOW);
				else
					window.setColor(Color.GRAY);		
			window.fillPolygon(t2x, t2y, 3);

			window.setColor(temp[x][0]);
			window.fillOval(300, 400, 25, 25);
			window.fillOval(360, 200, 25, 25);
			window.setColor(temp[x][1]);
			window.fillOval(375, 150, 25, 25);
			window.fillOval(320, 325, 25, 25);
			window.setColor(temp[x][2]);
			window.fillOval(450, 275, 25, 25);
			window.fillOval(500, 400, 25, 25);
			window.setColor(Color.BLACK);
			window.fillRect(380, 500, 40, 60);
			window.setColor(Color.RED);
			window.fillRect(700, 400, 50, 160);
			window.setColor(temp[x][3]);
			window.fillOval(375, 320, 25, 25);
			window.fillOval(460, 450, 25, 25);
			window.setColor(Color.CYAN);
			window.fillRect(0,500,140,60);
			col++;
			if (col > 4)
				col = 0;
			x++;
			if (x > 5)
				x = 0;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
