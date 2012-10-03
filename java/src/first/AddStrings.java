package first;

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
	   first = "";
	   last = "";
	   sum = "";

   }

   public AddStrings(String one, String two)
   {
	 
	  setStrings( one,  two);
	   
   }

   public void setStrings(String one, String two)
   {
	   first = one;
	   last = two;
	   sum = (first + " " + last);


   }

 	public void add( )
 	{


	}

 	public String toString()
 	{
 		String output="";
 		output+= ("first :: " + first + "\n");
 		output+= ("last :: " + last + "\n");
 		output+= ("sum :: " + sum + "\n");


 		return output;
	}
}