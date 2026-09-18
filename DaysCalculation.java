import java.util.Scanner;
public class DaysCalculation{
    public static void main(String[] areg){

 Scanner input = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();



   if(number % 7 ==0){
  System.out.println("Monday");

}
     if (number % 7 ==1){
  System.out.println("Tuesday");
 }

       if (number % 7 ==2){
  System.out.println("Wednesday");
 }

     if (number % 7 ==3){
  System.out.println("Thursday");
 }

     if (number % 7 ==4){
  System.out.println("Friday");
 }

     if (number % 7 ==5){
  System.out.println("Saturday");
 }

     if (number % 7 ==6){
  System.out.println("Sunday");
 }


    }




}
