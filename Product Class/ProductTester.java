/**
 * A class to test the Product class
 */
public class ProductTester
{
	/**
	 * Tests the methods of the Product class.
	 * @param args not used.
	 */
	public static void main(String[] args)
	{
		Product mystery = new Product();
		Product toaster = new Product("Toaster", 29.95, 2);
		Product juice = new Product("Orange juice", 4.18, 3);
		Product coffee = new Product("Coffee", 3.00, 1);
		
		System.out.println("Products:\t\tPrice:\t\tQuantity:");
		System.out.println("--------\t\t------      --------");
		System.out.println(mystery.getName() + "\t\t\t" + mystery.getPrice() + "\t\t\t" +mystery.getQuantity());
		System.out.println(toaster.getName() + "\t\t\t" + toaster.getPrice() + "\t\t" + toaster.getQuantity());
		System.out.println(juice.getName() + "\t" + juice.getPrice()+ "\t\t" + juice.getQuantity());
		System.out.println(coffee.getName() + "\t\t\t" + coffee.getPrice() + "\t\t\t" + coffee.getQuantity());	
	
		toaster.reducePrice(5.0);
		juice.reducePrice(-1);
		coffee.reducePrice(0.5);
		
		toaster.changeQuantity(6);
		juice.changeQuantity(7);
		coffee.changeQuantity(8);
		
		
		System.out.println("\nProducts:\t\tPrice:\t\tQuantity:");
		System.out.println("--------\t\t------      --------");
		System.out.println(mystery.getName() + "\t\t\t" + mystery.getPrice() + "\t\t\t" + mystery.getQuantity());
		System.out.println(toaster.getName() + "\t\t\t" + toaster.getPrice() + "\t\t" + toaster.getQuantity());
		System.out.println(juice.getName() + "\t" + juice.getPrice()+ "\t\t" + juice.getQuantity());
		System.out.println(coffee.getName() + "\t\t\t" + coffee.getPrice() + "\t\t\t" + coffee.getQuantity());

	}
}