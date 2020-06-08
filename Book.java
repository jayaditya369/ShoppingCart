
// A class Book which extends Item Class
public class Book extends Item{

	String bname;
	String aname;
	
	// Dummy Constructor
	Book(){
		
	}
	
	// Constructor with Arguments
	public Book(String name, String auth, int a, int uniqueID) {
		super();
		bname=name;
		aname=auth;
		super.price=a;
		super.id=uniqueID;
	}
	
	// Override toString() to print the elements in the ArrayList instead of printing the objects
	public String toString()
	{
		System.out.println("\n");
		return "\nID : "+id+", Title : "+bname+", Author : "+aname+", Price : "+price;
	}

}
