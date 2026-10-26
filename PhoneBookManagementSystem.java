import java.util.Arrays;
import java.util.Scanner;
public class PhoneBookManagementSystem{

	public static void main(String[] args){
	
	String [] logins = new String [1];
	
	for (int rows = 0; rows < logins.length; rows++){
//		for(int colums = 0; colums < logins[rows].length; colums++){
		
			Scanner input = new Scanner(System.in);
		System.out.print("Enter logins details at index: ");
		  String userInput = input.nextLine();
		  
		  	logins[rows] = userInput;
		  	
		  	System.out.println(Arrays.toString(logins));
		  	
		  	String password = "Vish123";
		  	
		  		
	
//			}
	
		}
		
	
	}

}
