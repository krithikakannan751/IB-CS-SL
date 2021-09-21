
import java.util.Scanner;
import java.io.*;
import javax.swing.JFileChooser;
/**
 * Shop is a class to model shopping using a menu-driven interface.
 */
public class Shop
{
	/**
	 * main Displays the user interface menu and calls the dispatch method until
	 * the user enters choice 0 to end their shopping session.
	 * @param args not used
	 */
	private static ShoppingCart myCart;
	public static void main(String[] args) 
    {
    	// declare a ShoppingCart object called myCart
    	myCart = new ShoppingCart();
    	
    	Scanner input = new Scanner(System.in);
		int choice;
		do
		{
			printMenu();
			choice = input.nextInt();
			input.nextLine(); // clears the buffer
			if (choice != 0)
			{
				dispatch(choice, myCart); // process their choice
			}
		
    	}
    	while(choice != 0);
		System.out.println("Thanks for shopping!");
    }

	/**
	 * dispatch receives the user entered menu choice, and the ShoppingCart.
	 * The users menu options are processed using a switch statement.
	 * @param choice the user's menu entry
	 * @param basket the shopping cart
	 */
    public static void dispatch(int choice, ShoppingCart basket)
    {
    	// declare local variables for the item name, price and quantity
    	String name;
    	double price;
    	int quantity;
    	
		Scanner input = new Scanner(System.in);
		
		switch(choice)
		{
			// Start shopping
		    case 1:
				basket.emptyCart();
				System.out.println("new shopping cart is created");
				break;
			// Add an item to the cart
		    case 2:
				System.out.println("name of the item: ");
				name = input.next();
				System.out.println("price of the item: ");
				price = input.nextDouble();
				System.out.println("quantity of the item: ");
				quantity = input.nextInt();
				basket.addItem(new Item(name,price,quantity));
				break;
			// Find an item in the cart by name
		    case 3:
				System.out.println("Enter the name of the food you want to find");
				name = input.next();
				System.out.println("you have " + basket.countItem(name) + " " + name + "(s) in your cart");
				break;
			// Print the cart contents
		    case 4:
			System.out.println(basket);
				break;
			// Remove an item from the cart
		   case 5: 
				System.out.println("Enter name of item to remove: ");
				name = input.nextLine();
				if(basket.removeItem(name))
				{
					System.out.println(name + " has been removed from your cart");
				}
				else
					System.out.println("You have no " + name + " to remove");
				
				break;
			// Check out
		   case 6: 
		   		System.out.printf("The total cost is %.2f",basket.getTotalCost());
				basket.emptyCart();
				break;
			case 7:
				try
				{
					Scanner saved = new Scanner(new File("itemList.dat"));
					while(saved.hasNext())
					{
						name = saved.nextLine();
						price = saved.nextDouble();
						quantity = saved.nextInt();
						saved.nextLine();
						basket.addItem(new Item(name,price,quantity));
					}
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
					break;
					
			case 8:
				try
				{
					PrintWriter outFile = new PrintWriter (new File("itemList.dat"));
					outFile.print(basket.saveToFile());
					outFile.close();
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
					break;
			case 9:
				basket.sortByName();
				break;
				
		   default:
				System.out.println("Sorry, invalid choice");
	    }
    }


    /**
     * Prints the menu of user options and prompts for a selection
     */
    public static void printMenu()
    {

		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Start Shopping");
		System.out.println("2: Add an item to the cart");
		System.out.println("3: Find an item in the cart by name");
		System.out.println("4: Print the cart contents");
		System.out.println("5: Remove an item from the cart");
		System.out.println("6: Check out");
		System.out.println("7: Load data");
		System.out.println("8: Save Data");
		System.out.println("9: Sort item by name");
		System.out.print("\nEnter your choice: ");
    }


}

