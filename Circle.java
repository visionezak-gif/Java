import java.util.Scanner;
public class Circle {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter radius");
 int radius = input.nextInt();

double area = 3.1459 * radius * radius;
int diameter = radius * 2;
double circumference = 2* 3.14159 * radius;

System.out.printf("area = %f %n", area);
System.out.printf("diameter = %d %n", diameter);
System.out.printf("circumference = %f %n", circumference);

}
}
