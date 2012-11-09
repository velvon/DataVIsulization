package visual;

import java.io.*;
import java.util.*;

public class Read {
	String st = " ";
	int count=0;
	int[] pas = new int[9];
	Scanner scan;
	
	public Read() {
		{
			try {
				scan = new Scanner(new File("data/list.txt"));
			} catch (FileNotFoundException e) {
			}
		}

	}
	public int cnt()
	{
		count=0;
		for(int a: pas)
			count+=a;
		return count;
	}

	public void build() {
	
		
		int temp=0;
	
		while(scan.hasNext())
		{
			if (scan.hasNextInt())
			{
				temp = scan.nextInt();
			
		if (temp<5)
				pas[0]++;
		else if (temp<10)
			pas[1]++;
		else if (temp<15)
			pas[2]++;
		else if (temp<20)
			pas[3]++;
		else if (temp<25)
			pas[4]++;
		else if (temp<30)
			pas[5]++;
		else if (temp<35)
			pas[6]++;
		else if (temp<40)
			pas[7]++;
		else if (temp<45)
			pas[8]++;
		}
			else
				scan.next();
		}

	}
	public int get5()
	{
		return pas[0];
	}
	public int get10()
	{
		return pas[1];
	}
	public int get15()
	{
		return pas[2];
	}
	public int get20()
	{
		return pas[3];
	}
	public int get25()
	{
		return pas[4];
	}
	public int get30()
	{
		return pas[5];
	}
	public int get35()
	{
		return pas[6];
	}
	public int get40()
	{
		return pas[7];
	}
	public int get45()
	{
		return pas[8];
	}
}
