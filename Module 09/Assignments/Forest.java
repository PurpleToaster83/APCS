 /**
 * Purpose: This class defines a Forest Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class Forest extends Terrain {
    private int numTrees;

    public Forest(int l, int w, int numTrees) {
        super(l, w);
        this.numTrees = numTrees;
    }

    @Override
    public String getInfo() {
        return "Forest " + super.getInfo() + " and has " + numTrees + " trees";
    }
}
