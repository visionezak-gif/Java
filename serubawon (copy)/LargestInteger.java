import java.util.Scanner;
 public class LargestInteger {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter an integer:");
int numberOne = input.nextInt();

System.out.print("Enter an integer:");
int numberTwo = input.nextInt();

 int largestNumber = numberOne;
  
  if (numberTwo > numberOne){
  
  largestNumber = numberTwo;
  }
	System.out.println("Largest number is = " + largestNumber);

  }
  
  
}
