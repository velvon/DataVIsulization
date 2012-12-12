package fib;
import java.util.*;
public class FibonacciRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of terms");
		int test = scan.nextInt();
		Fibonacci temp =new Fibonacci();
		int[] nums = temp.run(test);
		for(int a:nums)
			System.out.println(a);
	scan.close();		
	}

}
