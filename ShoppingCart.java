import java.util.ArrayList;             // imports ArrayList method to create an ArrayList to store the objects
import java.util.Collections;           // imports Collections method to sort the objects with respect to price
import java.util.Comparator;            // imports Comparator method to compare the price of 2 objects in the ArrayList

//Creating a Class ShoppingCart which has an Arraylist to store the objects of different classes like Book and GiftCard
public class ShoppingCart {

	
	//Creating an ArrayList of type Item Class to store the objects
	static public ArrayList <Item> items = new ArrayList<Item>();	
	
	//Defining the method printList which prints the Arraylist
	public void printList()
	{
		System.out.println("Your Cart contains: ");
		System.out.println(items);
		
	}
	//Defining the method sort which sorts the objects in the ArrayList with respect to the variable price
	public void sort() {
		Comparator<Item> compare=(Item i1,Item i2)->i1.price().compareTo(i2.price());
		Collections.sort(items,compare);
	}
   
	
}
