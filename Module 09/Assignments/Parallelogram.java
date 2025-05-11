/**
 * This class defines a Parallelogram object using
 * 2 side lengths.
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class Parallelogram  extends Rectangle4 {
    public int side;
    public int horizontal;
    public double angle;

    public Parallelogram(int side, int horizontal, double angle) {
        super((int)(side * Math.sin(angle)), horizontal);
        this.side = side;
        this.horizontal = horizontal;
        this.angle = angle;
    }

    public int getHeight() {
        return getWidth();
    }

    public int getSide() {
        return side;
    }

    public int getWidth() {
        return (int)(side * Math.sin(angle));
    }

    public int getHorizontals() {
        return horizontal;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    // String to display when object is printed.
    public String toString()
    {
        return "Parallelogram - " + getHeight() + " X " +  getWidth() + ", angle: " + getAngle();
    }

    @Override
    public boolean equals(Object object) {
        Parallelogram shape = (Parallelogram)object;
        if(getHeight() == shape.getHeight() && getWidth() == shape.getWidth() && angle == shape.getAngle()) {
            return true;
        }
        return false;
    }
}
