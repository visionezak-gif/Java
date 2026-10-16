public class Balance{
public static void main(String[] args){

double balance = 5000.00;
double deposit = 1200.50;
double withdrawals = 750.25;
double interest = 1.5 / 100;

double finalBalance = balance + deposit - withdrawals + interest;

System.out.printf("%.2f", finalBalance);
}

}

