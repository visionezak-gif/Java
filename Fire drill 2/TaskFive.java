import java.util.Scanner;

public class TestOne{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
 
  double count = 1;
  double sum = 0;
  while (count <= 10){
    System.out.print("Enter score: ");
  double scores = input.nextDouble();
  if (scores % 2 == 0){
  sum += scores;
 
  
  }
  
  count++;
  
  }
  
      System.out.println("Total sum is =" + sum);
     }
  

}


