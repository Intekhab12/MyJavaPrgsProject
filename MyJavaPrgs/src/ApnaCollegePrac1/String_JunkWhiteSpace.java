package ApnaCollegePrac1;

public class String_JunkWhiteSpace {

	public static void main(String[] args) {
		String s="Atif@#$%Aslam";
		
		String s1=s.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(s1);
		
		String s2="Atif A s  lam";
		String s3=s2.replaceAll("\\s", "");
		System.out.println(s3);
	}

}
