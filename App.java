package com.promineotech.wargame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {static Random random = new Random();
static Scanner scanner = new Scanner(System.in);
static ArrayList <Cards> deck = new ArrayList<>();
static ArrayList <Cards> playerOneDeck = new ArrayList<>();
static ArrayList<Cards> playerTwoDeck = new ArrayList<>();


public static void main(String[] args) {
  
    deck = Cards.createStack();
    for (int i = 0; i < deck.size(); i++) {
      Collections.swap(deck,randomizer(),i);
    }
    
    System.out.println("It's time for war! Let's play a game!\nPlayer One, please enter your name: ");
    String namePlayerOne = scanner.nextLine();

    System.out.println("Player Two, please enter your name: ");
    String namePlayerTwo = scanner.nextLine();
    
    for(int i=0; i < deck.size(); i++) {
      Cards tempCard = deck.get(i);
      if(i%2 == 0) {
          playerOneDeck.add(tempCard);
        }
      else
      { 
          playerTwoDeck.add(tempCard);
        }
    }

    int playerOneScore = 0;
    int playerTwoScore = 0;
    
    System.out.println("The game begins!");
    for (int turn = 0; turn < deck.size() / 2; turn++) {
    Cards playerOneTopCard = playerOneDeck.get(0);
    Cards playerTwoTopCard = playerTwoDeck.get(0);

    System.out.println(namePlayerOne + " plays: " + playerOneTopCard);
    System.out.println(namePlayerTwo + " plays: " + playerTwoTopCard);
    int comparable = playerOneTopCard.compareTo(playerTwoTopCard);

    System.out.println("The winner is: " + determineWinner(playerOneTopCard,playerTwoTopCard,comparable));
    if(comparable == -1) {
      playerOneScore ++;
    }
    else if(comparable == 1) {
      playerTwoScore ++;
    }
    else {
      
    }
    playerOneDeck.remove(0);
    playerTwoDeck.remove(0);
      
    }
    
    System.out.println("Final Score: " + namePlayerOne + ": " + playerOneScore + " --- " + namePlayerTwo + ": " + playerTwoScore);
    if (playerOneScore > playerTwoScore) {
      System.out.println(namePlayerOne + " wins!!");
    }
    else if (playerOneScore < playerTwoScore) {
      System.out.println(namePlayerTwo + " wins!!");
    }
    else {
      System.out.println("Unfortunately, in this game of war there were no winners.");
    }

}

static int randomizer(){
    return random.nextInt(26);
}
static String determineWinner(Cards playOneTopCard, Cards playerTwoTopCard, int comparable){
    if (comparable == -1){
        return "Player One!";
    } if (comparable == 1) {
        return "Player Two!";
    } else {
        return "It's a draw.";
    }
}
}
