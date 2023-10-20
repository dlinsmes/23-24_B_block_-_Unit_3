import java.util.Scanner;

public class CardGame {

    public static void main(String [] args) {

        String [] suits = {"spades", "diamonds", "hearts",  "clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //print out every combination of rank and suit
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                System.out.println(ranks[j] + " of " + suits[i]);
            }
        }
        System.out.println();

        //for-each loop way
        //loop variables are strings bc the array types are string
        for (String suit: suits)
            for (String rank: ranks)
                System.out.println(rank + " of " + suit);

        //randomly generate a card
        //two random numbers - rank and suit
        int rankI = (int)(Math.random() * 13);
        int suitI = (int)(Math.random() * 4);

        System.out.println("random card is " + ranks[rankI] + " of " + suits[suitI]);

        int [] deck = new int[52];

        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        //0 - Ace of spades, 1 - 2 of spades, ..., 12 - king of spades
        //13 - Ace of diamonds...
        //26 - Ace of hearts...
        //39 - Ace of clubs...

        for (int i = 0; i < 52; i++) {

            //% 13 will produce values [0, 12] - indices for ranks
            String rank = ranks[ i % 13 ];
            // / 13 will produce [0, 3] - indices for suits
            String suit = suits[ i / 13 ];

            System.out.println(i + " is the " + rank + " of " + suit);

        }

        //shuffle the deck - use random numbers
        // -swap the value at one random index with the value at another index
        for (int i = 0; i < 52; i++) {
            int randomI = (int)(Math.random() * 52);

            //swap the values at indices i and randomI
            int temp = deck[i];
            deck[i] = deck[randomI];
            deck[randomI] = temp;
        }

        for (int i = 0; i < 200; i++) {
            //two random indices
            int randomI = (int)(Math.random() * 52);
            int randomI2 = (int)(Math.random() * 52);

            //swap the values at indices i and randomI
            int temp = deck[randomI2];
            deck[randomI2] = deck[randomI];
            deck[randomI] = temp;

        }


        //print shuffled deck
        for (int i = 0; i < 52; i++) {

            //% 13 will produce values [0, 12] - indices for ranks
            String rank = ranks[ deck[i] % 13 ];
            // / 13 will produce [0, 3] - indices for suits
            String suit = suits[ deck[i] / 13 ];

            System.out.println(deck[i] + " is the " + rank + " of " + suit);

        }

        int [] hand = new int [7];

        //write a game where the user first draws 7 cards
        //from the deck to add to their hand. Then keep asking the user
        //for the index of the card in their hand that they want to
        //replace with a new card drawn the deck. Continue this until the
        //user has 4 of a kind (same rank) in their hand OR there are
        //no more cards in the deck

        //top of deck
        //increment top as you "draw" to keep track of where the next
        //"top" card is in the deck. Use top as an index in the deck
        int top = 0;

        //draw 7 cards from deck and add to hand
        for (int i = 0; i < 7; i++) {
            hand[i] = deck [top];
            top++;
        }

        System.out.println();
        Scanner s = new Scanner(System.in);


        //while no 4 of kind and top < 52:
        boolean fourOfKind = false;

        while (fourOfKind == false && top < 52) {

            //print the hand
            System.out.println("your hand:");

            //print cards in hand
            for (int i = 0; i < 7; i++) {
                int cardValue = hand[i];
                String rank = ranks[cardValue % 13];
                String suit = suits[cardValue / 13];
                System.out.println(i + " is the " + rank + " of " + suit);
            }

            //ask for a hand index of card to replace
            System.out.println("what card index do you want to replace?");
            int index = s.nextInt();

            //draw a new card from the deck for that hand index
            int newCard = deck[top];
            top++;
            hand[index] = newCard;

            //check for 4 of kind in the hand
            for (int i = 0; i < 7; i++) {
                int cardRankI = hand[i] % 13;

                int sameRankCount = 0;

                //check the ranks of all other cards in the hand
                //to see if they're the same as the rank of card i
                for (int j = i; j < 7; j++) {
                    int cardRankJ = hand[j] % 13;
                    if (cardRankJ == cardRankI) {
                        //count how many of the same card are in the hand
                        sameRankCount++;
                    }
                }

                if (sameRankCount == 4) {
                    fourOfKind = true;
                }

            }

        }

        //print the hand
        System.out.println("your hand:");

        //print cards in hand
        for (int i = 0; i < 7; i++) {
            int cardValue = hand[i];
            String rank = ranks[cardValue % 13];
            String suit = suits[cardValue / 13];
            System.out.println(i + " is the " + rank + " of " + suit);
        }

    }



}
