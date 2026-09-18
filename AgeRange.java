import java.util.Scanner;
 public class AgeRange {
public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
   System.out.print("Enter your age: ");
      int age = input.nextInt();

if (age < 5) {
System.out.println("free");
}
else if (age <= 12) {
System.out.println("$5");
}
else if (age < 64) {
System.out.println("$12");
}
else
System.out.println("$8");
}
}
