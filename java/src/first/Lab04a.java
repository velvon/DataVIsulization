package first;

public class Lab04a
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		AddStrings demo2 = new AddStrings("hello","world");
		AddStrings demo3 = new AddStrings("hello","world");
		demo.add();
		System.out.println(demo);

		demo2.setStrings("jim","bob");
		demo2.add();
		System.out.println(demo2);
		                    

		demo.setStrings("computer","science");
		demo.add();
		System.out.println(demo);


		demo3.setStrings("uil","contests");
		demo3.add();
		System.out.println(demo3);
		
		
	}
}