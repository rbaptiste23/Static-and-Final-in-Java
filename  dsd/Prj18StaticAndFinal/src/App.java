class Thing {
	
	// Instance Variables
	public String name;

	// Class Variables (Each object does not get it's own copy)  
	public static String description;
	
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void shoInfo() {
		System.out.println(description);
	 
	}
}

public class App {

	public static void main(String[] args) {
	

		Thing.description = "I am a thing";

		// Access by the class 
		// Static methods can access static data because they both belong to the class. 
		// Static methods CANNOT output instance variables. 
		// Instance methods CAN access the static data.
	    Thing.shoInfo();
		
		System.out.println(Thing.description);
		
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
	    thing1.showName();
	    thing2.showName();
	    
	  
	    
		
	}

}
