package logical;

import java.util.Scanner;

public class String2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name here :");
	String name=sc.nextLine();
	String first=name.substring(0,2).toUpperCase();
	String remain=name.substring(2,name.length()-2);
	String last=name.substring(name.length()-2).toUpperCase();
	System.out.println(first+remain+last);
}
}
