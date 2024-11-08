import java.util.Scanner;
public class IT24300312Lab3Q4 {
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a five digit number: ");
int number = scanner.nextInt();
int digit01 = number/10000;
int digit02 = (number/1000)%10;
int digit03 = (number/100)%10;
int digit04 = (number/10)%10;
int digit05 = (number)%10;
System.out.printf("%d %d %d %d %d\n",digit01,digit02,digit03,digit04,digit05);
               }
}