

// Your heading here!


public class RockPaperScissors
{
	private String personPlay;
	private String computerPlay;
	
	/**
	 * constructs a RockPaperScissors object with a specified play for the
	 * person playing the game.  If the specified play is invalid, the
	 * person's play will default to "R".  Randomly picks a play for the computer.
	 * @param person the person's play: R, P or S.
	 */
	public RockPaperScissors(String person)
	{
		// Assign personPlay using the parameter.  Convert it to upper case.
		person = person.toUpperCase();
		// If person is not a valid play ("R", "P", or "S"), make it "R".
		if ( person.equals("R") || person.equals("P") || person.equals("S"))
			personPlay = person;
			else
			{
				System.out.println("This is not valid. You will be playing Rock");  
				personPlay = "R";
			}
		
		int computerInt = (int)(Math.random() * 3);  // computerInt is randomly 0, 1 or 2  - not tested in this chapter
		// Use a switch statement to assign computerPlay based on the random integer generated above
		// For example, if computerInt is 0, make the computerPlay "R".  1 => "P", 2 => "S"
		
		switch(computerInt)
		{
			case 0: computerPlay = "R"; break;
			case 1: computerPlay = "P"; break;
			case 2: computerPlay = "S";
		}
	}
	
	/**
	 * returns the computer's play R, P or S
	 * @return the computer's play
	 */
	public String getComputerPlay()
	{
		return computerPlay;
	}
	
	/**
	 * returns the person's play R, P or S
	 * @return the person's play
	 */
	public String getPersonPlay()
	{
		return personPlay;
	}
	
	
	/**
	 * Returns a phrase describing the winner of the game based on
	 * the rules, for instance:
	 * "Rock crushes Scissors - computer wins!"
	 * @return the phrase describing the winner
	 */
	public String getWinner()   // uses nested if..else
	{
		String winner = "";
		
	if (computerPlay.equals("R"))
	{     
		 if(personPlay.equals("R"))
		{	
		winner= "It's a rock tie!";
		}
		
        else if (personPlay.equals("P"))
		{ 
		winner= "Paper beats rock. You win!";
			}
		else
		{
			winner = " Rock beats scissors. The computer wins!";
		}
	}
	
	else if (computerPlay.equals("P"))
	{
		 if(personPlay.equals("R"))
		{	
		winner= "Paper beats rock. You lose!";
		}
		
        else if (personPlay.equals("P"))
		{ 
		winner= "It's a paper tie!";
			}
		else 
		{
			winner = " Scissors beats paper. You win!";
	    }
	}
	
	else
	{
		if(personPlay.equals("R"))
		{	
		winner= "Rock beats scissors. You win!";
		}
		
        else if (personPlay.equals("P"))
		{ 
		winner= "Scissor beats rock. The computer wins! ";
			}
		else 
		{
			winner = " It's a scissors tie!";
	    }
		
	}
	
	return winner;
}
}
		
