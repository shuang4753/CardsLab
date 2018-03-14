/*
 *Author: Simon Huang
 *Date: 3/14/17 
 */
public class Card {

	private String rank;
	private String suit;
	private int pointvalue;

	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointvalue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if (this.getPointvalue()==otherCard.getPointvalue())
		{
			return true;
		}
		return false;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getPointvalue() {
		return pointvalue;
	}

	public void setPointvalue(int pointvalue) {
		this.pointvalue = pointvalue;
	}
	
	@Override
	public String toString() {
		return "This is a" + getRank() + "of" + getSuit() + "valued at" + getPointvalue();
	}
}
