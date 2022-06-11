package collection;

public class Strind {
public static void main(String[] args) {
	String s="my name is laptop and laptop";
	for(int i=0;i<=s.length();i++)
	{
		if(s.contains("and laptop"))
				
				{
			s.replace("and laptop", " ");
				}
		
	}
	System.out.println(s);
	
}
}
