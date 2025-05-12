 /**
 * Purpose: This class tests the Terrain hierarchy.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

public class GameTerrainTester {
    public static void main(String[] args) {
        int l = 20;
        int w = 20;
        int numMountains = 2;
        int numTrees = 2;
        double temp = 45;
        double humidity = 20;
        double avgTreeHeight = 50.5;

        Terrain terrain = new Terrain(l, w);
        Mountain mountain = new Mountain(l, w, numMountains);
        WinterMountain winterMountain = new WinterMountain(l, w, numMountains, temp);
        Forest forest = new Forest(l, w, numTrees);
        PineForest pineForest = new PineForest(l, w, numTrees, avgTreeHeight);
        Desert desert = new Desert(l, w, humidity);

        System.out.println();
        System.out.println(terrain.getInfo());
        System.out.println(mountain.getInfo());
        System.out.println(winterMountain.getInfo());
        System.out.println(forest.getInfo());
        System.out.println(pineForest.getInfo());
        System.out.println(desert.getInfo());
        System.out.println();

    }

}
