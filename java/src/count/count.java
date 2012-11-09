wpackage count;
import java.util.*;
public class count {
	public static void main (String args[])
	{
	System.out.println("enter numbers all in one line");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	Scanner s = new Scanner(str);
	String temp = " ";
	int i = 0;
	while (s.hasNext()){
	temp=s.next();
	i++;
	}
	System.out.print("there are " + i + " numbers");
	
}
}