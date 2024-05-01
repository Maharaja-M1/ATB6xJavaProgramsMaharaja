package ATB6xJavaPrograms;

import java.util.Scanner;

public class consonantOrVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char ch = Character.toLowerCase(sc.next().charAt(0));
		
		if((ch =='a' ||ch =='e'||ch =='i' || ch =='o' || ch =='u')){
			System.out.println("Entered Character is Vowel");
		} else {
			System.out.println("Entered Character is Consonent");
		}
		
		
	}

}
