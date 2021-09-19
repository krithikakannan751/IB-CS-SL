/**
 * @(#)PayTester.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2018/3/26
 */
import java.util.*;
public class PayTester 
{
        
    public static void main(String[] args) 
    {
        // Declare and instantiate ArrayList of payable objects
        ArrayList<Payable> employees = new ArrayList<Payable>();
        
        // Add 5 employees
        employees.add(new Executive("Alex Thompson", 70000));	// 5833.33 Monthly
		employees.add(new PartTime("Christi Bunch", 42, 7.50));    // 315.00 weekly
		employees.add(new Executive("John Stewart ", 85000));   // 7083.33 Monthly
		employees.add(new PartTime("Robert Fulton",20, 9.25));   // 185 Weekly   
		employees.add(new Waitress("Alexa Devices", 30, 4.3, 1.23)); // 130.23 Weekly
		
		// loop that calls each employee’s getName, getPay and getPayCycle methods
		for(int i = 0; i< employees.size(); i++)
		{
			System.out.println(employees.get(i).getName() + "  " + String.format("$%10.2f",employees.get(i).getPay()) + " " + employees.get(i).getPayCycle());
		}
		
		// Adjust the hours for one hourly employee
		((PartTime)employees.get(1)).setHours(4.0);
		System.out.println("");
		for(int i = 0; i< employees.size(); i++)
		{
			System.out.println(employees.get(i).getName() + "  " + String.format("$%10.2f",employees.get(i).getPay()) + " " + employees.get(i).getPayCycle());
		}
    }
}
