// Your heading here 2017 IB SL !!

/**
 * A class to test the Sentence class practicing String Methods
 */
 import java.util.Scanner;

public class SentenceTester
{
	/**
	 * Tests methods of the Sentence class
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// Create Scanner object called in, Prompt for and read in a sentence.
		Scanner input = new Scanner(System.in);
		
		// Create a new Sentence object called phrase using the sentence you read in.
		Sentence phrase = new Sentence(input.nextLine());
		
		
		System.out.println("\nThere are " + phrase.characterCount() + " characters in the sentence.");
		
		System.out.println("The first word is "+ phrase.firstWord() );
		
		System.out.println("The last word is " + phrase.lastWord() + "\n");
		
		System.out.print("Enter a word to search for: ");
		String word = input.next();
		int index = phrase.findWord(word);
		
		if (index >= 0)
			System.out.println(word + " is in the sentence at index " + index);
		else
			System.out.println(word + " is not in the sentence.");
	
		System.out.print("\nEnter a word to insert as 2nd word: ");
		word = input.next();
		String res = phrase.insertSecondWord(word);
		
		System.out.println("The sentence is now: " + res );
	}
}