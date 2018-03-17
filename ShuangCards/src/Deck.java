/*
 *Author: Simon Huang
 *Date: 3/14/17 
 *Period 2
 */
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> unDealt = new ArrayList<Card>() ;
	private ArrayList<Card> Dealt = new ArrayList<Card> (); 

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for (int x = 0; x < ranks.length; x++)
		{
			for (int y = 0; y < suits.length; y++)
			{
				unDealt.add(0, new Card(ranks[x],suits[y],values[x]));
			}
		}
	}

	public boolean isEmpty()
	{
		if (unDealt.size()==0)
		{
			return true;
		}
		else return false;
	}

	public int size()
	{
		return unDealt.size();
	}

	public  Card deal()
	{
		if (!(unDealt.isEmpty()))
		{
			Card top = unDealt.remove(0);
			Dealt.add(top);
			return top; 
		}

		else return null;

	}

	public void shuffle()
	{
		unDealt.addAll(getDealt());
		
		for (int k = 1; k < 52; k++)
		{
			int r = (int)(Math.random()*k);
			Card temp = unDealt.get(r);
			unDealt.set(r, unDealt.get(k));
			unDealt.set(k, temp);
		}

	}

	public ArrayList<Card> getUnDealt() {
		return unDealt;
	}

	public void setUnDealt(ArrayList<Card> unDealt) {
		this.unDealt = unDealt;
	}

	public ArrayList<Card> getDealt() {
		return Dealt;
	}

	public void setDealt(ArrayList<Card> dealt) {
		this.Dealt = dealt;
	}

}
