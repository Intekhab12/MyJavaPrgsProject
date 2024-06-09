package practiceJavaProgs;

public class Array_EvenOdd {

	public static void main(String[] args) 
	{
		int ar[]= {2,3,4,5,6};
		
		int len=ar.length;
		
		int evencount=0;
		int oddcount=0;
		
		System.out.print("Even No. are : ");
		for(int i=0;i<len;i++)
		{
			if(ar[i]%2==0)
			{
				evencount++;
				System.out.print(" "+ar[i]);
			}
		}	
		System.out.print("\nEven Count="+evencount);	
		System.out.print("\nOdd No. are : ");
			for(int i=0;i<len;i++)
			{
				if(ar[i]%2!=0)
				{
					oddcount++;
					System.out.print(" "+ar[i]);
				}
			
			}
			System.out.print("\nOdd Count="+oddcount);

//		System.out.println(ar[i]);
		
		
//System.out.println(ar[i]);

	}

}
