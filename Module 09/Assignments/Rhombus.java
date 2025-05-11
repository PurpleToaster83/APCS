/**
 * This class defines a Rhombus object using
 * 1 side lengths and an angle.
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class Rhombus extends Parallelogram
 {
    public int side;
    public double angle;

    public Rhombus(int side, double angle) {
        super(side, side, angle);
    }

    @Override
    // String to display when object is printed.
    public String toString()
    {
        return "Rhombus - " + getLength() + " X " +  getLength() + ", angle: " + getAngle();
    }

    @Override
    public boolean equals(Object object) {
        if(super.equals(object)) {
            return true;
        }
        return false;
    }
}
