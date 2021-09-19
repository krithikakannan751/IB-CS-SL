//*** your heading here!  Make no other changes to this class

/**
 *A class to test the Numbers class
 */
 public class NumberSetTester
{
	/**
	 * Tests the methods of the Numbers class.
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		NumberSet set1 = new NumberSet();
		set1.addNumber(32);
		set1.addNumber(3);
		set1.addNumber (25);
		System.out.println("set1 sum: " + set1.getSum());
		System.out.println("set1 mean: " + set1.getMean());
		System.out.println("set1 max: " + set1.getMax());
		System.out.println("set1 min: " + set1.getMin());
		System.out.println();
		
		set1.addNumber(85);
		set1.addNumber(58);
		System.out.println("set1 sum: " + set1.getSum());
		System.out.println("set1 mean: " + set1.getMean());
		System.out.println("set1 max: " + set1.getMax());
		System.out.println("set1 min: " + set1.getMin());
		System.out.println();
		
		NumberSet set2 = new NumberSet();
		set2.addNumber(8);
		set2.addNumber(6);
		set2.addNumber(4);
		set2.addNumber(2);
		System.out.println("set2 sum: " + set2.getSum());
		System.out.println("set2 mean: " + set2.getMean());
		System.out.println("set2 max: " + set2.getMax());
		System.out.println("set2 min: " + set2.getMin());
	}
}