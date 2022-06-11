package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			v1.add(i);
			
		}
		System.out.println(v1.capacity());
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(v1);
	}

}
