import java.util.Arrays;
public class ArrayRefactoring{


	public static int[][] arraySorting(int[][] numbers){
	
	for(int vision = 0; vision < numbers.length; vision++){
		for(int deo =0; deo < numbers[vision].length; deo++){
			for (int seun = deo + 1; seun < numbers[vision].length; seun++){
			
				int spare = numbers[vision][deo];
				numbers[vision][deo] = numbers[vision][seun];
				numbers[vision][seun] = spare;
				
//				
			
			}
		
		
		}
	
	  }
	return numbers;

  }


	
	
	public static void main(String[] args){
	
	int [][] numbers = {
				{1, 2, 3},
			      {4, 5, 6},
			      {7, 8, 9}
		
				};
	

	
		int[][] total = arraySorting(numbers);
		System.out.println(Arrays.deepToString(total));		
	
	}

}
