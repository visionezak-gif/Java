import java.util.Scanner;
public class Factorial{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  long number = input.nextInt();
   
      long product = 1;
//               start                 stop /condition         step
    for(long factorial = number; factorial >= 1; factorial--){
         product = product * factorial;
    }

    System.out.println(product);


  }


}
