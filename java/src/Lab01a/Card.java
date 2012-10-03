package Lab01a;

public class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE",
			"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK",
			"QUEEN", "KING" };

	// instance variables
	String suit;
	int face;

	// constructors
	public Card(String s, int i) {
		suit = s;
		face = i;

	}

	// modifiers
	// set methods
	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int i) {
		face = i;
	}

	public String getSuit() {
		return suit;
	}

	public String getFace() {
		return FACES[face];
	}

	// accessors
	// get methods
	public String toString() {
		return (FACES[face] + suit);

	}
	// toString

}