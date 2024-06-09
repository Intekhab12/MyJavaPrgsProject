package practiceJavaProgs;

public class TestSumofDigit_NoOfDigit {

	public static void main(String[] args) {
		int n=2345;
		int s=0;
		while(n>0)
		{
			int r=n%10;
			 s=s+r;
			 n=n/10;
		}
		System.out.println("Sum= "+s);
		
		System.out.println("======================================");
		
		int n1=1234;
		int count=0;
		
		while(n1>0)
		{
			n1=n1/10;
			count++;
			
		}
		System.out.println("No of digit in Number is "+count);
	}

}
