/*
 *Author: Simon Huang
 *Date: 3/14/17 
 */
import java.util.ArrayList;

public class Deck {

	private static ArrayList<Card> unDealt = new ArrayList<Card>() ;
	private static ArrayList<Card> Dealt = new ArrayList<Card> (); 

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for (int x = 0; x < ranks.length-1; x++)
		{
			for (int y = 0; y < suits.length-1; y++)
			{
				unDealt.add(0, new Card(ranks[x],suits[y],values[x]));
			}
		}
	}

	public static boolean isEmpty()
	{
		if (unDealt.size()==0)
		{
			return true;
		}
		else return false;
	}

	public static int size()
	{
		return unDealt.size();
	}

	public static Card deal()
	{
			Card top = unDealt.remove(0);
			Dealt.add(top);
			
			return top;  	
	}

	public static void shuffle(Deck deck)
	{
		for (int k = 1; k < 52; k++)
		{
			int r = (int)(Math.random()*k);
			Card temp = unDealt.get(r);
			unDealt.set(r, unDealt.get(k));
			unDealt.set(r, temp);
		}

	}

	public static ArrayList<Card> getUnDealt() {
		return unDealt;
	}

	public static void setUnDealt(ArrayList<Card> unDealt) {
		Deck.unDealt = unDealt;
	}

	public static ArrayList<Card> getDealt() {
		return Dealt;
	}

	public static void setDealt(ArrayList<Card> dealt) {
		Dealt = dealt;
	}

	@Override
	public String toString() {
		return "Deck [toString()=" + super.toString() + "]";
	}
}
