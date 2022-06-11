package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(new sam());
		t.add("mudasir");
		t.add("sameer");
		t.add("sohail");
		t.add("nasir");
		System.out.println(t);
	}

}
class sam implements Comparator
{
 public int compare(Object obj1, Object obj2)
 {
	 String s1=(String)obj1;
	 String s2=(String)obj2;
	return -s1.compareTo(s2);
 }
	
}
