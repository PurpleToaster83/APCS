import java.util.ArrayList;

/**
 * Purpose:  This class defines a Election tester that uses arrays
 *
 * @author William Van Uitert
 * @version 01/13/2025
 */


public class ElectionTesterV5 {
    public static Candidate[] addCand(Candidate[] candidates, int pos, String name, int votes) {
        Candidate[] newArray = new Candidate[candidates.length + 1];
        boolean hit = false;
        for(int loc = 0; loc < newArray.length; loc++) {
            if(loc == pos) {
                newArray[pos] = new Candidate(name, votes);
                hit = true;
                continue;
            }
            else if(hit == true) {
                newArray[loc] = candidates[loc - 1];
                continue;
            }
            newArray[loc] = candidates[loc];
        }
        return newArray;
    }

    public static Candidate[] insertBefore(Candidate[] candidates, String nameFind, String name, int votes) {
        Candidate[] newArray = new Candidate[candidates.length + 1];
        int loc = 0;
        for(int index = 0; index < candidates.length; index++) {
            if(candidates[index].getName().equals(nameFind)) {
                loc = index;
                break;
            }
        }
        boolean hit = false;
        for(int c = 0; c < newArray.length; c++) {
            if(c == loc) {
                newArray[c] = new Candidate(name, votes);
                hit = true;
                continue;
            }
            else if(hit == false) {
                newArray[c] = candidates[c];
                continue;
            }
            newArray[c] = candidates[c - 1];
        }
        return newArray;
        }

    public static void replaceName(Candidate[] candidates, String candName, String replacementName) {
        for(Candidate activeCand : candidates) {
            if(activeCand.getName().equals(candName)) {
                activeCand.setName(replacementName);
            }
        }
    }

    public static void replaceVotes(Candidate[] candidates, String candName, int replacementVote) {
        for(Candidate activeCand : candidates) {
            if(activeCand.getName().equals(candName)) {
                activeCand.setVotes(replacementVote);
            }
        }
    }

    public static void replaceBoth(Candidate[] candidates, String candName, String replacementName, int replacementVote) {
        for(Candidate activeCand : candidates) {
            if(activeCand.getName().equals(candName)) {
                activeCand.setName(replacementName);
                activeCand.setVotes(replacementVote);
            }
        }
    }

    // method to print candidate names and votes
    public static void printRawData(Candidate[] candidates) {
        System.out.println("Raw Election Data:");
        System.out.println();
        for(Candidate candidate : candidates) {
            System.out.println("\t" + candidate.toString());
        }
    }

    // method to count total votes in election 
    public static int totalVotes(Candidate[] candidates) {
        int sum = 0;
        for(Candidate activeCand : candidates) {
            sum += activeCand.getVotes();
        }
        return sum;
    }

    //method to print a table
    public static void printTable(Candidate[] candidates, int total) {
        //System.out.println("Election Results:");
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
        Candidate[] candidates = {
                                    new Candidate("Candidate A", 200),
                                    new Candidate("Candidate B", 600),
                                    new Candidate("Candidate C", 535),
                                    new Candidate("Candidate D", 234),
                                    new Candidate("Candidate E", 543)
                                };
        
        System.out.println("Original Results:");
        //printRawData(candidates);
        //System.out.println();
        printTable(candidates, totalVotes(candidates));
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes(candidates));
        System.out.println();
        /*
        System.out.println("<<Change Candidate A to Candidate Z>>");
        System.out.println();
        replaceName(candidates, "Candidate A", "Candidate Z");
        printTable(candidates, totalVotes(candidates));
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes(candidates));
        System.out.println();
        System.out.println("<<Change Candidate B votes to 200>>");
        System.out.println();
        replaceVotes(candidates, "Candidate B", 200);
        System.out.println();
        printTable(candidates, totalVotes(candidates));
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes(candidates));
        System.out.println();
        System.out.println("<<Change Candidate C to Candidate Y with 400 votes>>");
        System.out.println();
        replaceBoth(candidates, "Candidate C", "Candidate Y", 400);
        System.out.println();
        printTable(candidates, totalVotes(candidates));
        System.out.println();
        System.out.println("The total number of votes is: " + totalVotes(candidates));
        */

        System.out.println("Add Candidate:");
        System.out.println();
        Candidate[] candidatesNew = addCand(candidates, 2, "Candidate R", 100);
        printTable(candidatesNew, totalVotes(candidatesNew));
        System.out.println();
        System.out.println("Add Candidate Prior:");
        System.out.println();
        Candidate[] candidatesNewer = insertBefore(candidates, "Candidate B", "Candidate W", 345);
        printTable(candidatesNewer, totalVotes(candidatesNewer));
    }
}
