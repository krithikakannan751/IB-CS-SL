/* Krithika Kannan */
/* Add javadocs!!!!*/
/** 2018 **/

public class Item 
{
    // instance fields   
    private String name;
    private double price;
    private int quantity;


	/**
	 * Constructs an empty Item of a specified size
	 * @param size the number of elements in the set
	 */
    public Item (String itemName, double itemPrice, int numPurchased)
    {
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
    }

	/**
	 * getPrice returns the price of the item 
	 * @return the double data type
	 */
    public double getPrice()
    {
		return price;
    }

    /**
	 * getName returns the name of the item
	 * @return the String data type
	 */
    public String getName()
    {
		return name;
    }

  	 /**
	 * getQuantity returns the quantity of the item
	 * @return the int data type
	 */
    public int getQuantity()
    {
		return quantity;
    }
    
     //incomplete methods
     
     /**
	 * toString returns a String containing the values in the set on a 
	 * single line with a space between each value.
	 * @return the String version of the set
	 */
      public String toString()
      {
      return name + " " + "$" + price + " " + quantity + " " + "$" + price*quantity + "\n";
      }
     
     /**
	 * equals returns if name equals other name
	 * @return a boolean value
	 */
     public boolean equals (Object o)
      {
      	Item other = (Item) o;
      	return name.equals(other.name);
      }
     
   	 /**
	 * Constructs an empty Item of a specified size
	 * @param size the number of elements in the set
	 */
      public Item(String itemName)
      {
      	name = itemName;
      }
     
     /**
	 * compareTo compares name to other name
	 * @return an integer value
	 */
      public int compareTo (Object o)
      {
      	Item other = (Item)o;
      	return name.compareTo(other.name);
      }
      
      public String toFile()
      {
      	return name + "\n" + price + "\n" + quantity ;
      }
     
}
