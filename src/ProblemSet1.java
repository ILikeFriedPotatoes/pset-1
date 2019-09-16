/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 *
 * @author Joseph Wang
 */
public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */




         //Exercise 1 is not done yet, need to format correctly






        final double sheetLength = 11;
        final double sheetWidth = 8.5;
        final double conversionFactorMillimeters = 25.4;

        //converts sheetWidth and sheetLengthform inches to millimeters
        final double sheetLengthMillimeters = sheetLength * conversionFactorMillimeters;
        final double sheetWidthMillimeters = sheetWidth * conversionFactorMillimeters;
        final double area = sheetWidthMillimeters * sheetLengthMillimeters;
        System.out.printf("\n%,.2f" + " square millimeters. \n", area);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double conversionFactorCentimeters = 2.54;
         final double sheetLengthCentimeters = sheetLength * conversionFactorCentimeters;
         final double sheetWidthCentimeters = sheetWidth * conversionFactorCentimeters;
         final double sheetPerimeter = (2 * sheetLengthCentimeters) + (2 * sheetWidthCentimeters);
         System.out.printf("\n%.2f" + " centimeters. \n", sheetPerimeter);

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         final double sheetDiagonal = Math.sqrt( ( sheetLength * sheetLength ) + ( sheetWidth * sheetWidth ) );
         System.out.printf("\n%.2f" + " inches \n", sheetDiagonal);;

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;



        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */



        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
