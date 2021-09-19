// Coin Counter

/**
 * A CoinCounter has a specific number of cents.  It can provide the number of dollars and the
 * number of cents that it contains
 */
 public class CoinCounter
 {
 	// constants for coin values 
 	
 	public final int QUARTER_VALUE = 25;
 	public final int DIME_VALUE = 10;
 	public final int NICKEL_VALUE = 5;
 	
 	// instance field (one - holds the total number of cents EX:  8,534)
 	private int total;
 	
 	/**
 	 * Constructs a CoinCounter object with a specified number of pennies, 
 	 * nickels, dimes and quarters
 	 * @param num quarters
 	 * @param num dimes
 	 * @param num nickels
 	 * @param num pennies
 	 */
 	public CoinCounter( int quarter, int dime, int nickel, int penny)
 	{
 		total = (QUARTER_VALUE*quarter) + (DIME_VALUE*dime) + (NICKEL_VALUE* nickel) + penny;
 	}
 	
 	// add remaining methods as described
 	
 	/**
 	 * divides total by 100
 	 *@return dollars
 	 */
 	
 	public int getDollars()
 	{
 		return (int) total/100;
 	}
 	
 	/**
 	 *finds the modulus of the toatl divided by 100
 	 * @return cents
 	 */
 	public int getCents()
 	{
 		return (int) total%100;
 	}
 }