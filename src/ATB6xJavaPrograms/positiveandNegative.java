package ATB6xJavaPrograms;

import java.util.Scanner;

public class positiveandNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if (a>0) {
			System.out.println("Entered number is Positive");
		}
		else if (a<0) {
			System.out.println("Entered number is Negative");
		} else {
			System.out.println("Entered number is Zero");
		}
	}

}
