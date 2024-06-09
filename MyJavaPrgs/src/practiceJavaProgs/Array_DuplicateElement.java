package practiceJavaProgs;

public class Array_DuplicateElement {
	
	public static void main(String args[])
	{
		//int ar[]= {1,2,3,4,};
		
		String ar[]= {"a","b","c","d","d"};
		
		int len=ar.length;
		
		boolean flag=false;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("Duplicate Element found which is "+ar[i]);
					flag=true;
				}
				
			}
			
			
		}
		if(flag==false)
		{
			System.out.println("No duplicates found");	
		}
		
		
	}

}
