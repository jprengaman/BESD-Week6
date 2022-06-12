package com.promineotech.wargame;

import java.util.ArrayList;

public class Cards implements Comparable<Cards>{
  private Suit suit;
  private Value value;
  private int rank;
  private static ArrayList<Cards> cardsDeck = new ArrayList<Cards>();

  public Cards(Suit suit, Value value, int rank) {
      this.suit = suit;
      this.value = value;
      this.rank = rank;
  }

  static ArrayList<Cards> createStack() {
      for (int i = 1; i < 14; i++) {
          switch (i) {
              case 1:
                  for (Value value : Value.values()
                  ) {
                      cardsDeck.add(new Cards(Suit.Hearts, value, i++));
                  }
                  i = 1;
              case 14:
                  for (Value value : Value.values()
                  ) {
                      cardsDeck.add(new Cards(Suit.Diamonds, value, i++));
                  }
                  i = 1;
              case 27:
                  for (Value value : Value.values()
                  ) {
                      cardsDeck.add(new Cards(Suit.Clubs, value, i++));
                  }
                  i = 1;
              case 40:
                  for (Value value : Value.values()
                  ) {
                      cardsDeck.add(new Cards(Suit.Spades, value, i++));
                  }
                  i = 1;

          }

      } return cardsDeck;

  }
  
  static ArrayList<Cards> dealStack(int i) {
    return cardsDeck;    
  }

  //public static void main(String[] args) {}


  @Override
  public String toString() {
      return "Cards{" +
              "suit=" + suit +
              ", value=" + value +
              ", rank=" + rank +
              '}';
  }

  @Override
  public int compareTo(Cards opponentCardRank) {
  if (this.rank > opponentCardRank.rank) {
      return -1;
  } if (this.rank < opponentCardRank.rank){
      return 1;
  } else {
      return 0;
      }
  }
}
