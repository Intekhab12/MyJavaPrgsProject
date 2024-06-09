package practiceJavaProgs;

public class TestPalindromPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121;
		int s=0;
		int org=n;
		
		while(n>0)
		{
			int r=n%10;//5,4
			s=s*10+r;//5,54
			n=n/10;//54
		}
		if(s==org)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
