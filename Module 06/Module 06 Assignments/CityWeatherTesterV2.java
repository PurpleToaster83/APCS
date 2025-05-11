/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    public static void heading(String city, String state, String tempUnit, String precipUnit, double[] temperature, double[] precipitation, String[] months, double averageTemp, double totalPrecipitate) {
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("     Location: " + city +", " + state);
        System.out.println("Month           Temperature (" +  tempUnit + ")     Precipitation (" + precipUnit + ")");
        System.out.println();
        System.out.println("***************************************************");
        for(int index = 0; index < temperature.length; index++)
        {
            System.out.printf("%-4s %20.2f %20.2f\n", months[index], temperature[index], precipitation[index]);
        }
        System.out.printf("\nAverage: %.2f %s    Total: %.2f %s\n", averageTemp, tempUnit, totalPrecipitate, precipUnit); 
    }    
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        //String city = "Tallahassee"
        String city = "Miami";
        String state = "Florida";
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //double[] temperature = {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};
        //double[] precipitation = {5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};
        double [] temperature = {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};
        double [] precipitation ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};
    
        String tempLabel = "F";
        String precipLabel = "in.";
        
        CityWeatherV2 weatherTester = new CityWeatherV2(month, temperature, precipitation);

        double averageTemp = weatherTester.averageTemp();
        double totalPrecip = weatherTester.totalPrecipitate();              

        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        tempLabel = in.nextLine().toUpperCase(); 
        System.out.print("Choose the precipitation scale (in = inches, cm = centimeters): ");
        precipLabel = in.nextLine().toLowerCase();         

        if(tempLabel.equals("C")) {
            weatherTester.toCelsius();
        }

        if(precipLabel.equals("cm")) {
            weatherTester.toCentimeters();
        }
        heading(city, state, tempLabel, precipLabel, temperature, precipitation, month, averageTemp, totalPrecip);
    }
}

