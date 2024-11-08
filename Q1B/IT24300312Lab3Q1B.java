import java.util.Scanner;

public class IT24300312Lab3Q1B {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the price of 1kg of rice  : ");

	int oneKg = input.nextInt(); 

	System.out.print("Enter the number of kilograms you want to buy : ");

	int number = input.nextInt();

	int totalPrice=number * oneKg;

	double finalPrice=totalPrice - (totalPrice*0.10);
	
	System.out.println("The total price to pay with discount = "+ finalPrice);

	}

}

	

	