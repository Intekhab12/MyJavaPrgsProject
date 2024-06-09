package practiceJavaProgs;

public class TestJunk_WhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Atif####Aslam@@@123$$$";
		
		String str2=str1.replaceAll("[^a-zA-Z1-9]","");
		
		System.out.println(str2);
		
		System.out.println("===========================================");
		
		String str3="Atif    Aslam  @ gmail.com";
		
		String str4=str3.replaceAll("\\s","");
		
		System.out.println(str4);
		
	}

}
