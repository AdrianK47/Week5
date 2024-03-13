/**
 * Name: Adrian Kang
 * Date: 3/13/24
 * Progam Name: Taxi Application
 */
import java.util.*;
public class TaxiApplication {
    public static void main(String[] args){
        int passengers;
        int cabs;
        int leftOver;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of passengers: ");
        passengers = input.nextInt();

        cabs = passengers / 4;
        leftOver = passengers % 4;

        System.out.println(cabs + " cabs are required");
        System.out.println(leftOver + " passenger(s) will be left over");
    }
}
