import java.util.Scanner;
 public class Username {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter your username: ");
  String username = input.nextLine();

System.out.print("Enter your password: ");
int password = input.nextInt();
//
//	String username = "admin";
//	int password = 1234;


	if (username.equals("admin") && password ==1234){
	System.out.println("Access granted");
	
	}
	else{
	System.out.println("Access denied");
	
	}
	
	
   }
   
   
 }
