package exercises;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number >>");
		A = keyboard.nextInt();
		System.out.print("Enter another number >>");
		B = keyboard.nextInt();
		
		displayTwiceTheNumber(A);
		
		displayNumberPlusFive(A);
		
		displayNumberSquared(A);	
		
		displayTwiceTheNumberB(B);
		
		displayNumberPlusFiveB(B);
		
		displayNumberSquaredB(B);
	}
	
	public static void displayTwiceTheNumber(int number)
	{
		int twiceTheNumber = number * 2;
		System.out.println("Twice the number of " + number + " is " + twiceTheNumber);
	}
	
	public static void displayNumberPlusFive(int number)
	{
		int numberPlusFive = number + 5;
		System.out.println(number + " plus 5 = " + numberPlusFive);
	}
	
	public static void displayNumberSquared(int number)
	{
		int numberSquared = number * number;
		System.out.println(number + " squared is equal to " + numberSquared);
	}
	
	public static void displayTwiceTheNumberB(int number)
	{
		int twiceTheNumberB = number * 2;
		System.out.println("Twice the number of " + number + " is " + twiceTheNumberB);
	}
	
	public static void displayNumberPlusFiveB(int number)
	{
		int numberPlusFiveB = number + 5;
		System.out.println(number + " plus 5 = " + numberPlusFiveB);
	}
	
	public static void displayNumberSquaredB(int number)
	{
		int numberSquaredB = number * number;
		System.out.println(number + " squared is equal to " + numberSquaredB);
	}

}
