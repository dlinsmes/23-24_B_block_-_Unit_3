public class TwoDimensionalArrays {
    public static void main(String [] args) {

        //2d array - arrays made of smaller arrays
        int [][] numbers = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12} };
        //use 2d arrays like a grid

        //-need two indices to refer to a specific value
        //first index refers to row
        //second index refers to position within a row (col)
        System.out.println("row 0 col 2 is " + numbers[0][2]);
        System.out.println("row 2 col 0 is " + numbers[2][0]);

        //2d array's length is the number of rows (subarrays)
        System.out.println("number of rows: " + numbers.length);

        //to get number of columns:
        System.out.println("number of cols: " + numbers[0].length);

        //print row at index 1 (5, 6, 7, 8)
        System.out.println("row 1:");

        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");
        System.out.print(numbers[1][3] + " ");

        System.out.println();

        //iterate through quantity of values within the row
        for (int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i] + " ");
        }
        System.out.println();

        //for-each loop - treat the row as an array
        for (int n : numbers[1]) {
            System.out.print(n + " ");
        }
        System.out.println();

        //can't use for-each loops to iterate through columns

        //print column 2: 3, 7, 11
        System.out.println("col 2:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][2]+ " ");
        }
        System.out.println();
        System.out.println();

        //print out the whole 2d array as a grid
        //iterate through rows
        for (int i = 0; i < numbers.length; i++) {

            //iterate through each index within the row
            for (int j = 0; j < numbers[0].length; j++) {
                //"\t" is a tab character for consistent column spacing
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println();
        //for-each loop printout
        for (int [] row: numbers) {
            for(int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }

        String [] names = {"bob", "lola", "joe"};
        String [] subjects = {"computer", "multivariable", "history", "math"};

        //2d int array that represents the grades of each name in each subject
        //each row represents a student
        //each col represents a subject

        //initialize with dimensions - number of rows and number of cols
        int [][] grades = new int[3][4];

        grades[0][0] = 60;
        grades[0][1] = 102;
        grades[0][2] = 90;
        grades[0][3] = 82;

        grades[1][0] = 70;
        grades[1][1] = 95;
        grades[1][2] = 92;
        grades[1][3] = 94;

        grades[2][0] = 90;
        grades[2][1] = 500;
        grades[2][2] = 2;
        grades[2][3] = 94;

        System.out.println("grades:");

        for (int i = 0; i < grades.length; i++) {
            System.out.print(names[i] + ":\t" );
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }

        //calculate and print the average grade each student has in their 4 classes
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum = sum + grades[i][j];
            }
            int avg = sum/grades[i].length;
            System.out.println(names[i] + "'s avg: " + avg);
        }
        System.out.println();

        //calculate and print subject avgs across all students (col avgs)
        //outer loop should iterate through cols
        for (int j = 0; j < grades[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {

                sum = sum + grades[i][j];
            }
            int avg = sum/grades.length;
            System.out.println(subjects[j] + " subject avg: " + avg);
        }


    }
}
