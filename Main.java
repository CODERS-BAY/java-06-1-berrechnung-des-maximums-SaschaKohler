package com.sksoft;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int MAXSIZE = 100;
        Scanner scanner = new Scanner(System.in);
        boolean breakIt = false;
        int counter = 0;
        int[] numbers = new int[MAXSIZE];

        System.out.println("Bitte geben Sie eine Zahl ein und bestätigen Sie mit [enter] (q für Abbruch): ");
        do {
            String readline = scanner.nextLine();
            if (readline.equalsIgnoreCase("q")) {
                breakIt = true;
            } else {
                numbers[counter] = Integer.parseInt(readline);
                counter++;
            }

        } while (!breakIt);

        int[] extractedNumbers = new int[counter];
        System.out.println(numbers.length +" -> "+ extractedNumbers.length);

        for (int i = 0; i < counter; i++) {
            extractedNumbers[i] = numbers[i];
        }

        int max = extractedNumbers[0];
        for (int i = 1; i < counter; i++) {
            if(extractedNumbers[i] > max) {
                max = extractedNumbers[i];
            }

        }
        System.out.println("Maximum = "+ max);
        System.out.println("EInen schönen Tag. Auf Wiedersehen!");

    }
}
