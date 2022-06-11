package logical;

public class fibonacci {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int i;
	int n3;
	int count=10;
	System.out.print(n1+"  "+n2);
	for(i=2;i<=count;i++)
	{
		n3=n1+n2;
		System.out.println("  "+n3);
		n2=n3;
		n1=n2;
	}
}
}
