class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	
	// Instance Variables
	public String name;

	// Class Variables (Each object does not get it's own copy)  
	public static String description;
	
	
	// Determine the number of time objects are created.
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		count++;
		System.out.println("Thing one........");
		
	}
	
	// Instance methods CAN access the static data.
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
		//System.out.println(description);
	}
	
	// Static methods CANNOT output instance variables. 
	public static void shoInfo() {
		System.out.println(description);
	 
	}
}

public class App {

	public static void main(String[] args) {
	

		Thing.description = "I am a thing";

		// Access by the class 
		// Static methods can access static data because they both belong to the class. 
	
		
	    Thing.shoInfo();
	    
	    
	    System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		Thing thing3 = new Thing(); 
		
		System.out.println("After creating objects count is: " + Thing.count);
		   
		thing1.name = "Bob";
		thing2.name = "Sue";
		
	    thing1.showName();
	    thing2.showName();
	    thing3.showName();
	    
	    System.out.println(Math.PI);
	    
	    
	    System.out.println(Thing.LUCKY_NUMBER);
	    
	 
	  
	    
		
	}

}
