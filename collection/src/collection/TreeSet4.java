package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet4 {
public static void main(String[] args) {
	TreeSet t= new TreeSet(new mam());
	t.add("A");
	t.add("ABC");
	t.add("AA");
	t.add("XX");
	t.add("ABCD");
	t.add("B");
	System.out.println(t);
}
}
class mam implements Comparator
{
 public int compare (Object obj1,Object obj2)
 {
	 String s1=(String)obj1;
	 String s2=(String)obj2;
	 int l1=s1.length();
	 int l2=s2.length();
	 if(l1>l2)
	 {
		 return-1;
	 }
	 else if(l1<l2)
	 {
		 return +1;
	 }
	 else
	 {
		 return s1.compareTo(s2);
	 }
 }

}
