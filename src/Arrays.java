import java.util.Scanner;

public class Arrays {
    public static void main(String [] args) {
        String word = "bob";

        //length - how many characters
        System.out.println(word.length());

        //indexing (positioning) starts at 0
        //substring beginning at index 1 is "ob"
        System.out.println(word.substring(1));

        //substring with two numbers will include the starting
        //index character and exclude the ending index
        System.out.println(word.substring(1, 2));

        //arrays - hold multiple values to a single variable name
        //each value is referenced with an index (position)
        //indexing begins at 0

        //declare a string array called words and initialize the
        //length of the array to 4 - can hold 4 values
        //-arrays are different from lists bc the size needs to be
        //predefined and you can't add more items than the size allows
        String [] words = new String [4];

        //words[0] = "red";
        words[1] = "befuddle";
        words[2] = "orange";
        words[3] = "huh? oh i don't know";

        //an element or value is what's saved at a particular index (position)
        System.out.println("element at index 3 is: " + words[3]);

        //doesn't work - index is out of bounds
        //System.out.println(words[6]);

        //an array's length is how many values it holds
        System.out.println(words.length);

        //when an array value is not initialized, it defaults to
        //String: null (nothing)
        //int: 0
        //double: 0.0
        //boolean: false
        System.out.println(words[0]);

        //default values only initialize for arrays, not single-value variables
        String word2;
        //System.out.println(word2);


        //if you tru to print an array without using indices, you get the memory location
        //(isn't useful)
        System.out.println(words);

        //instead - need to print each value by index
        //indexing always begins at 0 and ends at length-1

        //use a for loop to iterate through valid indices
        for (int i = 0; i < words.length; i++) {
            //i iterates 0-3 - use as index in array to print values
            System.out.println(words[i]);
        }

        //if you know the initial values -
        int [] nums = {4, 7, 8, 19, 2};
        System.out.println("value at index 2 is " + nums[2]);

        //die roll problem using an array
        int [] count = new int [6];
        System.out.println(count[3]);
        //{ count for 1s, count for 2s, ...., count for 6s }

        for (int i = 0; i < 1000000; i++) {
            int roll = (int)(Math.random() * 6 + 1);
            count[roll-1]++;
            //the roll result can be used as an index if it's offset by 1
            // (bc indexing starts at 0)
        }

        //print out each roll result value using loop
        for (int i = 0; i < count.length; i++) {
            //use 1 to offset the value back to the die roll result
            System.out.println("Number of " + (i+1) + "s: " + count[i]);
        }

        int [] nums2 = new int[10];
        //assign random numbers [1, 10] to each position in nums2, then print out the array
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = (int)(Math.random() * 10 + 1);
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        //ask the user how many items they want to add to their shopping cart, then ask
        //for each item to add to the cart. when finished, print the whole cart

        Scanner s = new Scanner(System.in);
        System.out.println("how many items?");
        int numItems = s.nextInt();
        s.nextLine();

        //length of array depends on user's previous input num
        String [] cart = new String[numItems];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("what are you adding to your cart?");
            String item = s.nextLine();
            cart[i] = item; //can also say cart[i] = s.nextLine();
        }
        for (int i = 0; i < numItems; i++) {
            System.out.println("item #" + i + ": " + cart[i]);
        }

        //prompt the user for the index of the item they want printed
        //and keep going until they enter -1

        System.out.println("enter the index of the cart item you want or enter -1 to stop");
        //while loop bc this keeps going until user enters -1
        int index = s.nextInt();
        while (index != -1) {
            //validate input index
            if (index < -1 || index >= numItems)
                System.out.println("invalid, try again");
            else
                System.out.println("item at index " + index + " is: " + cart[index]);

            System.out.println("enter the index of the cart item you want or enter -1 to stop");
            index = s.nextInt(); //important to get a new input to avoid an infinite loop

        }


    }
}
