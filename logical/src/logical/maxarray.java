package logical;

public class maxarray {
	public static void main(String[] args) {
		int[] a= {2,4,6,7,1,3};
		int max=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
