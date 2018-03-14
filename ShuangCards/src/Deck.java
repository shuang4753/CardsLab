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
		for (int x = 0; x < ranks.length; x++)
		{
			for (int y = 0; y < suits.length; y++)
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
	
	public static Card Deal()
	{
		while (unDealt.size()!=0)
		{
			
		}
	}
}
