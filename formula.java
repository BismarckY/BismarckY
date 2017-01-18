//单向链表
public final class JavaIntList {
  static class Node {
    public Node next;
    public int value;
  }
  public Node head;
//  public int size;
  private int size;
  public int getSize() {    //Java Bean
    return size;
  }
}

/**
  * Sorts the cards in the hand so that cards of the same suit are
  * grouped together, and within a suit the cards are sorted by value.
  * Note that aces are considered to have the lowest value, 1.
  */
 public void sortBySuit() {
     ArrayList<Card> newHand = new ArrayList<Card>();
     while (hand.size() > 0) {
         int pos = 0;  // Position of minimal card.
         Card c = hand.get(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) {
             Card c1 = hand.get(i);
             if ( c1.getSuit() < c.getSuit() ||
                     (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {
                 pos = i;
                 c = c1;
             }
         }
         hand.remove(pos);
         newHand.add(c);
     }
     hand = newHand;
 }



 /**
  * Sorts the cards in the hand so that cards of the same value are
  * grouped together.  Cards with the same value are sorted by suit.
  * Note that aces are considered to have the lowest value, 1.
  */
 public void sortByValue() {
     ArrayList<Card> newHand = new ArrayList<Card>();
     while (hand.size() > 0) {
         int pos = 0;  // Position of minimal card.
         Card c = hand.get(0);  // Minimal card.
         for (int i = 1; i < hand.size(); i++) {
             Card c1 = hand.get(i);
             if ( c1.getValue() < c.getValue() ||
                     (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {
                 pos = i;
                 c = c1;
             }
         }
         hand.remove(pos);
         newHand.add(c);
     }
     hand = newHand;
 }
