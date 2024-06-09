package ApnaCollegePrac1;

public class Array_SumofElements {

	public static void main(String[] args) 
	{
		int ar[]= {2,3,4,6};
		
		int len=ar.length;
		
		int s=0;
		
		for(int i=0;i<len;i++)
		{
			
			s=s+ar[i];
		}
		System.out.println(s);
	}

}
