package ApnaCollegePrac1;

public class Array_MaxMinValue {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,99};
		
		int min=ar[0];
		int max=ar[0];
		
		int len=ar.length;
		
		for(int i=0;i<len;i++)
		{
			//if(min<ar[i])
			if(ar[i]<min)
			{
				min=ar[i];
				
			}
		}
		System.out.println("Minimum value in array is "+min);
		
		for(int i=0;i<len;i++)
			{
				if(ar[i]>max)
				{
					max=ar[i];
					
				}
			}
		System.out.println("Maximum value in array is "+max);

	}

}
