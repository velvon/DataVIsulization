package numcount;
import java.util.*;
public class numcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		int place = 0;
		int te = 0;
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
		int[] fin = new int[10];
		for (int a: test)
		{
			fin[a]++;					
			
		}
		for (int b: fin)
		{
			System.out.println("the number of " + te + " is: " + b);
			te++;
		}
	}

}
