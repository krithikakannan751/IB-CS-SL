/**
 * @(#)Executive.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2018/3/21
 */

public class Executive implements Payable
{	
	// instance fields
	private String name;
	private double annualSalary;

	/**
	 *Constructs an executive
	 *parameters are name and annual salary
	 */
    public Executive(String n, double a) 
    {
    	name = n;
    	annualSalary = a;
    }
   
    // methods
    /**
     *gets the monthly salary of an executive
     *@return is a double value
     */
    public double getPay()
    {
    	return (double) annualSalary/ MONTHS_IN_A_YEAR;
    }
    
    /**
     *gets the pay cycle for an executive
     *@return is a string Monthly
     */
    public String getPayCycle()
    {
    	return "Monthly";
    }
    
    /**
     *gets the name of the executive
     *@return is a string
     */
    public String getName()
    {
    	return name;
    }
    
}