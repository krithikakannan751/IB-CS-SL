/* Krithika Kannan */

/****************************************************************
 * ShoppingCart.java
 *
 * A class that models a set of  Item objects.  A shopping cart has 
 * an ArrayList of items.
 *          
 ****************************************************************/
import java.util.ArrayList;
 
public class ShoppingCart
{
	// instance field
	 private ArrayList<Item> cart;

	/**
	 * Constructs an empty shopping cart
	 */
	public ShoppingCart()
	{
		cart = new ArrayList<Item>();
	}
	
	/**
	 * emptyCart removes all contents from the cart
	 */
	public void emptyCart()
	{
		cart.clear();
	}
	
	/**
	 * addItem adds a specified item to the cart
	 * @param purchase the item being added
	 */
	 public void addItem(Item x)
	 {
	 	cart.add(x);
	 }

	
	/**
	 * toString provides a String version of the shopping cart with
	 * each item on a separate line
	 * @return the String version of the cart
	 */
	public String toString()
	{
		String output= "";
		for (Item e: cart)
		{
			output +=e + "\n";
		}
		return output;
	}
	
	/**
	 * countItem returns the quantity of a specified item.
	 * If the item is not in the list, returns 0.
	 * @param purchase the item to count
	 * @return the quantity of that item or 0.
	 */
	 public int countItem(String purchase)
	 {
	 	Item itemName = new Item(purchase);
	 	for(Item e : cart)
	 	{
	 		if(e.equals(itemName))
	 		{
	 			return e.getQuantity();
	 		}
	
	 	}
	 	return 0;	
	 }
	
	
	/** 
	 * removeItem removes a specified item from the cart if it exists, and returns true.
	 * If the item does not exist in the cart, returns false.
	 * @param purchase the item to search for and remove
	 * @return whether the item was removed
	 */
	public boolean removeItem(String purchase)
	{
		Item itemName = new Item(purchase);
		if(cart.contains(itemName)){
			cart.remove(itemName);
			return true;
		}
		return false;
	}
	
	/**
	 * getTotalCost returns the total cost of all items and quantities 
	 * in the cart.
	 * @return the cost of all items.
	 */
	 public double getTotalCost()
	 {
	 	double sum =0;
	 	for(Item e : cart)
	 	{
	 		sum+=e.getPrice()*e.getQuantity();
	 	}
	 	return sum;
	 }
	
	public String saveToFile()
	{
		String out = "";
		for(Item e : cart)
			out += e.toFile() + "\n";
		return out;
	}
	
	public void sortByName()
	{
		// outside loop to control the passes
		for(int i=1; i <cart.size(); i++)
			for(int pos =0; pos<cart.size()-i; pos ++)
				if(cart.get(pos).compareTo(cart.get(pos+1)) > 0)
				{
					//swap
					Item swap = cart.get(pos);
					cart.set(pos, cart.get(pos+1));
					cart.set(pos+1,swap);
					
					
				}
	}
}
	
	
	
	
	
    