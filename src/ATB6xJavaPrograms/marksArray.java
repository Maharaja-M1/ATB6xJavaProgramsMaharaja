package ATB6xJavaPrograms;

import java.util.Scanner;

public class marksArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mark=new int[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Enter your Mark" +(i+1)+ ":");
			mark[i]=sc.nextInt();
		} sc.close(); 
		
		System.out.println("Your Result:");
		
		for (int j=0;j<mark.length;j++) {
			if(mark[j]>40) {
				System.out.println("Mark" +(j+1)+ "=" + mark[j] +"(PASS)");
			}else {
				System.out.println("Mark" +(j+1)+ "=" + mark[j] +"(FAIL)");
			}
		}
		
	}

}
