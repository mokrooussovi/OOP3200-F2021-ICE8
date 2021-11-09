/**
 * @author: Ivan Mokrooussov
 * @studentID: 100808605
 * @date: November 8, 2021
 * @assignment: OOP3200-08 ICE8
 * @description: Java data types. Logic, arrays, and strings in Java.
 */

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // definition Scanner It allows get input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Input
        // It can be initialized as null or empty "" marks
        String name = null;
        // Other way printout can be println
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        boolean isValidInput = false; // sentinel variable

        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age >= 120.0f)) {
                    System.out.println("Error: Age must be between 0.0 and 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: Entry for age must be a float type number.");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while (!isValidInput);

        // multi-dimension array

        System.out.println("Multi-Dimension Array example");
        int rows = 8;
        int cols = 8;

        float[][] board = new float[rows][cols];


        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                board[0][j] = (float) (Math.random()*100.0) + 1.0f;
            }
        }
        System.out.println("Showing 10 Random Values: ");

        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random()*rows);
            var randCols = (int)(Math.random()*cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);

        }

        // Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}

