/**
 * Purpose: to create a class that uses arrays to make weather calculations
 * 
 * @author William Van Uitert
 * @version 12/16/24
 */

public class CityWeatherV2 {
    // private instance variables - three arrays
    private String[] months;
    private double[] temperature;
    private double[] precipitation;

    // constructor with parameters
    public CityWeatherV2(String[] months, double[] temperature, double[] precipitation) {
        this.months = months;
        this.temperature = temperature;
        this.precipitation = precipitation;
    }

    public void setMonths(String[] newMonth) {
        months = newMonth;
    }

    public void setTemp(double newTemp, int index) {
        temperature[index] = newTemp;
    }

    public void setPrecipitate(double newPrecipitate, int index) {
        precipitation[index] = newPrecipitate;
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

    public void toCelsius() {
        for(int tempIndex = 0; tempIndex < temperature.length; tempIndex++) {
            setTemp((temperature[tempIndex] - 32) * (5.0 / 9.0), tempIndex);
        }
    }

    public void toCentimeters() {
        for(int precipitationIndex = 0; precipitationIndex < precipitation.length; precipitationIndex++) {
            setPrecipitate(precipitation[precipitationIndex] * 2.54, precipitationIndex);
        }
    }
}
