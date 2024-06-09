package ApnaCollegePrac1;

public class String_OccurenceOfChar {

	public static void main(String[] args) {
		String s="Aatiff";
		
		int dc_count=0;
		
		int len=s.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					dc_count++;
				}
			}
			
		}
		System.out.println(dc_count);

	}

}
