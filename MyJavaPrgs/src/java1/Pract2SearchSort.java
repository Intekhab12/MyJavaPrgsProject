package java1;

import java.util.Arrays;

public class Pract2SearchSort {

	public static void main(String[] args) 
	{
		int ar[]= {2,3,4,5,6,7};
		int si=3;
		 System.out.println("========Searching by Linear Search============================");
		boolean flag=false;
		 for(int i=0;i<ar.length;i++)
		 {
			 if(ar[i]==si)
			 {
				 System.out.println("Searched item is at index "+i);
				 flag=true;
				 //break;
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println("Item not found...!");
		 }
		 
		 System.out.println("========Sorting by Bubble Sort============================");
		 
		 int ar1[]= {9,8,2,3};
		 
		 
		 System.out.println("Before Sorting:"+Arrays.toString(ar1));
		 
		 for(int i=0;i<ar1.length-1;i++)
		 {
			 for(int j=0;j<ar1.length-1;j++)
			 {
				 if(ar1[j]>ar1[j+1])       //5,4,6>>  
				 {
					int temp=ar1[j];
					ar1[j]=ar1[j+1];
					ar1[j+1]=temp;
				 }
			 }
		 }
		 System.out.println("After Sorting:"+Arrays.toString(ar1));
	}

}
