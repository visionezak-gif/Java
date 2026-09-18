import java.util.Scanner;
public class Word {
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
 System.out.print("Enter a word: ");
  String word = input.next();

   if (word.length() < 5){
 System.out.println("Short string");
}
  else  if (word.length() >= 5 && word.length() <= 10){
  System.out.println("medium string");
 }
   else {
 System.out.println("long string"); 
}
}
}
