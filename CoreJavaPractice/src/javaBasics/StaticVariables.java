package javaBasics;

public class StaticVariables {
	
	//Instance variables - these are keep on changing based on objects instances
	String Name ;
	String Address;
	
	//As City is same for all the citizens of Bangalore community so declared it as Static.  
	//Static means the varible or method shared whole class so if one method changes the static variable value then
	//other varaible uses the already changed static value.
	
	//Static variable
	static String City = "Bangalore";  //Static saves the memory space
	static int i=0;
	
	public StaticVariables(String Name, String Address) {
		
		this.Name = Name;  //Assigning class/instance level with local variables
		this.Address = Address;
		
	}
	
	public void getAddressAndCity() {
		System.out.println(Address + " , " + City);
		System.out.println(i);
		i++;
		
	}
	
	//Creating Static Method; StaticMethod can be accessible using Classname.Methodname in main block.
	
	public static void getCity() {
		//Static method can access only Static variables
		System.out.println(City);
		System.out.println(i);
	}
	

	public static void main(String[] args) {
	
		StaticVariables obj1 = new StaticVariables("Lalit","Diamond Street");		
		StaticVariables obj2 = new StaticVariables("Ram","Golden Street");	
		obj1.getAddressAndCity();
		obj2.getAddressAndCity();
		StaticVariables.getCity();  //Static method can be accessible without creating object but just using Classname.Methodname
		
	}
	


}
