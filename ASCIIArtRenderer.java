import java.util.Arrays;
public class ASCIIArtRenderer{

	public static void main(String[] args){
	
	char [][] character = new char [9][9];
	
	for(int rows = 0; rows < character.length; rows++){
		for (int colums = 0; colums < character[rows].length; colums++){
			
			character[rows][colums] = '*';
			
			
			}
			
		}
		for (int index = 0; index < character.length; index++){
			for(int indexer = index; indexer < character[index].length; indexer++){
				System.out.print("[" + character[index][indexer] + "]");
			}
			System.out.println();
		}

	
	
	}

}
