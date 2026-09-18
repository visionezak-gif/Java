import java.util.Scanner;
public class NumberCollector{
public static void main(String[] args){
  
   Scanner input = new Scanner(System.in); 
  System.out.print("Enter number(-1 to stop): ");
  int number = input.nextInt();

     while(number != -1){
   System.out.println("You entered:" + number);

  System.out.println("Enter another number(-1 to stop):");
    number = input.nextInt();
   }
  System.out.println("Program stopped");
 }


}
