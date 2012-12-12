package Lab04d;

import static java.lang.System.*;


public class Name
{
	private String name;

	public Name()
	{
		name = "";

	}

	public Name(String s)
	{
		name = s;

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		int num = name.indexOf(" ");
		return name.substring(0,num);
	}

	public String getLast()
	{
		int num = name.indexOf(" ");
		return name.substring(num);
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}