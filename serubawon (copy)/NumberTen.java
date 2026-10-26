import java.util.Scanner;

public class AgeAndName{
public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   System.out.print("Enter your first name: ");
   String firstName = input.nextLine();
   
    System.out.print("Enter your last name: ");
   String lastName = input.nextLine();
   
   System.out.print ("Enter year of birth: ");
   int yearOfBirth = input.nextInt();
   
   	
   	int age = 2025 - yearOfBirth; 
   
      System.out.printf("profile: %s %s, Age: %d %n", firstName, lastName, age);   
	
}

}
