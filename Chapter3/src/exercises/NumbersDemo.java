package exercises;

import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int anotherNumber;
		int twiceTheNumber;
		int numberPlusFive;
		int numberSquared;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number >>");
		A = keyboard.nextInt();
		System.out.print("Enter another number >>");
		anotherNumber = keyboard.nextInt();
		
		displayTwiceTheNumber(A);
		
		displayNumberPlusFive();
		
		displayNumberSquared();
		
		
		numberPlusFive = number + 5;
		numberSquared = number * number;	
	}
	
	public static void displayTwiceTheNumber(int number)
	{
		int twiceTheNumber = number * 2;
		System.out.println("Twice the number of " + number + "is " + twiceTheNumber);
	}
	
	public static void displayNumberPlusFive()
	{
		System.out.println(number + "plus 5 = " + numberPlusFive);
	}
	
	public static void displayNumberSquared()
	{
		System.out.println(number + "squared is equal to " + numberSquared);
	}

}
