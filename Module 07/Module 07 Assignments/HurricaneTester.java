/*
 * Purpose: Hurricane Object Tester
 * 
 * @author William Van Uitert
 * @version 01/10/25
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester {
    public static void main(String[] args) throws IOException {

        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        Scanner in = new Scanner(System.in);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
		//create an array to store the categories for each hurricane
        int[] category = new int[numValues];
        int[] catCount = {0, 0, 0, 0, 0};	
		
		//convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array
		for(int i = 0; i < numValues; i++) {
            windSpeeds[i] = windSpeeds[i] * 1.15078;
            if(windSpeeds[i] >= 157) {
                category[i] = 5;
            }
            else if(windSpeeds[i] >= 130) {
                category[i] = 4;
            }
            else if(windSpeeds[i] >= 111) {
                category[i] = 3;
            }
            else if(windSpeeds[i] >=96) {
                category[i] = 2;
            }
            else {
                category[i] = 1;
            }
        }
		
		//user prompted for range of years
        System.out.print("Range of Years: ");
        String range = in.nextLine();
        int start = Integer.parseInt(range.substring(0, 4));
        int finish = Integer.parseInt(range.substring(7));
        
		//create a Hurricane ArrayList of hurricane objects that are in the user's requested range
		ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>();
        for(int j = 0; j < numValues; j++) {
            hurricanes.add(new Hurricane(years[j], names[j], months[j], category[j], pressures[j], windSpeeds[j]));
        }

        double catAvg = 0;
        double pAvg = 0;
        double spdAvg = 0;
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        double pMin = Double.MAX_VALUE;
        double pMax = Double.MIN_VALUE;
        double sMin = Double.MAX_VALUE;
        double sMax = Double.MIN_VALUE;
        int count = 0;

		//print the hurricanes in the user's requested range
        System.out.println("\t\t\tHurricanes " + range);
        System.out.println("Year\tHurricane\tCategory\tPressure (mb)\t Wind Speed (mph)");
        for(int equals = 0; equals < 76; equals++) {
            System.out.print("=");
        }
        System.out.println();
        for(int k = 0; k < hurricanes.size(); k++) {
            Hurricane active = hurricanes.get(k);
            if(active.getYear() >= start && active. getYear() <= finish) {
                System.out.println(active.toString());
                catCount[active.getCat() - 1]++;
                catAvg += active.getCat();
                catMin = (active.getCat() < catMin) ? active.getCat() : catMin;
                catMax = (active.getCat() > catMax) ? active.getCat() : catMax;
                pAvg += active.getPressure();
                pMin = (active.getPressure() < pMin) ? active.getPressure() : pMin;
                pMax = (active.getPressure() > pMax) ? active.getPressure() : pMax;
                spdAvg += active.getWindspeed();
                sMin = (active.getWindspeed() < sMin) ? active.getWindspeed() : sMin;
                sMax = (active.getWindspeed() >  sMax) ? active.getWindspeed() : sMax;
                count++;
            }
            //don't keep running the loop past the finish date
            else if(count >= 1) {
                break;
            }
        }
        catAvg /= (double)count;
        spdAvg /= (double)count;
        pAvg /= (double)count;

        for(int equals = 0; equals < 76; equals++) {
            System.out.print("=");
        }
        
        System.out.println();
        System.out.printf("\tAverage:\t%1.1f\t\t %3.1f\t\t  %3.2f\n", catAvg, pAvg, spdAvg);
        System.out.printf("\tMinimum:\t%d\t\t %3.0f\t\t  %3.2f\n", catMin, pMin, sMin);
        System.out.printf("\tMaximum:\t%d\t\t%4.0f\t\t  %3.2f\n", catMax, pMax, sMax);

        System.out.println();
        System.out.println("Summary Of Categories:");
        for(int c = 0; c < 5; c++) {
            System.out.println("Cat " + (c + 1) + ": " + catCount[c]);
        }
        System.out.println();
     }
}