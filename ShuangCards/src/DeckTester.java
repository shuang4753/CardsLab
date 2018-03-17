/*
 *Author: Simon Huang
 *Date: 3/14/17 
 *Period 2
 */
public class DeckTester {

	public static void main(String[] args) {
		
		String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suits = {"Diamond" , "Club" , "Heart" , "Spades"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck unDealt = new Deck(ranks,suits,values);
		unDealt.shuffle();
		
		int i = 0;
		while (unDealt.size() > 0)
		{
			i++;
			if (i<10)
			{
				System.out.print(i + "    ");
			}
			
			if (i>=10)
			{
				System.out.print(i + "   ");
			}
			
			System.out.println(unDealt.deal());
			
		}
		
		
		/*Testing Code to see if dealt was added back to unDealt when shuffle was called
		Looked for duplicates within the two printouts
		unDealt.shuffle();
		int x = 0;
		while (unDealt.size() > 0)
		{
			x++;
			if (x<10)
			{
				System.out.print(x + "    ");
			}
			
			if (x>=10)
			{
				System.out.print(x + "   ");
			}
			
			System.out.println(unDealt.deal());
			
		}*/
	}
}
