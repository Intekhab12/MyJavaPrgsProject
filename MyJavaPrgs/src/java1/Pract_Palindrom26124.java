package java1;

public class Pract_Palindrom26124 {

	public static void main(String[] args) 
	{
		int n=14412;
		
		int rev=0;
		
		int temp=n;
		
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			
			
		}
		if(rev==temp)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
