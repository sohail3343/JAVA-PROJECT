package logical;

public class Stringmethods {
public static void main(String[] args) {
	String s="sohail";
	char [] ch= {'a','b'};
	
	  System.out.println(s.codePointAt(3));
	  System.out.println(s.codePointBefore(5));
	  System.out.println(s.codePointCount(0, 6));
	  System.out.println(s.copyValueOf(ch)); System.out.println(s.endsWith("w"));
	  System.out.println(s.format(s, args));
	 System.out.println(s.hashCode());
	System.out.println(s.intern().hashCode());
	
}
}
