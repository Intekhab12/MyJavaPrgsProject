package ApnaCollegePrac1;

public class PractSum_CountDigits {

	public static void main(String[] args) 
	{
		int n=234050000;
		int c=0;
		while(n>0)
		{
			int r=n%10;
			c++;
			n=n/10;
			/*n=n/10;
			c++;*/
		}
		System.out.println(c);
	}

}
