package logical;

import java.util.Scanner;

public class swapping {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number x&y");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("before swapping :" +x+"  "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swapping number :"+x+"   "+y);
			
}
}
