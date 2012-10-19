package arraystats;

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	
	int[] ar;
	//instance variable
	
	//constructor
	public ArrayStats(int[] temp)
	{
		ar = temp;
	}
	
	
	//set method
	public void set(int[] temp)
	{
		ar = temp;
	}
	
	public int getNumGroupsOfSize(int size)
	{
		int cnt=0;
		int count=1;
		int num = ar[0];
		for (int i =1; i<ar.length;i++)
		{
			if (count==size)
				cnt++;
			if (ar[i]==num)
			{
				count++;
			}
			else
			{
				count=1;
				num = ar[i];
			}
			
		}
		return cnt;
	}
}
