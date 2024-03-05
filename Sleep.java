import java.util.*;
import java.text.NumberFormat;
public class Sleep {
    public static void main(String[] args){
        int bYear;
        int bMonth;
        int bDay;
        int cYear;
        int cMonth;
        int cDay;

        Scanner input = new Scanner(System.in);
        NumberFormat comma = NumberFormat.getIntegerInstance();

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        bYear = input.nextInt();
        System.out.print("Month: ");
        bMonth = input.nextInt();
        System.out.print("Day: ");
        bDay = input.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        cYear = input.nextInt();
        System.out.print("Month: ");
        cMonth = input.nextInt();
        System.out.print("Day: ");
        cDay = input.nextInt();

        int timeAlive = ((cYear - bYear) * 365) + ((cMonth - bMonth) * 30) + (cDay - bDay);
        int timeSlept = timeAlive * 8;

        System.out.println("You have been alive for " + comma.format(timeAlive) + " days.");
        System.out.println("You have slept for " + comma.format(timeSlept) + " hours.");


    }
}
