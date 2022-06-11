package logical;

public class fibonacci1 {
public static void main(String[] args) {
	int a=0,b=1,c=0;
	for(int a1=1;a1<=10;a1++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
}
}
