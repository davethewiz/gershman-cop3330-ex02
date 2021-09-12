/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String inputString = scanner.nextLine();

        System.out.print(inputString + " has " + inputString.length() + " characters.");
    }
}