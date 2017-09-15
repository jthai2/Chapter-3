package exercises;

import java.text.DecimalFormat;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tacoPrice = 1.99;
		double burritoPrice = 2.54;
		double enchiladaPrice = 2.66;
		double nachosPrice = 2.30;
		double quesadillasPrice = 2.80;
		double tamlesPrice = 3.00;
		double churrosPrice = 1.00;
		double horchataPrice = 2.00;
		double tortillasPrice = 2.44;
		double burgerPrice = 1.60;
		double tax;
		double salesTax = 6;
		double actualTotal;
		
		double tacoAmountOrdered, burritoAmountOrdered, enchiladaAmountOrdered, nachosAmountOrdered, quesadillasAmountOrdered, tamlesAmountOrdered, churrosAmountOrdered, horchataAmountOrdered, tortillasAmountOrdered, burgerAmountOrdered;
		
		double tacoPriceTotal, burritoPriceTotal, enchiladaPriceTotal, nachosPriceTotal, quesadillasPriceTotal, tamlesPriceTotal, churrosPriceTotal, horchataPriceTotal, tortillasPriceTotal, burgerPriceTotal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many tacos do you want? >>>");
		tacoAmountOrdered = input.nextDouble();
		tacoPriceTotal = tacoAmountOrdered * tacoPrice;
		
		System.out.print("How many burritos do you want? >>>");
		burritoAmountOrdered = input.nextDouble();
		burritoPriceTotal = burritoAmountOrdered * burritoPrice;
		
		System.out.print("How many enchiladas do you want? >>>");
		enchiladaAmountOrdered = input.nextDouble();
		enchiladaPriceTotal = enchiladaAmountOrdered * enchiladaPrice;
		
		System.out.print("How many nachos do you want? >>>");
		nachosAmountOrdered = input.nextDouble();
		nachosPriceTotal = nachosAmountOrdered * nachosPrice;
		
		System.out.print("How many quesadillas do you want? >>>");
		quesadillasAmountOrdered = input.nextDouble();
		quesadillasPriceTotal = quesadillasAmountOrdered * quesadillasPrice;
		
		System.out.print("How many tamles do you want? >>>");
		tamlesAmountOrdered = input.nextDouble();
		tamlesPriceTotal = tamlesAmountOrdered * tamlesPrice;
		
		System.out.print("How many churros do you want? >>>");
		churrosAmountOrdered = input.nextDouble();
		churrosPriceTotal = churrosAmountOrdered * churrosPrice;
		
		System.out.print("How many horchatas do you want? >>>");
		horchataAmountOrdered = input.nextDouble();
		horchataPriceTotal = horchataAmountOrdered * horchataPrice;
		
		System.out.print("How many tortillas do you want? >>>");
		tortillasAmountOrdered = input.nextDouble();
		tortillasPriceTotal = tortillasAmountOrdered * tortillasPrice;
		
		System.out.print("How many burgers do you want? >>>");
		burgerAmountOrdered = input.nextDouble();
		burgerPriceTotal = burgerAmountOrdered * burgerPrice;
		
		System.out.println("You ordered " + tacoAmountOrdered + " it will cost " + tacoPriceTotal);
		System.out.println("You ordered " + burritoAmountOrdered + " it will cost " + burritoPriceTotal);
		System.out.println("You ordered " + enchiladaAmountOrdered + " it will cost " + enchiladaPriceTotal);
		System.out.println("You ordered " + nachosAmountOrdered + " it will cost " + nachosPriceTotal);
		System.out.println("You ordered " + quesadillasAmountOrdered + " it will cost " + quesadillasPriceTotal);
		System.out.println("You ordered " + tamlesAmountOrdered + " it will cost " + tamlesPriceTotal);
		System.out.println("You ordered " + churrosAmountOrdered + " it will cost " + churrosPriceTotal);
		System.out.println("You ordered " + horchataAmountOrdered + " it will cost " + horchataPriceTotal);
		System.out.println("You ordered " + tortillasAmountOrdered + " it will cost " + tortillasPriceTotal);
		System.out.println("You ordered " + burgerAmountOrdered + " it will cost " + burgerPriceTotal);
		
		DecimalFormat df = new DecimalFormat("0.00");
		double total = tacoPriceTotal + burritoPriceTotal + enchiladaPriceTotal + nachosPriceTotal + quesadillasPriceTotal + tamlesPriceTotal + churrosPriceTotal + horchataPriceTotal + tortillasPriceTotal + burgerPriceTotal;
		System.out.println("Your total is " + (df.format(total)));
		
		tax = computeTaxAmount(total, salesTax);
		
		displayInfo(tax);
		
		actualTotal = total + tax;
		DecimalFormat df1 = new DecimalFormat("0.00");
		System.out.println("Your total will be $" + (df1.format(actualTotal)));
		
	}
	
	public static void displayInfo(double tax)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Your tax is " + (df.format(tax)));
	}
	
	public static double computeTaxAmount(double total, double salesTax)
	{
		double tax;
		tax = total * salesTax / 100;
		return tax;
	}

}
