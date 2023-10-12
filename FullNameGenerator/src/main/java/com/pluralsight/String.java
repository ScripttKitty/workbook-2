package com.pluralsight;

import java.util.Scanner;

public class String {

    String first;
    String last;
    String middle;
    String title;
    public static String getStringInput(Scanner scanner, java.lang.String prompt) {
        System.out.println(prompt);
        java.lang.String input = scanner.nextLine();
        return input;
    }

}
