package java1;

//import java.io.BufferedReader;
import java.io.BufferedWriter;

//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Read_WriteData {

	
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
		/*
		 * FileReader fi=new FileReader("D:\\D Drive\\j p\\ReadData.txt");
		 * 
		 * BufferedReader br=new BufferedReader(fi);
		 * 
		 * String str;
		 * 
		 * while((str=br.readLine())!=null) { System.out.println(str); }
		 * 
		 * br.close();
		 */
		System.out.println("========================================");
		
		
		FileWriter fw=new FileWriter("D:\\D Drive\\j p\\WriteData1.txt");
		
		try (BufferedWriter bw = new BufferedWriter(fw)) 
		{
			bw.write("\nHi baby its 10th of Jan 2024....!");
			bw.write("\n\n\nLove you....Thanks baby.");
			bw.write("  \nBye Bye");
		} 
		
			System.out.println("The End...!");
		
		
		
		

	}

}
