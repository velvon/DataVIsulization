package pirate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Pirate {

	private static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {

		scan = new Scanner(new File("data/source.txt"));
		String str = " ";
		String teemo = " ";

		while (scan.hasNext()) {
			str = scan.next();
		
			
			if (str.equalsIgnoreCase("hello"))
				if (str.charAt(0) == 'H')
					str = "Ahoy";
				else
					str = "ahoy";
			if (str.equalsIgnoreCase("hi"))
				if (str.charAt(0) == 'H')
					str = "Yo-ho-ho";
				else
					str = "yo-ho-ho";
			if (str.equalsIgnoreCase("my"))
				if (str.charAt(0) == 'M')
					str = "Me";
				else
					str = "me";
			if (str.equalsIgnoreCase("friend"))
				if (str.charAt(0) == 'F')
					str = "Bucko";
				else
					str = "bucko";
			if (str.equalsIgnoreCase("sir"))
				if (str.charAt(0) == 'S')
					str = "Matey";
				else
					str = "matey";
			if (str.equalsIgnoreCase("miss"))
				if (str.charAt(0) == 'M')
					str = "Pround beauty";
				else
					str = "proud beauty";
			if (str.equalsIgnoreCase("stranger"))
				if (str.charAt(0) == 'S')
					str = "Scurvy dog";
				else
					str = "scurvy dog";
			if (str.equalsIgnoreCase("officer"))
				if (str.charAt(0) == 'O')
					str = "Foul blaggart";
				else
					str = "foul blaggart";
			if (str.equalsIgnoreCase("where"))
				if (str.charAt(0) == 'W')
					str = "Whar";
				else
					str = "whar";
			if (str.equalsIgnoreCase("is"))
				if (str.charAt(0) == 'I')
					str = "Be";
				else
					str = "be";
			if (str.equalsIgnoreCase("the"))
				if (str.charAt(0) == 'T')
					str = "Th'";
				else
					str = "th'";
			if (str.equalsIgnoreCase("you"))
				if (str.charAt(0) == 'Y')
					str = "Ye";
				else
					str = "ye";
			if (str.equalsIgnoreCase("old"))
				if (str.charAt(0) == 'O')
					str = "Barnicle covered";
				else
					str = "barnicle covered";
			if (str.equals("!") || str.equals("?") || str.equals(".")) {
				if (Math.random() < .5)
					str = "Arrr!";
			}

			teemo+= str;
			teemo += " ";

		}
		System.out.println(teemo);
	}
}
