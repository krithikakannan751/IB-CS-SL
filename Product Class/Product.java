/**
 * @(#)Product.java
 *
 *
 * @Krithika Kannan 
 * @version 1.00 2017/10/2
 */


public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
    /** 
     *Constructs a product with an unknown name and 0.0 price
     */
    public Product() {
    	
    	name = "unknown";
    	price = 0.0;
    	quantity = 0;
    }
    
    /**
     *Constructs a product with a given name and price
     *@param productName name of the product
     *@param productPrice price of the product
     */
     public Product(String productName, double productPrice, int productQuantity){
     	
     	name = productName;
     	price = productPrice;
     	quantity = productQuantity;
     }
     
     /**
      *Gets the name of the product
      *@returns the name of the product
      */
      public String getName() {
      	return name;
      }
     
      /**
      *Gets the price of the product
      *@returns the price of the product
      */
      public double getPrice() {
      	return price;
      }
      
      /**
       *Reduces the price of the product
       *@param amountReduced amount subtracted from the price
       */
       public void reducePrice (double amountReduced){
       	price = price - amountReduced;
       }
       
       /**
        *Gets the quantity of the product
        *returns the quantity of the product
        */
       public int getQuantity(){
       	return quantity;
       }
       
       public void changeQuantity(int amountChanged){
       	quantity = quantity + amountChanged;
       }
}