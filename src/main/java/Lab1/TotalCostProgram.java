package Lab1;
import java.util.Scanner;
public class  TotalCostProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the name of the product: ");
        String product = scanner.next();


        System.out.println(" Enter the quantity: ");
        int quantity = scanner.nextInt();


        System.out.println(" Enter the distance: ");
        double distance = scanner.nextDouble();



        double price = 0.0;
        if (distance >= 0 && distance <= 4) {
            price = 2.0;

        } else if (distance >= 5 && distance <= 15) {
            price = 5.0;

        } else if (distance >= 16 && distance <= 25) {
            price = 10.0;

        } else if (distance >= 26 && distance <= 50) {
            price = 15.0;

        } else if (distance >= 51) {
            price = 20.0;

        }

        double total = quantity * price ;
       
        System.out.printf( "%-15s %4s %9.1s %9.1s %9.1s%n" ,"Product" ,"Qty","Price" ,"Miles","Total");

        System.out.println("----             ---       -----      -----     -----");


        System.out.printf("%-15s %4d  %9.1f   %9.1f  %9.1f%n", product, quantity, price ,  distance  , total);
    }

}
