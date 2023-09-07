package com.Hangman.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        ArrayList<String> letter = new ArrayList<>();
        letter.add("k");
        letter.add("e");
        letter.add("y");
        letter.add("b");
        letter.add("o");
        letter.add("a");
        letter.add("r");
        letter.add("d");

        ArrayList<String> blank = new ArrayList<>();
        blank.add("__");
        blank.add("__");
        blank.add("__");
        blank.add("__");
        blank.add("__");
        blank.add("__");
        blank.add("__");
        blank.add("__");

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing the game!");
        System.out.println("Enter character:");

//        Obj obj = new Obj("keyboard");
//        obj.contains('c'); //intoarce boolean si verifica daca cuvantul format in constructor contine litera
//        obj.check('k'); // verifica daca cuvantul contine litera si o scoate, intoarce boolean
//        search On complexity - google

        System.out.print(blank);

        while (true) {
            String symbol = scanner.next();

            if (symbol.length() > 1) {
                System.out.println("Exiting the game...");
                System.exit(200);
            }

            for (int i = 0; i < letter.size(); i++) {

                if (symbol.equals(letter.get(i))) {
                    blank.set(i, symbol);
                    //letter.set(i, "");
                    System.out.println("correct");
                }

            }
            System.out.print(blank);
            if (!blank.contains("__")) {
                System.out.println("You won!");
                break;
            }
        }
    }
}
