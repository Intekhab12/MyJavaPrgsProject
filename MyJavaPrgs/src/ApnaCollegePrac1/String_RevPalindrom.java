package ApnaCollegePrac1;

public class String_RevPalindrom {

	public static void main(String[] args) {
		String s="Madam";
		
		int len=s.length();
		
		String rev="";
		
		String temp=s;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		//if(rev==temp)
			if(rev.equalsIgnoreCase(temp))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		

	}

}
