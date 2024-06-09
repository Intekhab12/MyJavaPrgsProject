package ApnaCollegePrac1;

public class String_NoofWords {

	public static void main(String[] args) {
		String s="Welcome to java";
		int len=s.length();
		int count=1;
		
		for(int i=0;i<len-1;i++) 
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No of wrods= "+count);
		

	}

}
