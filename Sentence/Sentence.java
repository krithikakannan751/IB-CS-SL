
/**
 *A Sentence provides information about the contents of a sentence.
 */
 public class Sentence
{
	// instance field (only one)
	private String sentence;


	/**
	 * Constructs a Sentence object with a given String
	 * @param s the sentence
	 */
	public Sentence(String phrase)
	{
		sentence = phrase;
	}
	
	// add the remaining methods as described in the assignment
	public int characterCount()
	{
		return sentence.length();
	}
	
	public String firstWord()
	{
		return sentence.substring(0,sentence.indexOf(" "));
	}
	
	public String lastWord()
	{
		return sentence.substring(sentence.lastIndexOf(" ")+1,sentence.length());
	}
	
	public int findWord(String newWord)
	{
		return sentence.indexOf(newWord);
	}
	public String insertSecondWord(String secondWord)
	{
		return firstWord() + " " + secondWord + sentence.substring(sentence.indexOf(" "));
	}
	public String getSentence()
	{
		return sentence;
	}
}
