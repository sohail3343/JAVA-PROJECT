package logical;

public class Stringpunctuationsign {
public static void main(String[] args) {
	String s="he said,the mailman loves you'.i heard it with  my own ears.";
	int count =0;
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)==',' || s.charAt(i)=='.')
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
