/**
 * This is a class that tests the Card class.
 *
 *  William Van Uitert
 *  04/12/2025
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card sixHeart = new Card("6", "hearts", 6);
      Card fourClub = new Card("4", "clubs", 4);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: six of hearts ****");
      System.out.println("  rank: " + sixHeart.rank());
      System.out.println("  suit: " + sixHeart.suit());
      System.out.println("  pointValue: " + sixHeart.pointValue());
      System.out.println("  toString: " + sixHeart.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: four of clubs ****");
      System.out.println("  rank: " + fourClub.rank());
      System.out.println("  suit: " + fourClub.suit());
      System.out.println("  pointValue: " + fourClub.pointValue());
      System.out.println("  toString: " + fourClub.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** mathches Tests ****");
      System.out.println("Ace of Hearts and Four of Clubs");
      System.out.printf("\t%s\n", aceHearts.matches(fourClub));
      System.out.println("Six of Hearts and Four of Clubs");
      System.out.printf("\t%s\n", sixHeart.matches(fourClub));
      System.out.println("Four of Clubs and Four of Clubs");
      System.out.printf("\t%s\n", fourClub.matches(fourClub));
   }
}
