 /**
 * Purpose: This class defines a Pine Forest Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class PineForest extends Forest {
    private int numTrees;
    private double avgTreeHeight;

    public PineForest(int l, int w, int numTrees, double avgTreeHeight) {
        super(l, w, numTrees);
        this.avgTreeHeight = avgTreeHeight;
    }

    @Override
    public String getInfo() {
        return "Pine " + super.getInfo() + " and has trees around " + avgTreeHeight + " tall";
    }
}