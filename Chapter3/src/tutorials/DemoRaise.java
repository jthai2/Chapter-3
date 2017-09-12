package tutorials;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startingWage;
		double salary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a salary:");
		salary = input.nextInt();
		System.out.println("Enter a starting wage:");
		startingWage = input.nextInt();
		predictRaise(1000);
		predictRaise(startingWage);
	
	}
	
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + "   After Raise: " +
				newSalary);
		
	}

}
