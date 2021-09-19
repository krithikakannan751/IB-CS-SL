/**
 *NOTE:  Experienced programmers should NOT use if statements in 
 *this lab EXCEPT as specifically noted in the bonus instructions.
 *
 *You must use Math.min and Math.max to determine the min and max.
 *
 *You must use shortcuts (++, +=, /=, etc wherever possible).
 *
 *A NumberSet tracks the sum, mean, max and min of a set
 *of positive integer numbers.
 */
 public class NumberSet
{
	// class constants for lower bound and upper bound
	public static final int MAX_VALUE = 10000;
	public static final int MIN_VALUE = 0;

	// instance fields
	private int min;
	private int max;
	private int sum;
	private int count;

	/**
	 * Constructs an empty NumberSet
	 */
	public NumberSet()
	{
	min = MAX_VALUE;
	max = MIN_VALUE;
	sum = 0;
	count = 0;
	
	}
	
	/**
	 * Adds a number to the number set and updates instance fields
	 * @param num new number
	 */
	public void addNumber(int num)
	{
		sum += num;
		count ++;
		min = Math.min(num, min);
		max = Math.max(num,max);		
	}

	/**
	 * Adds a number to the number set and updates instance fields
	 * @return min
	 */
	public int getMin()
	{
		return min;
	}

	/**
	 * Adds a number to the number set and updates instance fields
	 * @return max
	 */
	public int getMax()
	
	{
		return max;
	}

	/**
	 * gets the sum
	 * @return sum
	 */
	public int getSum()
	{
		return sum;
	}

	/**
	 * Divides sum by count
	 * @return mean
	 */
	public double getMean()
	{	
	   return (double) sum/count;
	}


}