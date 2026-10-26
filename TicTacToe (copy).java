import java.util.Scanner;
import java.util.Random;
public class TicTacTeo{

	public static void main(String[] args){
	
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, 
			   {'-', '+', '-', '+', '-'},
			   {' ', '|', ' ', '|', ' '},
			   {'-', '+', '-', '+', '-'},
			   {' ', '|', ' ', '|', ' '}};


	
		gameBoardPrinting(gameBoard);
		
		int totalMoves = 0;
		
		while(true){
			Scanner input = new Scanner(System.in);
		      System.out.print("Enter your space (1-9):");
			int playerPosition = input.nextInt();
			totalMoves++;
			if (totalMoves == 9){
				System.out.println("Board is full, Game over");
				break;
			}
			//System.out.println(playerPosition);
		
			positionplace(gameBoard, playerPosition, "player");
		
			Random random = new Random();
			int computerPosition = random.nextInt(9) + 1;
		
			positionplace(gameBoard, computerPosition, "computer");
			totalMoves++;		
			gameBoardPrinting(gameBoard);
			if(totalMoves == 9){
				System.out.println("Board is full, Game over");
				break;
			}
		
	    }
		
     }
 	
	public static void gameBoardPrinting(char [][] gameBoard){
				   
	   for (char[] row : gameBoard){
	        for(char value : row){
	        	System.out.print(value);
	        }
	        System.out.println(); 
	        
	   }
	
	
	}
	
	public static void positionplace(char[][] gameBoard, int position, String user){
	
		char symbol = ' ';
	
		if (user.equals("player")){
			symbol = 'X';
		}
		else if(user.equals("computer")){
			symbol = 'O';
		}
	
	
	switch(position){
			case 1: gameBoard[0][0] = symbol;
				break;
			case 2: gameBoard[0][2] = symbol;
				break;
			case 3: gameBoard[0][4] = symbol;
				break;
			case 4: gameBoard[2][0] = symbol;
				break;
			case 5: gameBoard[2][2] = symbol;
				break;
			case 6: gameBoard[2][4] = symbol;
				break;
			case 7: gameBoard[4][0] = symbol;
				break;
			case 8: gameBoard[4][2] = symbol;
				break;
			case 9: gameBoard[4][4] = symbol;
				break;
				
			default: 
				break;
		
		}
		
		
	}
	
	
}
