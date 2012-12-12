package lab14b;

import java.util.Arrays;

import lab12a.ArrayFunHouse;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println(ArrayFunHouseTwo.goingUp(one));
		System.out.println(ArrayFunHouseTwo.goingDown(one));
		System.out.println(ArrayFunHouseTwo.getCountValuesBiggerThanX(one,4,5));
		
	}
}