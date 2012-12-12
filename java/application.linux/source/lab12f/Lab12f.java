package lab12f;
import java.util.*;
public class Lab12f {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test;
		int i;
		String teemo = " ";
		String temp = " ";
		System.out.println("enter a list of data");
		test = scan.nextLine();
		
		System.out.println("enter break number");
		i = scan.nextInt();
		sc = new Scanner(test);
		while (sc.hasNext()){
			temp = " ";
			for (int s = 0; s < i; s++)
			{
				
				
				if (sc.hasNext())
					temp+=sc.next();
					
			}
		System.out.println(temp);
	}

}
}