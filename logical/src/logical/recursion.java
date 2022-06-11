package logical;

public class recursion {
static int n=0;
static void m1()
{
 if(n<100)
 {
	 n++;
	 System.out.println(n);
	 m1();
 }
}
public static void main(String[] args) {
	m1();
}
}
