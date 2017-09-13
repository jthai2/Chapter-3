package exercises;

import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int anotherNumber;
		int twiceTheNumber;
		int numberPlusFive;
		int numberSquared;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number >>");
		number = input.nextInt();
		System.out.print("Enter another number >>");
		anotherNumber = input.nextInt();
		
		displayTwiceTheNumber();
		twiceTheNumber = number * 2;
		
		displayNumberPlusFive();
		numberPlusFive = number + 5;
		
		displayNumberSquared();
		numberSquared = number * number;
		
	}
	
	public static void displayTwiceTheNumber()
	{
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
