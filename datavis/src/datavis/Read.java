package datavis;

import java.io.*;

import processing.core.PApplet;
import java.util.*;
public class Read {
	PApplet p;
	Scanner scan;
	String[] temp;
	Double[] fin = new Double[72];
	{
	try{
	scan = new Scanner(new File("C:\\EclipseWorkspaces\\csse120\\New folder\\MattH\\datavis\\src\\data\\source.txt"));
	}
	catch(FileNotFoundException e){}
	}
	public Read(PApplet p1)
	{
		for (int i=0;i<72;i++)
			fin[i]=scan.nextDouble();
		p=p1;
	
	
	}
	public double[] years()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i];
		return nums;
	}
	public double[] fives()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+9];
		return nums;
	}
	public double[] fours()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+18];
		return nums;
	}
	public double[] threes()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+27];
		return nums;
	}
	public double[] twos()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+36];
		return nums;
	}
	public double[] ones()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+45];
		return nums;
	}
	public double[] totals()
	{
		double[] nums = new double[9];
		for(int i=0;i<9;i++)
		nums[i]=fin[i+63];
		return nums;
	}
	public int count()
	{
		int sum=0;
		for(double a:totals())
		sum+=(int)a;
		return sum;
	}
}
