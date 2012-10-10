package lab12b;

import java.util.Scanner;

public class Lab12b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers all in one line");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Scanner s = new Scanner(str);
		int temp;
		int i = 0;
		while (s.hasNext()){
		temp=s.nextInt();
		i += temp;
		}
		System.out.print("the numbers add to " + i);

		
	}

}
