/**
 * @(#)Payable.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2018/3/21
 */


public interface Payable 
{	
	// constant variables
	int HOURS_PER_WEEK = 40;
	int MONTHS_IN_A_YEAR = 12;
	
	// abstract methods
    double getPay();
    String getPayCycle();
    String getName();
}