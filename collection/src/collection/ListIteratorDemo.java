package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("sameer");
		l1.add("muddasir");
		l1.add("murgbaz");
		l1.add("jdk");
		System.out.println(l1);
		ListIterator<String> itr = l1.listIterator();
		while(itr.hasNext())
			{
			String s=(String)itr.next();
			
		
			if(s.equals("sameer"))
			{
				itr.remove();
			}
			else if(s.equals("murgbaz"))
			{
				itr.add("sameer murgbaz");
			}
			
			System.out.println(s);
			
		
			
		}

	}

}
