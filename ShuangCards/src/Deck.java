/*
 *Author: Simon Huang
 *Date: 3/14/17 
 */
import java.util.ArrayList;

public class Deck {

	private static ArrayList<Card> unDealt; //arraylist of all the cards in the deck
	private static ArrayList<Card> Dealt; 
	//arraylist to hold all the cards that have been drawn, then shuffle back in
	
	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for (int x = 0; x < ranks.length-1; x++)
		{
			for (int y = 0; y < suits.length-1; y++)
			{
				unDealt.add(new Card(ranks[x],suits[y],values[x]));
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
	
	public static void shuffle()
	{
		for (int k = 1; k < 52; k++)
		{
			int r = (int)(Math.random()*k);
			Card temp = unDealt.get(r);
			unDealt.set(r, unDealt.get(k));
			unDealt.set(r, temp);
		}
		
	}
}
