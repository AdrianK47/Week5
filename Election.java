import java.util.*;
import java.text.NumberFormat;
public class Election{
    public static void main (String[] args){
        String candidate;
        String candidate2;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first candidate: ");
        candidate = input.next();

        System.out.print("Enter the second candidate: ");
        candidate2 = input.next();

        int nyVotes;
        int nyVotes2;

        System.out.print("Enter the New York votes for " + candidate + ": ");
        nyVotes = input.nextInt();

        System.out.print("Enter the New York votes for " + candidate2 + ": ");
        nyVotes2 = input.nextInt();

        int njVotes;
        int njVotes2;

        System.out.print("Enter the New Jersey votes for " + candidate + ": ");
        njVotes = input.nextInt();

        System.out.print("Enter the New Jersey votes for " + candidate2 + ": ");
        njVotes2 = input.nextInt();

        int cVotes;
        int cVotes2;

        System.out.print("Enter the Connecticut votes for " + candidate + ": ");
        cVotes = input.nextInt();

        System.out.print("Enter the Connecticut votes for " + candidate2 + ": ");
        cVotes2 = input.nextInt();

        NumberFormat percent = NumberFormat.getPercentInstance();

        int totalVotes = nyVotes + njVotes + cVotes;
        int totalVotes2 = nyVotes2 + njVotes2 + cVotes2;
        int realTotal = totalVotes + totalVotes2;
        double percentVotes = totalVotes / realTotal;
        double percentVotes2 = totalVotes2 / realTotal;

        System.out.println(percentVotes);

        System.out.println("Candidate\tVotes Percentage");
        System.out.println(candidate + "\t" + totalVotes + " " + percent.format(percentVotes));
        System.out.println(candidate2 + "\t" + totalVotes2 + " " + percent.format(percentVotes2));
        System.out.println("Total Votes:\t"+realTotal);

    }
}