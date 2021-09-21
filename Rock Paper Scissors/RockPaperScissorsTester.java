
/**
 * A class to test the RockPaperScissors class
 */
import java.util.Scanner;
public class RockPaperScissorsTester
{
	/**
	 * Tests methods of the RockPaperScissors class
	 * @param args not used
	 */
    public static void main(String[] args)
    {    	
		
		// Make a Scanner object, so you can get keyboard input
		Scanner in = new Scanner(System.in);
		
		
		// Prompt the user by displaying this prompt:  Enter your play: R, P, or S ==> 
		System.out.println("Enter your play: R, P, or S");
		// read the typed play into a String variable
		String person = in.next();
		
		// Make a RockPaperScissors object, sending it the entered play.  
		// Don't worry about case sensitivity here (r or R).  That is the constructor's job
		RockPaperScissors test = new RockPaperScissors(person);
		// Print the computer's play using the getComputerPlay() method
		System.out.println ("Computer Played: " + test.getComputerPlay());
		// Print the winner statement using the getWinner() method
		System.out.println (test.getWinner());
    }
}

		

	
		



