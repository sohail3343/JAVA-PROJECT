package collection;

import java.util.ArrayList;

public class ArrayToList {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		ArrayList<Integer> s=new ArrayList<Integer>();
		for(int i:a)
		{
			s.add(i);
		}
		System.out.println(s);
	}

}
