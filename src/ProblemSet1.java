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






        final double SHEET_LENGTH = 11;
        final double SHEET_WIDTH = 8.5;
        final double CONVERSION_FACTOR_MILLIMETERS = 25.4;

        //converts SHEETWIDTH and SHEETLENGTHform inches to millimeters
        final double SHEET_LENGTH_MILLIMETERS = SHEET_LENGTH * CONVERSION_FACTOR_MILLIMETERS;
        final double SHEET_WIDTH_MILLIMETERS = SHEET_WIDTH * CONVERSION_FACTOR_MILLIMETERS;
        final double AREA = SHEET_WIDTH_MILLIMETERS * SHEET_LENGTH_MILLIMETERS;
        System.out.printf("\n%,.2f" + " square millimeters. \n", AREA);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double CONVERSION_FACTOR_CENTIMETERS = 2.54;
         final double SHEET_LENGTH_CENTIMETERS = SHEET_LENGTH * CONVERSION_FACTOR_CENTIMETERS;
         final double SHEET_WIDTH_CENTIMETERS = SHEET_WIDTH * CONVERSION_FACTOR_CENTIMETERS;
         final double SHEET_PERIMETER = (2 * SHEET_LENGTH_CENTIMETERS) + (2 * SHEET_WIDTH_CENTIMETERS);
         System.out.printf("\n%.2f" + " centimeters. \n", SHEET_PERIMETER);

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double diagonalLength = Math.hypot(SHEET_LENGTH, SHEET_WIDTH);
         System.out.printf("\n%.2f" + " inches \n", diagonalLength);;

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
        final double HOMEWORK_GRADE_WEIGHT = 0.15;
        final double QUIZ_GRADE_WEIGHT = 0.35;
        final double TEST_GRADE_WEIGHT = 0.5;
        double homeworkGradeTotal = ( homework1 + homework2 + homework3 ) * HOMEWORK_GRADE_WEIGHT / 3;
        double quizGradeTotal = ( quiz1 + quiz2 + quiz3 ) * QUIZ_GRADE_WEIGHT / 3;
        double testGradeTotal = ( test1 + test2 + test3 ) * TEST_GRADE_WEIGHT / 3;
        double finalGradeTotal = homeworkGradeTotal + quizGradeTotal + testGradeTotal;
        System.out.printf("\n%,.2f%%.\n", finalGradeTotal);

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double WAGE_PER_HOUR = 12.50;

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
