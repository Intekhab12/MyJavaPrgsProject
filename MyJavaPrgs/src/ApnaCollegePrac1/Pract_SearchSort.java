package ApnaCollegePrac1;

public class Pract_SearchSort {

	public static void main(String[] args) 
	{
		int ar[]= {2,3,4,5,6};
		
		int si=5;
	
		boolean flag=false;
		for( int i=0;i<ar.length;i++)
		{
			if(ar[i]==si)
			{
				System.out.println("Searched Item found which is at index of "+i);
				flag=true;
				break;
			}	
		}
			
		
		if(flag==false)
		{
			System.out.println("Item not found");
		}

	}

}
