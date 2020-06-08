import java.util.ArrayList;     //imports the method ArrayList to access an ArrayList which was declared in ShoppingCart.java
import java.util.Scanner;       //imports the method Scanner to take the input from the user

//Creating the Class ShoppingCartApp which has the main method
public class ShoppingCartApp {


	
	public static void main (String[] args)
	{
		//Creating an object inven for the Class ShoppingCart
		ShoppingCart inven = new ShoppingCart();
		//Creating an object input for the Scanner Class
		Scanner input = new Scanner(System.in);
		boolean c = true;                                                 // Boolean variable for while loop
		int a=0;                                                          // Counter variable
		int uniqueID=0;                                                   // Variable to store UniqueID for Item Class
		
		//Loop Starting Here
		while (c)
		{
			System.out.println("Select Options");
			System.out.printf("1. Add Item  2.Display 3.Exit : ");
			int i = input.nextInt();                                     // Reads input from the user
			switch(i)                                                    // Switch Case Start
			{
				case 1 :                                                 // if i=1 then Add Item
				{
					System.out.println("Select Item to Add");
					System.out.printf("1.Book 2.GiftCard : ");
					int j = input.nextInt();                             // Reads input from user
					if (j==1)                                            // if j=1 then Add Book
					{
						System.out.printf("Enter Book Name : ");
						String name = input.next();                      // Reads Book Name
						System.out.printf("Enter Author Name : ");
						String auth = input.next();                      // Reads Author Name
						System.out.printf("Enter Price : ");
						int p = input.nextInt();                         // Reads Price of the Book
					
						Book b1 = new Book(name,auth,p,++uniqueID);      // Creating an object b1 and calling Constructor Book in the class Book
						ShoppingCart.items.add(a,b1);                    // Storing the object b1 in the ArrayList of position a
						a++;                                             // Incrementing Counter a
						
					}
					else if(j==2)                                       // if j=2 then Add GiftCard
					{
						System.out.printf("Enter Colour : ");
						String cl = input.next();                       // Reads Colour of the GiftCard
						System.out.printf("Enter Description : ");
						String d = input.next();                        // Reads Description of the GiftCard
						System.out.printf("Enter Price : ");
						int p = input.nextInt();                        // Reads Price of the GiftCard
						
						GiftCard g1 = new GiftCard(cl,d,p,++uniqueID);  // Creating an object g1 and calling Constructor GiftCard in the class GiftCard
						ShoppingCart.items.add(a,g1);                   // Storing the object g1 in the ArrayList of position a
						a++;                                            // Incrementing Counter a
					}
					System.out.println("Items added Succesfully\n");
					break;
				}
				
				case 2 :                                                // if i=2 then Sort & Display Items in the ArrayList
				{
					System.out.println("Displaying Items : ");
					inven.sort();                                       // Sorting the ArrayList by calling the sort() method in the ShoppingCart
					inven.printList();                                  // Displaying the ArrayList by calling the printList() method in the ShoppingCart
					
					System.out.println("Total : $" +determineTotal(ShoppingCart.items));  //To print total calling determineTotal function which was in the same class
					                                       // c is updated to False, to exit from the while loop after Dsiplaying          
					break;
				}
				case 3 :                                                // if i=3 then exit
				{
					c = false;                                          // c is updated to False, to exit from the while loop
					System.out.println("Exitted Succesfully");
					break;
				}
				default :                                               // if i is other than 1,2,3 then it will print Invalid Input
				{
					System.out.println("Invalid Input");
					break;
				}
			}                                                           // End of Switch Case
		}                                                               // End of While Loop
		input.close();                                                  // Closing the Scanner method object
	}                                                                   // End of main() method
	
	//loops through every item in the list and adds the price of that item 

	public static double determineTotal(ArrayList<Item> arrayHolder)
	{
		double t = 0;
		for(Object k : arrayHolder )
		{
			t +=  ((Item)k).price;
		}
		return t;
	}
		
}
