package logical;

public class sortingofanarray {
public static void main(String[] args) {
	int [] a= {5,6,9,3,1,4,};
	int temp=0;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		System.out.println(a[i]);
	}
}
}
