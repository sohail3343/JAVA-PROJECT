package logical;

import java.util.Arrays;
import java.util.List;

public class mergeArray {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4};
	int b[]= {5,6,7,8};
	int c=a.length+b.length;
	int m[]=new int[c];
	int count=0;
	for(int a2:a)
	{
	  m[count]=a2;
	  count++;
	}
	for(int b2:b)
	{
		m[count]=b2;
		count++;
	}
	System.out.println(Arrays.toString(m));
}
}
