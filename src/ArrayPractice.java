public class ArrayPractice {
    public static void main(String [] args) {

        //declare a string array called names that holds
        //4 values
        String [] names = new String [4];

        //indexing begins at 0
        names[0] = "grayson";
        names[1] = "natalie";
        names[2] = "blake";
        names[3] = "jonathan";

        System.out.println("value at index 2 is " + names[2]);

        //prints the memory location of the array - not useful
        System.out.println(names);

        //loop through all indices in names
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        //for-each loop aka enhanced for loop

        //"for each String n in the array names")
        //IMPORTANT - know how to read for-each loops,
        //but you're not required to write them yourself
        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        //for-each loops don't have access to indexing
        //-iterate through all values sequentially
        //-can't set/change values using for-each loops

        //n will iterate through the VALUES not indices
        for (String n: names) {
            n = "batman";
            //n is a temporary variable accessible in the loop,
            //but it doesn't make changes to the array
        }

        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        //regular for loops WILL make changes
        for(int i = 0; i < names.length; i++)
            names[i] = "batman";

        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        int [] nums = {5, 3, 4, 5, 1, 6, 4, 2, 4};

        //variable type of a for-each loop
        // needs to match the array type
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //count and output how many 4s are in nums
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count++;
            }
        }
        System.out.println("number of 4s: " + count);

        count = 0;
        for (int n: nums) {
            //don't use n as an index - n is a VALUE
            if (n == 4) {
                count++;
            }
        }
        System.out.println("number of 4s: " + count);

        //swap the first and last values
        //(5 at index 0, 4 at index length-1)
        int temp = nums[0];
        nums[0] = nums[ nums.length - 1 ];
        nums[ nums.length-1 ] = temp;

        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();




    }
}
