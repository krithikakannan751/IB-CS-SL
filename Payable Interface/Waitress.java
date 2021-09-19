
/**
 * @(#)Waitress.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2018/3/26
 */


public class Waitress extends PartTime
{
	// instance fields
	private double tips;
	
	/**
	 *constructs a waitress
	 *parameter is name, wage, hours worked, and tip
	 */
    public Waitress(String n, double wage, double worked, double tip) 
    {
    	super(n, wage, worked);
		tips = tip;
    }
    
    //methods
    /**
     *gets the pay of a waitress including tip
     *@return is a double number
     */
    public double getPay()
    {
    	return super.getPay() + tips;
    }
    
    /**
     *adds a new tip to the existing tip
     *@param is the double amount of tip needed to be added
     */
    public void addTip(double tip)
    {
    	 tips += tip;
    }
}