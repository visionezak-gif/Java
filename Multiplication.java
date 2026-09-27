
import java.util.Scanner;
public class Multiplication{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
      int number = input.nextInt();

      int index = 1;
	int sum = 1;
  
	 for (index = 1; index <= 12; index++){
	   sum = number * index;
			System.out.println(number + "*" + index + "=" + sum);

	   }
   
 }
 
 }
 
 
// 
// public class Multiplication {
// 
// 	public static void main(String[] args) {
// 	
// 	int number = 5;
// 	int multi = 1;
//	 	for(int count = 1; count <= 10; count++) {
//	 	multi = number * count;
//	 		System.out.println(number + "*" + count + "=" + multi);
//	 	}
// 	
// 	
// 	}
// 
// 
// }
