package ApnaCollegePrac1;

public class String_NoOfOccurance {

	public static void main(String[] args) {
		String s="Aaatif is my best friend";
		
		int total_len=s.length();
		
		String s1=s.replaceAll(" ", "");
		int len_withoutChar=s1.length();
		
		int noOfOccurance=total_len-len_withoutChar;
		System.out.println("No of Occurance of character= "+noOfOccurance);

	}

}
