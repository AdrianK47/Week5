/**
 * Name: Adrian Kang
 * Date: 3/13/24
 * Program Name: Order.java
 */
import java.util.*;
import java.text.NumberFormat;
public class Order {
    public static void main(String[] args){
        double burger = 1.69;
        double fries = 1.09;
        double soda = 0.99;
        String customer; 
        int numberOfBurgers;
        int numberOfFries;
        int numberOfSodas;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        customer = input.nextLine();

        System.out.print("Enter the number of burgers: ");
        numberOfBurgers = input.nextInt();

        System.out.print("Enter the number of fries: ");
        numberOfFries = input.nextInt();

        System.out.print("Enter the number of sodas: ");
        numberOfSodas = input.nextInt();

        NumberFormat money = NumberFormat.getCurrencyInstance();

        double total = (numberOfBurgers * burger) + (numberOfFries * fries) + (numberOfSodas * soda);
        double tax = (total * .085);
        double fullTotal = total + tax;
        double amountTendered;

        System.out.println("Total before tax: " + money.format(total));
        System.out.println("Tax: " + money.format(tax));
        System.out.println("Final Total: " + money.format(fullTotal));
        System.out.print("Enter the amount tendered: ");
        amountTendered = input.nextDouble();

        double change = amountTendered - fullTotal;
        System.out.println("Change: " + money.format(change));

    }
}
