package java1;

public class ObjectCreatio2Ways {
	
	String color; //  By using reference variable;
	int age;

	public static void main(String[] args) 
	{
		
		
		ObjectCreatio2Ways obj=new ObjectCreatio2Ways();
		obj.color="Black";  //By using reference variable
		obj.age=18;
		System.out.println(obj.color+"  "+obj.age);
		
		//--------------------------------------------------------------------------------------
		
		
		ObjectCreatio2Ways obj1=new ObjectCreatio2Ways();
		obj1.m1("White", 21); //By using method;
		obj1.m2();			 
		
		//By using Constructor in Constructor Program.
		
	

	}
	//====================================================================
	String color1;
	int age1;
	
	void m1(String c, int a) //local variable
	{
		color1=c;
		age1=a;
		
	}
	void m2()
	{
		System.out.println(color1+" "+age1);
	}

	
}
