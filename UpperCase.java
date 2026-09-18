import java.util.Scanner;
public class UpperCase {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter a word: ");
 String word = input.nextLine();

char firstLetter = word.charAt(0);
String letter = "" + firstLetter;


if (letter.equals(letter.toUpperCase())){
System.out.println("It is upper case");
}
else{
System.out.println("It is lowercase");
}
}
}
