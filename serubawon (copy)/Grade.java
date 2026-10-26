import java.util.Scanner;
public class PositiveNumber{
public static void main(String[] args){


  Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
 int number = input.nextInt();
 
 if (number > 90 || number == 100){
    System.out.println("your grade is A");
 }
 else if (number > 80 || number == 89){
    System.out.println("your grade is B");
 }
 else if (number > 70 || number == 79 ){
    System.out.println("your grade is C");
 }
else if (number > 60 || number == 69){
    System.out.println("your grade is D");
 }
 
 else{
    System.out.println("your grade is F");
 }
	 }

}
