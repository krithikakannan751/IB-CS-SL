import java.util.ArrayList;

public class Bank
{
	public ArrayList<BankAccount> accounts;
	
	/**
	 * Constructs a Bank object with no accounts

	 */
	public Bank()
	{
		accounts = new ArrayList<BankAccount>(); // all null
	}
	
	/**
	 * Adds a new BankAccount to accounts.  
	 * @param b the BankAccount to add
	 */
	public void addAccount(BankAccount b)
	{
		accounts.add(b);
	}

	public String toString()
	{
		String output = "";
		for(BankAccount b: accounts)
			output += b + "\n";
		return output;
	}
	
	public BankAccount get(int index)
	{
		return accounts.get(index);
	}
	
	/**
	 * Uses the BankAccount compareTo method to sort ascending by account number
	 * Use ANY of the 3 quadratic sorts: Insertion sort
	 */
	public void sortAscending() 
	{
		int index;
		BankAccount key;
		int position;
  		for (index = 1; index < accounts.size(); index++)     
			  {
				    key = accounts.get(index);                             
				    position = index;                                
				    while (position > 0 && key.compareTo(accounts.get(position - 1))<0)  
					    {
					      accounts.set(position,accounts.get(position - 1));        
					      position--;                                     
					    }
				    accounts.set(position,key);                          
			  }
	}
	
	/**
	 * Sorts the account descending by name
	 * USE A DIFFERENT quadratic SORT than you used in sortAscending: Selection sort
	 * CANNOT use BankAccount compareTo
	 */
	public void sortDescending()
	{
		int minIndex;
		int length;
		BankAccount temp;
		int i;
  		length = accounts.size();
  		for (int startIndex = 0; startIndex < length-1; startIndex++) 
			  {
			    minIndex = startIndex;                     
			    for (i = startIndex + 1; i < length; i++)  
			      	if (accounts.get(i).getName().compareTo(accounts.get(minIndex).getName())>0) 
			       			minIndex = i;
			
			    // min was found, now swap .  
			    // This is swapping starting at index 0 on first pass, 1 on 2nd pass
			    temp = accounts.get(startIndex);
			    accounts.set(startIndex, accounts.get(minIndex));
			    accounts.set(minIndex,temp);
			  }
	}
	

	/**
	 * uses a binary search to find the index of the account with the 
	 * specified account number
	 * @param number the account number to search for
	 * @return the index of the account or -1 if it does not exist
	 */
	public int search(String number)
	{
		boolean found = false;
		int lo = 0;                                       
		int hi = accounts.size()-1;
		int mid = 0;
		while (accounts.get(lo).compareTo(accounts.get(hi))<=0 && !found)     
			{
				mid = (lo + hi) / 2;              
				if (accounts.get(mid).getNumber().equals(number))	   
					found = true;
				else                                       
					{                                            
						if (number.compareTo(accounts.get(mid).getNumber())>0)
							lo = mid + 1;
						else
							hi = mid - 1;
					}
			}   
		if (found)
			return mid;
		else
			return -1;
	}
}