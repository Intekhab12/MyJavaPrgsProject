package ApnaCollegePrac1;

public class SdetJ_MainMethodOverLoading {

	public static void main(String[] args) 
	{
		
		System.out.println("This is origional main method");
		SdetJ_MainMethodOverLoading.main(121);
		main('A');

	}
	public static void main(Integer args)   
	{   
	System.out.println("Overloaded main() method invoked that parses an integer argument");
	System.out.println(args);
	}   
	// Overloaded main() method 2   
	//invoked when a char is passed  
	public static void main(char args)   
	{   
	System.out.println("Overloaded main() method invoked that parses a char argument");
	System.out.println(args);
	}   
	
//	SdetJ_MainMethodOverLoading obj1=new SdetJ_MainMethodOverLoading();
//	obj1.main('a');
	
	

}
