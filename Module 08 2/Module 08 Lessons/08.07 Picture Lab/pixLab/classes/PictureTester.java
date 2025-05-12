/*
 * Purpose: to test the picture class
 * 
 * William Van Uitert
 * 23 Feb 2025
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture("images/beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
    beach.explore();
  }

  public static void testGrayscale() {
    Picture beach = new Picture("images/beach.jpg");
    Pixel[][] pixels = beach.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int avg = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen()) / 3;
        pixelObj.setRed(avg);
        pixelObj.setGreen(avg);
        pixelObj.setBlue(avg);
      }
    }
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("images/water.jpg");
    Pixel[][] pixels = water.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if(pixelObj.getBlue() > 155 && pixelObj.getRed() < 30 && pixelObj.getGreen() < 175) {
          pixelObj.setRed(255);
          pixelObj.setGreen(0);
          pixelObj.setBlue(0);
        }
      }
    }
    water.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture bike = new Picture("images/redMotorcycle.jpg");
    Pixel[][] pixels = bike.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        rightPixel = pixels[row][col];
        leftPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    bike.explore();
  }

  public static void testMirrorHorizontal() {
    Picture bike = new Picture("images/redMotorcycle.jpg");
    Pixel[][] pixels = bike.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++) {
      for (int row = 0; row < pixels.length / 2; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    bike.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture bike = new Picture("images/redMotorcycle.jpg");
    Pixel[][] pixels = bike.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length; 
    for (int col = 0; col < width; col++) {
      for (int row = 0; row < pixels.length / 2; row++) {
        bottomPixel = pixels[row][col];
        topPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    bike.explore();
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture("images/snowman.jpg");
    snowman.explore();
    Pixel[][] pixels = snowman.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    for (int col = 100; col < 300; col++) {
      for (int row = 165; row < 200; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 40][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture("images/seagull.jpg");
    gull.explore();
    Pixel[][] pixels = gull.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    for (int col = 225; col < 350; col++) {
      for (int row = 230; row < 330; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row][col + 150];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    gull.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












