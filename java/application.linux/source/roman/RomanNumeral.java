package roman;

import static java.lang.System.*;

public class RomanNumeral {
	private int number;
	private String roman = "";

	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50,
			40, 10, 9, 5, 4, 1 };

	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanNumeral(String str) {

		roman = str;

	}

	public RomanNumeral(int orig) {

		number = orig;

	}

	public void setNumber(int num) {

		number = num;

	}

	public void setRoman(String rom) {

		roman = rom;

	}

	public int getNumber() {
		number = 0;
		int i = 0;
		int cnt = 0;
		while (i < 13) {

			if (cnt + 2 <= roman.length() && roman.substring(cnt, cnt + 2).equals(LETTERS[i])) {
				number += NUMBERS[i];
				cnt += 2;
			} else if (cnt + 1 <= roman.length() && roman.substring(cnt, cnt + 1).equals(LETTERS[i])) {
				number += NUMBERS[i];
				cnt += 1;
			} else
				i++;
		}
		return number;

	}

	public String toString() {
		roman = "";
		int temp = number;
		int a = 0;

		while (temp > 0) {

			on: while (a < 13) {
				if (NUMBERS[a] <= temp) {
					temp -= NUMBERS[a];
					roman += (LETTERS[a]);
					continue on;
				}

				a++;

			}
		}

		return roman;
	}
}