 /**
 * Purpose: This class defines a Winter Mountain Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class WinterMountain extends Mountain {
    private int numMountains;
    private double temp;

    public WinterMountain(int l, int w, int numMountains, double temp) {
        super(l, w, numMountains);
        this.temp = temp;
    }

    @Override
    public String getInfo() {
        return "Winter " + super.getInfo() + " and is " + temp + " degrees";
    }
}
