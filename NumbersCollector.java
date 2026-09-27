import java.util.Scanner;
public class NumbersCollector{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
//	System.out.println("Enter a number 1");
//	int number = input.nextInt();
	
	int[] array = new int [5];
	for (int index = 0; index < array.length; index ++){
	System.out.println("Enter a number " + (index + 1));
	int number = input.nextInt();
	
	array[index] = number;
	
	
	
	}
	
	 for (int index = 0; index < array.length; index ++){
	System.out.print(array[index] + "  ");
	
	}
	
	int largest = array[0];
	int smallest = 0;
	float average = 0;
	
	for (int index = 0; index <array.length; index++){
	if (array[index] > largest){
	largest = array[index]; 
	}
	
	}
	System.out.println( "Largest number is " + largest);
	
	largest = 0;
	smallest = array[0];
	average = 0;
	
	for (int index = 0; index <array.length; index++){
	if (array[index] < smallest){
	smallest = array[index]; 
	
	}
	
	}
	System.out.println("Smallest number is " + smallest);
	
	int sum = array[0] + array[1] + array[2] + array[3] + array[4];
	 average = sum / 5;
	
	
	System.out.println("Average is " + average);
	
	}


}
