import java.util.Scanner;

public class TestOne{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  
  
  double score = 0;
  double count = 1;
  double sum = 0;
  while (count <= 10){
    System.out.print("Enter score: ");
  double scores = input.nextInt();
  if (scores >= 0 && scores <=100){
  sum += scores;

  
  }
  
  count++;
  
  }
  
      System.out.println("Total sum is =" + sum);
    
     }
  

}
