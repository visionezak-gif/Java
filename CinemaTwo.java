import java.util.Scanner;
import java.util.Arrays;
public class CinemaTwo {

		
	
	public static void seatInitialization(char[][] seats){

		
	    
	    for(int index = 0; index <seats.length; index++){
	        for(int count = 0; count < seats[index].length; count++){
	            System.out.print(seats[index][count] + " ");
	        }
	        System.out.println();
	    }
	System.out.println();
	
	}	
	public static void main(String[] args) {
       char [][] seats = new char[4][5];
       	System.out.println("Cinema Seating Chart");
       	System.out.print("\n");
       for(int index = 0; index < seats.length; index++){
	        for(int count = 0; count < seats[index].length; count++){
	            seats[index][count] = (char) ('O');
	            
	        }
	        
       }
      seatInitialization(seats);
      
      	Scanner input = new Scanner(System.in);
      	System.out.print("Enter row number: ");
      	
		int rowNumber = input.nextInt();
		System.out.print("\n");
		
		System.out.print("Enter seat number: ");
		int seatNumber = input.nextInt();
		System.out.print("\n");
		
		System.out.println("Updated seating chart");
		System.out.print("\n");
		
		
		
		seats[rowNumber -1][seatNumber -1] = (char)('X'); 
		
		
	seatInitialization(seats);	
      
	}
}
