//  Your heading here 2017!

import javax.swing.JOptionPane;
/**
 * A class to test the CoinCounter class
 */
public class CoinCounterTester
{
	/**
	 * Tests methods of the CoinCounter class by constructing an object containing your change
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		int pennies = Integer.parseInt(JOptionPane.showInputDialog("Enter quantities of pennies")); 
		int nickels = Integer.parseInt(JOptionPane.showInputDialog("Enter quantities of nickels")); 
		int dimes = Integer.parseInt(JOptionPane.showInputDialog("Enter quantities of dimes")); 
		int quarters = Integer.parseInt(JOptionPane.showInputDialog("Enter quantities of quarters")); 
	
	    
	 CoinCounter red = new CoinCounter(quarters,dimes,nickels,pennies);
	 System.out.println("Dollars:  " + red.getDollars() + "\nCents:   " + red.getCents());
	 
	}
}

