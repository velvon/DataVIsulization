package lab14d;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	
	double[] a;
	public Grades(double[] nums){
		a=nums;
	}

	//constructors
	private double getSum(){
		double sum = 0;
		for(double num:a)
		{
			sum += num;
		}
		return sum;
	}

	//make a private getSum() that returns a double

	public double getAverage(){
		double sum = this.getSum();
		double average = sum/a.length;
		return average;
	
	}

	//toString method
	public String toString(){
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
			System.out.println(this.getAverage());
			return null;
	}
}