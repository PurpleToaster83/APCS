 /**
 * Purpose: This class defines a Desert Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class Desert extends  Terrain{
    private double humidity;

    public Desert(int l, int w, double humidity) {
        super(l, w);
        this.humidity = humidity;
    }

    @Override
    public String getInfo() {
        return "Desert " + super.getInfo() + " and has " + humidity + " humidity";
    }
}
