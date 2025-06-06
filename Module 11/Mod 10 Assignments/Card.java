/**
 * Card.java
 * Card represents a playing card.
 *
 *  William Van Uitert
 *  04/12/2025
 */

public class Card {

   private String suit;      // the suit of the card
   private String rank;      // the rank of the card
   private int pointValue;   // the point value of the card

    /**
    * Creates a new Card instance.
    *
    * @param cardRank  a String value
    *                  containing the rank of the card
    * @param cardSuit  a String value
    *                  containing the suit of the card
    * @param cardPointValue an int value
    *                  containing the point value of the card
    */
   public Card(String rank, String suit, int pointValue) {
      this.rank = rank;
      this.suit = suit;
      this.pointValue = pointValue;
   }

   /**
    * Accesses this Card's suit.
    * @return this Card's suit.
    */
    public String suit() {
      return suit;
    }

   /**
    * Accesses this Card's rank.
    * @return this Card's rank.
    */
   public String rank() {
      return rank;
   }

    /**
    * Accesses this Card's point value.
    * @return this Card's point value.
    */
   public int pointValue() {
      return pointValue;
   }

   /** Compare this card with the argument.
    * @param otherCard the other card to compare to this
    * @return true if the rank, suit, and point value of this card
    *              are equal to those of the argument;
    *         false otherwise.
    */
   public boolean matches(Card otherCard) {
      if(otherCard.rank() != rank || otherCard.suit() != suit || otherCard.pointValue() != pointValue) {
         return false;
      }
      return true;
   }

   /**
    * Converts the rank, suit, and point value into a string in the format
    *     "[Rank] of [Suit] (point value = [PointValue])".
    * This provides a useful way of printing the contents
    * of a Deck in an easily readable format or performing
    * other similar functions.
    *
    * @return a String containing the rank, suit,
    *         and point value of the card.
    */
   @Override
   public String toString() {
      return String.format("%s of %s (point value = %d)", rank, suit, pointValue);
   }
}
