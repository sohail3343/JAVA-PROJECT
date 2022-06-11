package logical;

public class minarray {
	public static void main(String[] args) {
		int[] a= {2,4,6,7,1,3};
		int min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
