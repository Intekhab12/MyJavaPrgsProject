package ApnaCollegePrac1;

public class String_VowelConsonant {

	public static void main(String[] args) {
		String s="Seleniumae";
		
		int vcount=0;
		int ccount=0;
		
		int len=s.length();
		char vch=' ';
		char cch=' ';
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
				 vch=s.charAt(i);
				 System.out.println("Vowels are "+vch+" ");
			}
			 
			 
			else
			{
				ccount++;
				cch=s.charAt(i);
				System.out.println("Consonants are "+cch+" ");
			}
		}
		System.out.println("Vowel count= "+vcount);
		//System.out.print("Vowels are "+vch+" ");
		System.out.println("Consonant count= "+ccount);
		//System.out.print("Consonants are "+cch+" ");
	}

}
