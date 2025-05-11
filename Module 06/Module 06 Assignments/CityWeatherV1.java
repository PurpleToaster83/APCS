/**
 * Purpose: to create a class that uses arrays to make weather calculations
 * 
 * @author William Van Uitert
 * @version 12/16/24
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] months;
    private double[] temperature;
    private double[] precipitation;

    // constructor with parameters
    public CityWeatherV1(String[] months, double[] temperature, double[] precipitation) {
        this.months = months;
        this.temperature = temperature;
        this.precipitation = precipitation;
    }

    public void setMonths(String[] newMonth) {
        months = newMonth;
    }

    public void setTemp(double[] newTemp) {
        temperature = newTemp;
    }

    public void setPrecipitate(double[] newPrecipitate) {
        precipitation = newPrecipitate;
    }

    public String[] getMonths() {
        return months;
    }

    public double[] getTemp() {
        return temperature;
    }

    public double[] getPrecipitate() {
        return precipitation;
    }

    public double averageTemp() {
        double sum = 0;
        for(int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return (sum / temperature.length);
    }

    public double totalPrecipitate() {
        double sum = 0;
        for(int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum;
    }

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
