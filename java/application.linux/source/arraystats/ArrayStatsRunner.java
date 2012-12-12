package arraystats;

import java.util.Scanner;

public class ArrayStatsRunner
{
	public static void main(String[] args)
	{
		int count=0;
		int place=0;
		Scanner scan =new Scanner(System.in);
		String temp = "";
		System.out.println("enter numbers with spaces");
		temp = scan.nextLine();
		Scanner sc = new Scanner(temp);
		while (sc.hasNext())
		{
			sc.next();
			count++;
		}
		int[] test = new int[count];
		Scanner t=new Scanner(temp);
		while (t.hasNext())
		{
			int num = t.nextInt();
			test[place]=num;
			place++;
		}
		ArrayStats runner = new ArrayStats(test);
		System.out.println("enter the number to test");
		int a = scan.nextInt();
		System.out.println(runner.getNumGroupsOfSize(a));
	
		
	}

}