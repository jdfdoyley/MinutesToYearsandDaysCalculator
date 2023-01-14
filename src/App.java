/**
 * Author: Jason D'Oyley
 * Date: Jan 14, 2023
 * Section: 5 - Expressions, Statements & More
 * Topic: Coding Exercise 10 - Minutes to Years and Days Calculator
 */

public class App {
    public static void main (String[] args) {
        printYearsAndDays(-1);          // Prints Invalid Input
        printYearsAndDays(0);           // Prints 0 min = 0 y and 0 d
        printYearsAndDays(525600);      // Prints 525600 min = 1 y and 0 d
        printYearsAndDays(1051200);     // Prints 1051200 min = 2 y and 0 d
        printYearsAndDays(561600);      // Prints 561600 min = 1 y and 25 d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // days = hours from minutes / hours in a day
            int days = ((int) (minutes / 60)) / 24;
            int years = days / 365;
            int remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
