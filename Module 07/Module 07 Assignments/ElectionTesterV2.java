/**
 * Purpose:  This class defines a Election tester that uses array listgs
 *
 * @author William Van Uitert
 * @version 01/13/2025
 */

 import java.util.ArrayList;

 public class ElectionTesterV2 {

    // method to print candidate names and votes
    public static void printRawData(ArrayList<Candidate> candidates) {
        System.out.println("Raw Election Data:");
        System.out.println();
        for(Candidate candidate : candidates) {
            System.out.println("\t" + candidate.toString());
        }
    }

    // method to count total votes in election 
    public static int totalVotes(ArrayList<Candidate> candidates) {
        int sum = 0;
        for(Candidate activeCand : candidates) {
            sum += activeCand.getVotes();
        }
        return sum;
    }

    //method to print a table
    public static void printTable(ArrayList<Candidate> candidates, int total) {
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate\tVotes Recieved\t   % of Total Votes");
        for(int i = 0; i < 52; i++) {
            System.out.print("=");
        }
        System.out.println();
        for(Candidate active : candidates) {
            System.out.printf("%s%13d\t\t%3.2f\n", active.getName(), active.getVotes(), (active.getVotes() / (double) total));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Candidate A", 200));
        candidates.add(new Candidate("Candidate B", 600));
        candidates.add(new Candidate("Candidate C", 535));
        candidates.add(new Candidate("Candidate D", 234));
        candidates.add(new Candidate("Candidate E", 543));

        printRawData(candidates);
        System.out.println();
        printTable(candidates, totalVotes(candidates));
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes(candidates));

    }
    
}
