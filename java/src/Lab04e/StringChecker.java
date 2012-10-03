package Lab04e;

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{

word = " ";
	}

	public StringChecker(String s)
	{
word = s;

	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c)!=-1)
	return true;

	return false;
	}

	public boolean findSubString(String s)
	{
		if (word.indexOf(s)!=-1)
			return true;



		return false;
	}

 	public String toString()
 	{
 		return word;
	}
}