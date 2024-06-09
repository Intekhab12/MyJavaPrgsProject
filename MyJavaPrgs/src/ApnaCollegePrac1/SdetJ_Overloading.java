package ApnaCollegePrac1;

public class SdetJ_Overloading {
	
/*	int a;
	int b;
	int c;
	
	//Method Overloading--Same name with different parameters---1.No.,2.Order,3.Type
	void sum() 
	{
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	void sum(int x,int y) 
	{
		a=x;
		b=y;
		System.out.println(a+b);
		
	}
	
	void sum(int x,int y,int z) 
	{
		a=x;
		b=y;
		c=z;
		System.out.println(a+b+c);
		
	}
	
	void sum(int x,double y) 
	{
		
		System.out.println(x+y);
		
	}
	

	public static void main(String[] args) 
	{
//		SdetJ_Overloading obj1=new SdetJ_Overloading();
//		obj1.sum();
		
//		SdetJ_Overloading obj1=new SdetJ_Overloading();
//		obj1.sum(20,40);
		
//		SdetJ_Overloading obj1=new SdetJ_Overloading();
//		obj1.sum(50,100,200);
		
		SdetJ_Overloading obj1=new SdetJ_Overloading();
		obj1.sum(200,2.5);*/
		
		
		
	//System.out.println("=================================================================");
		
		int a;
		int b;
		int c;
		
		//Method Overloading(Class having more than 1 methods)--Same name with different parameters---1.No.,2.Order,3.Type
		 SdetJ_Overloading() 
		{
			a=10;
			b=20;
			System.out.println(a+b);
			
		}
		 SdetJ_Overloading(int x,int y) 
		{
			a=x;
			b=y;
			System.out.println(a+b);
			
		}
		
		 SdetJ_Overloading(int x,int y,int z) 
		{
			a=x;
			b=y;
			c=z;
			System.out.println(a+b+c);
			
		}
		
		 SdetJ_Overloading(int x,double y) 
		{
			
			System.out.println(x+y);
			
		}
		

		public static void main(String[] args) 
		{
//			SdetJ_Overloading obj1=new SdetJ_Overloading();//Constructor is called as soon as we create an object(No need to call explicitly)
			
			
			
//			SdetJ_Overloading obj1=new SdetJ_Overloading(20,40);
			
			
//			SdetJ_Overloading obj1=new SdetJ_Overloading(50,100,200);
		
			
			SdetJ_Overloading obj1=new SdetJ_Overloading(200,2.5);
			
			
			

	}

}
