package dog;

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood {
	private double amount;

	public DogFood() {

	}

	public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		int temp;
		for (int i = 0; i<6; i++)
		{
		temp = chopper.nextInt();
		if (temp<4)
			cups+=.5;
			else if(temp<7)
				cups+=8;
				else if(temp<9)
					cups+=12;
				else if(temp<19)
					cups+=16;
				else if(temp<39)
					cups+=28;
				else if(temp<59)
					cups+=36;
				else if(temp<79)
					cups+=48;
				else 
					cups+=60;
		}
		cups= cups/60;
		cups=Math.ceil(cups);
		System.out.println(cups + " - 10 pound bags");

		//calc code goes here
   }
}
