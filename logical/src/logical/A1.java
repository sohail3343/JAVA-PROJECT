package logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A1 {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("hi");
	l.add("hi");
	l.add("how");
	l.add("are");
	l.add("you");
	System.out.println("before list:" +l);
	Collections.fill(l, "hi");
	l.add("dear");
	System.out.println("after list :"+ l);
	System.out.println("frequency :"+ Collections.frequency(l,"hi"));
}
}
