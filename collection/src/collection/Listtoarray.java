package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Listtoarray {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("apple");
	a.add("banana");
     a.add("chickoo");
     String [] s=(String[]) a.toArray();
     System.out.println(s);
}
}
