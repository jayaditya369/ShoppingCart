
// A class GiftCard which extends an Item Class
public class GiftCard extends Item{

	String colour;
	String desc;
	
	// Dummy Constructor
	GiftCard(){
		
	}
	
	// Constructor with arguments
	public GiftCard(String c, String d, int p, int uniqueID) {
		super();
		colour=c;
		desc=d;
		super.price=p;
		super.id=uniqueID;
	}

	//Override toString() method to print the elements in the ArrayList instead of Objects
	public String toString()
	{
		return "ID : "+id+", Colour : "+colour+", Desc : "+desc+", Price : "+price+"\n";
	}
}
