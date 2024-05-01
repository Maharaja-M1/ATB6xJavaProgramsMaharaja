package ATB6xJavaPrograms;

import java.util.Scanner;

public class maxOfThreeUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();
		System.out.println("Enter number 3:");
		int c=sc.nextInt();
		
		if ((a>b)&&(a>c)) {
			System.out.println("Number 1 is Greater");
		} else if ((b>a)&&(b>c)) {
			System.out.println("Number 2 is Greater");
		} else {
			System.out.println("Number 3 is Greater");
		}
	}

}
