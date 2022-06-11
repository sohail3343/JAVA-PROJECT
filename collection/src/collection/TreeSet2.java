package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet(new Myself());
		t1.add(10);
		t1.add(15);
		t1.add(16);
		t1.add(19);
		t1.add(100);
		System.out.println(t1);
		
	}
}
	class Myself implements Comparator
	{
		public int compare(Object obj1, Object obj2)
		
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			if(i1>i2)
			{
				return -1;
			}
			else if(i1<i2)
			{
				return+1;
			}
			else 
			{
				return 0;
			}
		}

		
			
		}
	


