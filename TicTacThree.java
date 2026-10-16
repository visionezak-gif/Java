import java.util.Scanner;
import java.util.Random;

public class TicTacThree {
	public static void main(String[] args){
	
       char[][] gameBoard = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };
    


 
        System.out.println();
        System.out.println(" " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2]);
        System.out.println();
    
    
 		gameBoardPrinting(gameBoard);
		
		int totalMoves = 0;
		Scanner input = new Scanner(System.in);
		while(true){
			
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
			totalMoves++;
			
			positionplace(gameBoard, computerPosition, "computer");
					
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
	        	//System.out.println(row);
	        }
	       System.out.println(); 
	        
	   }
	
	
	
	
	public static void positionPlace(char[][] gameBoard, int position, String user){
	
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
			case 2: gameBoard[0][1] = symbol;
				break;
			case 3: gameBoard[0][2] = symbol;
				break;
			case 4: gameBoard[1][0] = symbol;
				break;
			case 5: gameBoard[1][1] = symbol;
				break;
			case 6: gameBoard[1][2] = symbol;
				break;
			case 7: gameBoard[2][0] = symbol;
				break;
			case 8: gameBoard[2][1] = symbol;
				break;
			case 9: gameBoard[2][2] = symbol;
				break;
				
			default: 
				break;
		
		}
		
		
	}
	
     
   }
      

