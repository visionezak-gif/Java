import java.util.Scanner;
    public class Heartbeat {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
   System.out.print("Enter your age: ");
int age = input.nextInt();

int maximum = 220 - age;
double lowTargetRate = maximum * 0.50;
double highTargetRate = maximum * 0.85;

System.out.println("Maximum heart rate is" + maximum);
System.out.println("Low target rate is" + lowTargetRate);
System.out.println("High target rate is" s+ highTargetRate);

}
}
