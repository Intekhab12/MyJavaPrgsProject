package ApnaCollegePrac1;

public class Array_MissingNo {

	public static void main(String[] args) {
		int ar[]= {1,2,4,5};
		
		int len=ar.length;
		
		int s=0;
		
		int s1=0;
		int mn=0;
		
		for(int i=0;i<len;i++)
		{
			s=s+ar[i];
		}
		
		for(int j=1;j<=5;j++)
		{
			s1=s1+j;
		}
		

		System.out.println(s1-s);

	}

}
