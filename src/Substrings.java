public class Substrings {
    public static void main(String [] args) {
        String word = "apple";

        //a string's length is its number of characters
        System.out.println(word + "'s length is " + word.length());

        // print the word the number of times that's the same as length
        for (int i = 0; i <word.length(); i++)
            System.out.println(word);

        //a substring is a part of a string indicated by an index or indices

        //index is a position and indexing starts at 0
        //-index 2 is the second p in apple
        System.out.println(word.substring(2));

        //index 0 is the first index so this prints the whole word
        System.out.println(word.substring(0));

        //with two numbers, substring will produce the part of the string
        //including the beginning index but excluding the ending index
        System.out.println(word.substring(2, 4)); //index 4 is not included

        //if you use indices that are beyond the length of a string,
        //the program will crash from an out-of-bounds error
        //System.out.println(word.substring(10, 20));

        //isolate just the l in apple
        //for a single character, use consecutive indices
        System.out.println(word.substring(4, 5));

        System.out.println();

        //print each letter of word on its own line
        for (int i = 0; i < word.length(); i++)
            System.out.println(word.substring(i, i+1));

        //spell word backwards on the same line
        //elppa
        for (int i = word.length(); i > 0; i--) {
            System.out.print(word.substring(i-1, i));
        }
        System.out.println();

        //same but with incrementing loop
        int len = word.length();
        for (int i = 0; i < word.length(); i++) {
            //last index is length - 1, second to last is length - 2, etc
            System.out.print(word.substring( len - i - 1,  len - i));
        }

        System.out.println();

        //determine whether word is a palindrome
        //a palindrome is a word spelled the same forward and backward
        word = "racecar";

        //if word length is 6, need 3 comparisons
        // if word length is 7, need 3 comparisons
        //-need half the length number of comparisons (int division is fine)
        boolean isPal = true;

        for (int i = 0; i < word.length()/2; i++) {
            String firstLetter = word.substring(i, i+1);

            //mirror position letter starting from back of word
            String secondLet = word.substring(word.length() - i - 1, word.length() - i);

            //if the two opposing letters don't match, not a pal
            if (!firstLetter.equals(secondLet)) {
                isPal = false;
            }
        }

        if (isPal)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is NOT a palindrome");







    }
}
