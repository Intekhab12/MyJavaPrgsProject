package ApnaCollegePrac1;

public class SdetJ_ClassObj {
	
	int empid;
	String empname;
	int empsal;
	int empdeptno;
	
	//This constructor is used for initializing the instance/class variables
//	ParcJava1_ClassObj_Employee(int eid,String ename,int esal,int edno)
//	{
//		//this.empid=empid;
//		empid=eid;
//		empname=ename;
//		empsal=esal;
//		empdeptno=edno;
//		
//	}
	
	//Here This method is used for initializing the instance/class variables
		void m1(int eid,String ename,int esal,int edno) //taking parameter and not returning any value
		{
			//this.empid=empid;
			empid=eid;
			empname=ename;
			empsal=esal;
			empdeptno=edno;
			
		}
	
	void dispaly()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(empdeptno);
	}
	
	

	public static void main(String[] args) 
	{
//		ParcJava1_ClassObj_Employee obj1=new ParcJava1_ClassObj_Employee();
		
		//Assigning values to class variables using object----Method 1
//		obj1.empid=101;
//		obj1.empname="Aaa";
//		obj1.empsal=100000;
//		obj1.empdeptno=4001;
//		obj1.dispaly();
		
		//Assigning values to class variables using constructor-----Method 2
//		ParcJava1_ClassObj_Employee obj1=new ParcJava1_ClassObj_Employee(201,"AAA",200000,5001);
//		obj1.dispaly();
//		
//		ParcJava1_ClassObj_Employee obj2=new ParcJava1_ClassObj_Employee(202,"BBB",400000,5002);
//		obj2.dispaly();
		
		//Assigning values to class variables using method-----Method 3
		SdetJ_ClassObj obj1=new SdetJ_ClassObj();
		obj1.m1(301,"CCC", 50000, 4011);
		obj1.dispaly();
	}

}
