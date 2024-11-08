import java.util.Scanner;

public class IT24300312Lab3Q1A{

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the price of 1kg rice ");

	int oneKg = input.nextInt();
	
	System.out.println("Enter the amount of kilo of rice");

	int amountOfKiloOfRice = input.nextInt();

	int totalPrice = amountOfKiloOfRice * oneKg;

    	System.out.println("The total price to pay = "+ totalPrice);

	}


}