/* add your information below:
 *name: Krithika Kannan
 *period: 3rd period
 *year: 2018
 *
 * */
 
/**
 *A NumberSet tracks a set of integer numbers,and
 *provides accessor methods to find the sum, min, mean
 *max, to display the set, to find an element in the set,
 *and to count occurrences of a specified element.
 *The set of integers is stored in an array of specified size.
 */
 public class NumberSet
{
	// instance fields (only TWO)
	private int[] number;
	private int count;

	/**
	 * Constructs an empty NumberSet of a specified size
	 * @param size the number of elements in the set
	 */
	public NumberSet(int size)
	{
		count=0;
	    number = new int[size];
	}
		
	/**
	 * addNumber adds a number to the number set 
	 * @param num new number
	 */
	public void addNumber(int num)
	{
			number[count] = num;
			count++;
	}

	/**
	 * getMin finds the minimum value stored in the NumberSet
	 * @return the minimum value
	 * precondition:  array is full of values
	 */
	public int getMin()
	{
		int min = number[0];
		for (int i = 0; i < number.length; i++)
		{
			if (number[i] < min) 
    		{
      			min = number[i];
    		}
		}
		return min;
	}
	
	/**
	 * getMax finds the maximum value stored in the NumberSet
	 * @return the maximum value
	 * precondition:  array is full of values
	 */
	public int getMax() 
	{
  		int max = number[0];  
		for (int i=1; i<number.length; i++) 
		{
    		if (number[i] > max) 
    		{
      			max = number[i];
    		}
  		}
  		return max;
	}
	
	/** 
	 * find determines whether a specified value exists in the set.
	 * @param num the number to find
	 * @return whether the value exists
	 */
	 public boolean find(int z)
	 {
	 	for (int i = 0; i < number.length; i++) 
  		{
     			if (number[i] == z)
     			{ 
        			return true;
     			}
	 	}   
	 	return false;	
	 }
	
	/**
	 * getSum calculates the sum of the values in the set.
	 * @return the sum
	 */
	public int getSum()
	{
		int sum = 0;
		for(int y = 0; y<number.length;y++)
		{
			sum= number[y];
		}
		return sum;
	}
	
	/**
	 * getMean calculates the mean of the values in the set.
	 * @return the mean as a double
	 * precondition:  array is full of values
	 * NOTE: use the length field of the array
	 */	
	public double getMean()
	{
		int count = 0;
		int sum =0;
		for(int e : number)
		{
			sum+=e;
			count++;
		}
		return (double)sum/count;
	}	
		
	/**
	 * count counts the occurrence of a specified number within the set.
	 * @param num the number to find
	 * @return the number of times num occurs in the set
	 */
	public int count(int num)
	{
		int y=0;
		for(int e : number)
		{
			if(num == e)
			{
				y++;
			}
		}
		return y;
	}
	
	/**
	 * toString returns a String containing the values in the set on a 
	 * single line with a space between each value.
	 * @return the String version of the set
	 */
	public String toString()	
	{
	   String r = "";
       for (int i = 0; i <number.length ; i++)
       		{          
       			r += number[i]+ " ";
			}				
       return r;
	}
}