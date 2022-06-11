package logical;

public class factorial {
//static int n=5;
static int factorial=1;
static void factorial(int n)
{
if(n>1)
{
	factorial =factorial*n;
	factorial(n-1);
	}
}
public static void main(String[] args) {
	factorial(5);
	System.out.println(factorial);
}
}
