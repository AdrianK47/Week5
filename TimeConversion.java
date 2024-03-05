import java.util.*;
public class TimeConversion {
    public static void main(String[] args){
        int timeMins;
        int timeHrs;
        int mins;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        timeMins = input.nextInt();

        timeHrs = (timeMins - (timeMins % 60)) / 60;
        mins = timeMins % 60;
        
        System.out.println("The time is: " + timeHrs + ":" + mins);
    }
}
