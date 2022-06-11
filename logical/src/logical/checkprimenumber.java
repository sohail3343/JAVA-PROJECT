package logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class checkprimenumber{
	public static void checkPrime(int number) {
		boolean isPrime = true;//11
		for(int i=2;i<=(number/2);i++) {// 11/2 = 5  
			if(number%i==0) {//11%2=1  11%3 = 2 11%4=3  11%5=1 
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int number  = Integer.parseInt(br.readLine());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		checkPrime(number);
		sc.close();
	}
}
