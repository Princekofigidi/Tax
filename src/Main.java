import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// this line of code allow the user to input information
        Scanner src= new Scanner(System.in);

//variable declaration and assignment operators
        Double stateSalesTax = 0.04;
        Double countySalesTax = 0.02;
        Double totalSalesTax, purchase, totalSales;

        //receives input from user
        System.out.println("Whats your amount of purchase? ");
        purchase = src.nextDouble();

//calculation of total sales tax and total sales using the formular
        totalSalesTax = stateSalesTax + countySalesTax;
        totalSales = purchase + totalSalesTax;

        System.out.println("Purchases: " + purchase);
        System.out.println("State Sales Tax: " + stateSalesTax);
        System.out.println("County Sales Tax: " + countySalesTax);
        System.out.println("The Total Sales Tax: " + totalSalesTax);
        System.out.println("The Total Sales is: " + totalSales);

    }
}