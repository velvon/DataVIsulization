package lab12e;

import java.util.Scanner;

public class Lab12e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println("enter numbers all in one line");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			Scanner s = new Scanner(str);
			int temp;
			int even = 0;
			int odd = 0;
			int i = 0;
			while (s.hasNext()){
			temp=s.nextInt();
			if (temp%2==0)
				even++;
			else 
				odd ++;
			
			}
			System.out.println("odd count" + odd);
			System.out.println("even count" + even);
	}

}
