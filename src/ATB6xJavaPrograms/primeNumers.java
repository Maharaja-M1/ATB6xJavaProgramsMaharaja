package ATB6xJavaPrograms;

import java.util.Scanner;

public class primeNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if ((a!=0 && a!=1) && (a%2==0 || a%3==0 || a%5==0 || a%7==0)) {
			System.out.println("Its not a Prime Number");
		} else {
			System.out.println("It is a Prime Number");
		}
	}

}
