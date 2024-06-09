package ApnaCollegePrac1;

public class TestArmstrongPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int s=0;
		int temp=n;
		
		while(n>0)

		{
			int r=n%10;
			
			s=s+r*r*r;
			
			n=n/10;
			
			
		}
		
		if(s==temp)
		{
			System.out.println("Armstrong");
		}
		else
			{
				System.out.println("Not Armstrong");
			}
	}

}
