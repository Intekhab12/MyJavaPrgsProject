package java1;

import java.util.Arrays;

public class SearchData_SortData {

	public static void main(String[] args) {
		System.out.println("Lenear Search Algo.....!");
		int n[]= {2,3,4,5};
		int sn=4;
		
//		String str[]= {"a","b","c"};
//		String se="A";
		boolean flag=false;
		
		//for(int i=0;i<str.length;i++)
		for(int i=0;i<n.length;i++)
		{
			//if(se.equalsIgnoreCase(str[i]))
			if(sn==n[i])	
				flag=true;
		}
		if(flag==true)
		//System.out.println("Searched element found and that is= "+se);
		System.out.println("Searched element found and that is= "+sn);
		else 
		{
			System.out.println("Searched element not found...!");
		}
				
System.out.println("Bubble Sort=======================================================");
		
		int ar[]= {2,4,3,5,6};
		
		System.out.println("Before sorting= "+Arrays.toString(ar));
		int l=ar.length;
		
		for(int i=0;i<l-1;i++)  //No.of pass....(no of elements-1)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
			int temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
				}
			}
		}	
		System.out.println("After sorting= "+Arrays.toString(ar));
		

		
System.out.println("Selection Sort=======================================================");
		
		int ar1[]= {7,2,4,3,5,6};
		
		System.out.println("Before sorting= "+Arrays.toString(ar1));
			int l1=ar1.length;
			
			for(int i=0;i<l1-1;i++)
			{
				int smallest=i;
				for(int j=i+1;j<l1;j++)
				{
					if(ar1[smallest]>ar1[j])
					{
						smallest=j;
					}
				}
				int temp=ar1[smallest];
				ar1[smallest]=ar1[i];
				ar1[i]=temp;
			}
			System.out.println("After sorting= "+Arrays.toString(ar1));
		
	}

}
