/**
 * @(#)PartTime.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2018/3/26
 */


public class PartTime implements Payable
{
	// instance fields
	 protected String name;
	 protected double hourlyWage;
	 protected double hoursWorked;
	
	/**
	 *constructs a part time worker
	 *parameters are name, wage, and hours worked
	 */
	public PartTime(String n, double wage, double worked)
	{
		name = n;
		hourlyWage = wage;
		hoursWorked = worked;
	}
	
	// methods
	/**
	 *sets the hours worked by a part time employee
	 *@param is the number of hours worked
	 */
	public void setHours(double worked)
	{
		hoursWorked = worked;
	}
	
	/**
	 *gets the weekly paycheck for an part time employee
	 *@return is the double amount of money an employee earned
	 */
	public double getPay()
    {
    	double x = 0.0;
    	if(hoursWorked > HOURS_PER_WEEK)
    		x = (HOURS_PER_WEEK * hourlyWage) + ((HOURS_PER_WEEK - hoursWorked) * 1.5 * hourlyWage);
    	else
    		x = hoursWorked * hourlyWage;
    	return  x;
    }
    
    /**
     *gets the pay cycle for a part time employee
     *@return is the string weekly
     */
    public String getPayCycle()
    {
    	return "Weekly";
    }
    
    /**
     *gets the name of a part time employee
     *@returns the string name
     */
    public String getName()
    {
    	return name;
    }
}