package ATB6xJavaPrograms;

import java.util.Scanner;

public class doubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] value=new int[3]; 					//Initializing the Array
		
		for (int i=0; i<3; i++) {					//Inserting Values to the Array
			System.out.println("Enter the value" +(i+1)+ ":");
			value[i]=sc.nextInt();
		} 
		sc.close(); 
		
		System.out.println("DoubleArray=");
		int doublearray[]=new int[value.length];	//Creating a new array for storing the values of doubled array
		
		for (int i=0;i<value.length;i++) { 			//Doubling the array and printing it
			doublearray[i]=value[i]*value[i];
		System.out.println(doublearray[i]);
	}
	}
}
