/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    @Override
    // String to display when object is printed.
    public String toString()
    {
        return "Box - " + getWidth() + " X " +  getLength() + " X " + getHeight(); 
    }

    @Override
    public boolean equals(Object object) {
        Box4 shape = (Box4)object;
        if(getLength() == shape.getLength() && getWidth() == shape.getWidth() && height == shape.getHeight()) {
            return true;
        }
        return false;
    }
}
