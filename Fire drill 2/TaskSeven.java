import java.util.Scanner;

public class TestOne{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  
  double average = 0;
  double score = 0;
  double count = 1;
  double sum = 0;
  while (count <= 10){
    System.out.print("Enter score: ");
  double scores = input.nextInt();
  if (scores % 2 == 0){
  sum += scores;
  average = sum / 10;
  
  }
  
  count++;
  
  }
  
      System.out.println("Total sum is =" + sum);
      System.out.println("Total average is =" + average);
     }
  

}
