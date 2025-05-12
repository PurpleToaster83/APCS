/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    @Override
    // String to display when object is printed.
    public String toString()
    {
        return "Rectangle - " + width + " X " +  length;
    }

    @Override
    public boolean equals(Object object) {
        Rectangle4 shape = (Rectangle4)object;
        if(length == shape.getLength() && width == shape.getWidth()) {
            return true;
        }
        return false;
    }
}
