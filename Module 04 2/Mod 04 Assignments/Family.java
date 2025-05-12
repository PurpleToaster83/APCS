/*
 * Purpose: to find the percentage of boy-girl combination with sample data
 *
 * @author William Van Uitert
 * @version 10/26/24
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String[] args) throws IOException
    {
        int lineCount = 0;
        int BBCount = 0;
        int GGCount = 0;
        String token = "";

        String fileName = "/Users/williamvanuitert/Desktop/VLACS/APCS/Module 04/Mod 04 Assignments/FamilyMembers.txt";

        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext()) {
            lineCount += 1;
            token = inFile.next();
            
            if(token.equals("BB")) {
                BBCount += 1;
            }
            else if (token.equals("GG")) {
                GGCount += 1;
            }
        }
        inFile.close();

        System.out.println("Composition statistics for families with two children.");
        System.out.println();
        System.out.println("Total number of families: " + lineCount);
        System.out.println();
        System.out.println("Number of families with");
        System.out.println("\t2 boys: " + BBCount + " represents " + (100 * BBCount / lineCount) + "%");
        System.out.println("\t2 girls: " + GGCount + " represents " + (100 * GGCount / lineCount) + "%");
        System.out.println("\t1 boy and 1 girl: " + (lineCount - (BBCount + GGCount)) + " represents " + (100 * (lineCount - BBCount - GGCount) / lineCount) + "%");
        System.out.println();
    }
}