import java.util.Scanner;
public class CommonFactor{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
      int number = input.nextInt();
 
     int factor = 0;
//
//  for (factor = 1; factor <= number; factor++){
//   if (number % factor ==0) 
//  System.out.println(factor);
//      
//    }
//  

   while (factor <= number){
    factor++;
  if(number % factor == 0)
   
     System.out.println(factor);
    }  
}

}
