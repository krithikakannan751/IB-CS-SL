/* your heading here */

import java.util.Scanner;
/**
 *A class to test the NumberSet class
 */
 public class NumberSetTesterBonus
{
	/**
	 * Tests the methods of the NumberSet class.
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		NumberSetBonus set1 = new NumberSetBonus(100);
		System.out.print("How many numbers in your set (up to 100)?");
		int quantity = input.nextInt();
	
		for(int i = 1; i <= quantity; i++)
		{
			System.out.print("Enter a number ==> ");
			number = input.nextInt();
			set1.addNumber(number);  
		}
		System.out.print("\nset 1:\t\t");
		System.out.println(set1);
		System.out.println("set1 sum:\t" + set1.getSum());
		System.out.println("set1 mean:\t" + set1.getMean());
		System.out.println("set1 max:\t" + set1.getMax());
		System.out.println("set1 min:\t" + set1.getMin());
		System.out.println();
		System.out.print("Enter a number to find ==> ");
		int searchNum = input.nextInt();
		if (set1.find(searchNum))
			System.out.println(searchNum + " is in the set " + set1.count(searchNum) + " times");
		else
			System.out.println(searchNum + " is not in the set");
		
	}
}