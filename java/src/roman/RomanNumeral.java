package roman;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{

		roman = str;

	}

	public RomanNumeral(Integer orig)
	{

		number = orig;

	}

	public void setNumber(Integer num)
	{


		number = num;


	}

	public void setRoman(String rom)
	{

		roman = rom;

	}

	public Integer getNumber()
	{
		int i=0;
		int cnt=0;
		if (number!=0)
		return number;
		while (i<12)
		{
			
			if(cnt+2<=roman.length() && roman.substring(cnt,cnt+2)==LETTERS[i])
			{
				number+=NUMBERS[i];
				cnt+=2;
			}
			if(cnt+1<=roman.length() && roman.substring(cnt,cnt+1)==LETTERS[i])
			{
				number+=NUMBERS[i];
				cnt+=1;
			}
			i++;
		}
		return number;
			
	}

	public String toString()
	{
		int temp = number;
		if (roman != null && roman!= "")
		return roman + "\n";
		while (temp>0)
		{
			for (int a = 0; a < 12; a++)
			{
				if(NUMBERS[a]<temp)
				{
					temp -= NUMBERS[a];
					roman.concat(LETTERS[a]);
				}
				
			}
		}
			return roman;
	}
}