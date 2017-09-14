package exercises;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A;
		double B;
		double percentage;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number >> ");
		A = keyboard.nextInt();
		System.out.print("Enter another number >> ");
		B = keyboard.nextInt();
		
		percentage = computePercent(A, B);
		
		System.out.println(A + " is " + percentage + " percent of " + B);
	}
	
	public static double computePercent(double A, double B)
	{
		double percentage;
		percentage = A * B / 100;
		return percentage;
	}

}
