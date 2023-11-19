/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/
//Author: Rithvik Muthyalapati
//Date: 3/19/19
//Version 2.0
//Version Notes:
//v.2.0: I added a fourth instance of the class(technically a fourth vending machine)

public class Vendor
{
  // Fields:
  private int cost;
  private int stock;
  private int deposit;
  private int change;
  private static double totalSales = 0.0;

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor(int price, int number)// Sets cost to price and stock to the number of items
  {
    cost = price;
    stock = number;
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
  public void setStock(int number)// Stock is set to number
  {
    stock = number;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public int getStock()// Returns the number of items
  {
    return stock;
  }

  //  Adds a specified amount (int cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney(int number)// Adds money to the deposit
  {
    deposit += number;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit()// Returns deposit
  {
    return deposit;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale()// Checks if you can make a sale
  {
    if (stock > 0 && deposit >= cost) {
    	stock--;
    	change = deposit - cost;
    	deposit = 0;
    	totalSales += 0.01 * cost;    	
    	return true;
    }
    change = deposit;
    deposit = 0;
    return false;
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  public int getChange()// Returns change
  {
    return change;
  }
  
  public static double getTotalSales() {// Returns the amount of money earned before stock reset
	  double sales = totalSales;
	  totalSales = 0.0;
	  return sales;
  }
  
}
