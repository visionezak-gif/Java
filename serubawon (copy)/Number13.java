import java.util.Scanner;
public class Number13{
public static void main(String[] args){


  Scanner input = new Scanner(System.in);
System.out.print("Enter price: ");
 double price = input.nextDouble();
 
 System.out.print("Enter quantity: ");
 double quantity= input.nextDouble();
 
 double subTotal = price * quantity;
 double VAT = subTotal * 0.20;
 double grandTotal = subTotal + VAT;
 

}

}
