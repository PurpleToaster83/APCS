 /**
 * Purpose: This class defines a basic Terrain.
 *
 * @author William Van Uitert
 * @version 03/02/2025
 */

 public class Terrain
 {
     // instance variables
     private int length, width;
 
     // Constructor for objects of class Terrain
     public Terrain(int l, int w)
     {
         // initialize instance variables
         length = l;
         width = w;
     }
 
     public String getInfo()
     {
         return "Land has dimensions " + length + " X " + width;
     }
 }