import java.util.Scanner;
public class NumberSix{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter price: ");
 			double price = input.nextDouble();
 			
 double task = price * 0.075;
 double total = price + task;
 
 System.out.println(total);
 
 }
 
 }
