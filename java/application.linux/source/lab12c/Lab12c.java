package lab12c;

import java.util.Scanner;

public class Lab12c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers all in one line");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Scanner s = new Scanner(str);
		int temp;
		int i = 0;
		int k = 0;
		while (s.hasNext()) {
			temp = s.nextInt();
			i += temp;
			k++;
		}
		System.out.print("the average is " + i/k);
	}
}
