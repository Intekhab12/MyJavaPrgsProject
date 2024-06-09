package ApnaCollegePrac1;

import java.util.Arrays;

public class Arrays_Equality {

	public static void main(String[] args) 
	{
				int ar[]= {1,2,3,4};
				int ar1[]={1,2,3,4,6};
				//String ar[]= {"a","b","c","d","d"};
				
			
				
				int len=ar.length;
				int len1=ar1.length;
				boolean flag=false;
				if(len==len1)
				{
					for(int i=0;i<len;i++)
					{
						for(int j=0;j<len1;j++)
						{
							if(ar[i]==ar1[j])
							{
								flag=true;
							}
						}
						
					}
					System.out.println("Arrays are Equal");
				}
				if(flag==false)
				{
					System.out.println("Arrays are not equal");
				}
			
		//Approach 2		
		boolean status=Arrays.equals(ar,ar1);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		if(status==false)
		{
			System.out.println("Arrays are not equal");
		}
				

	}

}
