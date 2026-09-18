import java.util.Scanner;
public class NumberDivision{
    public static void main(String[] areg){

 Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();

int count = 2;

  while (number >1){
  if (number % count ==0){
   number = number / count;
  System.out.println(count);
     }
  else{
 count ++;
  }
 }
    

    }




}
