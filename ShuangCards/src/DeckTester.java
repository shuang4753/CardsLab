import java.util.ArrayList;

public class DeckTester {

	public static void main(String[] args) {
		
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Diamond" , "Club" , "Heart" , "Spades"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck unDealt = new Deck(ranks,suits,values);
		System.out.print(unDealt);
	}
	
}
