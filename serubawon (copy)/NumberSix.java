import java.util.Scanner;
public class NumberSix{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter first number: ");
 			double firstNumber = input.nextDouble();

 	System.out.print("Enter second number: ");
 		double secondNumber = input.nextDouble();
 		
 double sum = firstNumber + secondNumber;
 double difference = firstNumber - secondNumber;
 double product = firstNumber * secondNumber;
 double quotient = firstNumber / secondNumber;
 
 System.out.println("Sum is = " + sum);
  
 System.out.println("Difference is = " + difference);
  
 System.out.println("Product is = " + product); 
  
 System.out.println("Quotient is = " + quotient);
 
}


}
