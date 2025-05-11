/**
 * This class defines a Cube object using
 * length.
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class Cube4 extends Box4{

    public Cube4(int l) {
        super(l, l, l);
    }

    @Override
    public String toString() {
        return "Cube - " + getLength() + " X " +  getLength() + " X " + getLength();
    }
    
    @Override
    public boolean equals(Object object) {
        if(super.equals(object)) {
            return true;
        }
        return false;
    }
}
