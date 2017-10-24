

import java.util.Scanner;


/**
 * Write a class that will get input from the user through the terminal
 * Only int will be passed in through the terminal. Any other input will likely fail.
 * 
 * This class will put all the ints into an array then average them together.
 * The average will be printed to the console.
 * 
 * @author dustin
 *
 */
public class ArrayAverage {

	/**
	 * The main method will read from the console to first determine the size of the array
	 * 
	 * Then, the main method should cycle through input from the user to populate the array
	 * 
	 * Then, the main method should average the populated array
	 * 
	 * Finally, the main method should print the average
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int ArraySize=0,sum=0;
		double average=0.0;
			
	Scanner console=new Scanner(System.in);
	System.out.println("Please Enter size of an Array:");
			
	ArraySize=console.nextInt();
		
	int[] myArray=new int[ArraySize];
	System.out.println("Enter " + ArraySize+ " elements:");
		 for(int i=0;i<ArraySize;i++)
		 {
		 myArray[i]=console.nextInt();
		 sum=sum+myArray[i];
		 	
		 }
		 	
	average=sum/ArraySize;
	System.out.println("Average is: "+ average);
			
	console.close();
		
	}
	
}
