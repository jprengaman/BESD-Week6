# BESD-Week6
Back End Software Development - Week 6 Coding Assignment
Coding Steps:
For the final project you will be creating an automated version of the classic card game WAR.
- Create the following classes.
  - Card
    - Fields
      - value (contains a value from 2-14 representing cards 2-Ace)
      - name (e.g. Ace of Diamonds, or Two of Hearts)
    - Methods
      - Getters and Setters
      - describe (prints out information about a card)
  - Deck
    - Fields
      - cards (List of Card)
  -  Methods
      - shuffle (randomizes the order of the cards)
      - draw (removes and returns the top card of the Cards field)
      - In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
  - Player
    - Fields
      - hand (List of Card)
      - score (set to 0 in the constructor)
      - name
    - Methods
      - describe (prints out information about the player and calls the describe method for each card in the Hand List)
      - flip (removes and returns the top card of the Hand)
      - draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
      - incrementScore (adds 1 to the Player’s score field)
- Create a class called App with a main method.
- Instantiate a Deck and two Players, call the shuffle method on the deck.
- Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
- Using a traditional for loop, iterate 26 times and call the flip method for each player.
  - Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
- After the loop, compare the final score from each player.
- Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

[BESD Week 6 - War.docx](https://github.com/jprengaman/BESD-Week6/files/8885346/BESD.Week.6.-.War.docx)

