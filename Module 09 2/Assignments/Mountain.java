 /**
 * Purpose: This class defines a Mountain Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class Mountain extends Terrain {
    private int numMountains;

    public Mountain(int l, int w, int numMountains){
        super(l, w);
        this.numMountains = numMountains;
    }

    @Override
    public String getInfo() {
        return "Mountain " + super.getInfo() + " and has " + numMountains + " mountains";
    }
}
