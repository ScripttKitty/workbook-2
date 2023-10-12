/**
 * @author Annie Santamaria
 */


import java.util.Scanner;


package com.pluralsight;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "Yikes";
        System.out.printf(message);

        for (int i = 0; i < message.length(); i ++){
            System.out.println( message.charAt(i) );
        }

        for (int i = message.length() -1 ; i  >= 0 ; i--) {
            System.out.println( message.charAt(i) );
        }

        String first = getStringInput(scanner, "Enter your first name: ");
        String middle = getStringInput(scanner, "Enter your middle name or initial:");
        String last = getStringInput(scanner, "Enter your last name: ");
        String title = getStringInput(scanner, "Enter your title: ");

        System.out.println(first + middle + last + title);

     //  first = first.replace( first.charAt(0), Character.toUpperCase(first.charAt(0)));

        if (middle.length() == 1 ) middle = middle + ".";

        if (! title.isBlank() ) title = ", " +title;
        title = title.toUpperCase();


        System.out.println(first + " " + middle + " " + last + title);




        }


    }

