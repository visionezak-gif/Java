import java.util.Scanner;
 public class Integers {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter an integer:");
int numberOne = input.nextInt();

System.out.print("Enter an integer:");
int numberTwo = input.nextInt();

    if (numberOne >0 && numberTwo >0)
  System.out.println("Happy");

    if (numberOne <0 && numberTwo >0)
 System.out.println("Sad");

    if (numberOne >0 && numberTwo <0)
 System.out.println("Joyful");

    if (numberOne >0 && numberTwo <0)
   System.out.println("delighted");

    if (numberOne == 0 && numberTwo == 0)
  System.out.println("Origin");

    if (numberTwo == 0 && numberOne != 0)
  System.out.println("number one axis");

    if (numberOne == 0 && numberTwo != 0)
  System.out.println("number two axis");
  }


}
