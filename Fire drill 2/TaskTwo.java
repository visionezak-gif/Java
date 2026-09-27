import java.util.Scanner;

public class TestOne{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter score one: ");
  double scoreOne = input.nextDouble();
  
  System.out.print("Enter score two: ");
  double scoreTwo = input.nextDouble();

   System.out.print("Enter score three: ");
  double scoreThree= input.nextDouble();
  
   System.out.print("Enter score four: ");
  double scoreFour = input.nextDouble();
  
   System.out.print("Enter score five: ");
  double scoreFive = input.nextDouble();
  
   System.out.print("Enter score six: ");
  double scoreSix = input.nextDouble();
  
   System.out.print("Enter score seven: ");
  double scoreSeven = input.nextInt();
  
   System.out.print("Enter score eight: ");
  double scoreEight = input.nextDouble();
  
   System.out.print("Enter score nine: ");
  double scoreNine = input.nextDouble();
  
   System.out.print("Enter score ten: ");
  double scoreTen = input.nextDouble();
  
    
  
     double sum = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive + scoreSix + scoreSeven + scoreEight + scoreNine + scoreTen;
     
     double average = sum / 10;
     
     System.out.println("Average is = " + average);
  

}


}
