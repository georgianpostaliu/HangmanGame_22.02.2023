package com.Hangman.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman3 {
        /**
        * This method is fully functional, for hangman game.
        * */
    public static void main(String[] args) throws IndexOutOfBoundsException {

        //TODO use a char array for the word, ex: char[] word = new char[8]; char[0] = 'k';

        char[] word = new char[8];
        word[0] = 'k';
        word[1] = 'e';
        word[2] = 'y';
        word[3] = 'b';
        word[4] = 'o';
        word[5] = 'a';
        word[6] = 'r';
        word[7] = 'd';

        char[] blank = new char[8];
        blank[0] = '_';
        blank[1] = '_';
        blank[2] = '_';
        blank[3] = '_';
        blank[4] = '_';
        blank[5] = '_';
        blank[6] = '_';
        blank[7] = '_';

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing the game!");
        System.out.println("Enter character:");

        System.out.print(blank);

        while (true){
            String symbol = scanner.next();

            if (symbol.length() > 1) {
                System.out.println("Exiting the game...");
                System.exit(200);
            }
            for (int i = 0 ; i < word.length; i++){
                char s = symbol.charAt(0);

                if (!Arrays.toString(word).contains("" + s)){
                    System.out.println("incorrect");
                    break;
                }

                if (word[i] == s){
                    blank[i] = s;

                    System.out.println("correct");
                } else {
                    System.out.println("incorrect");
                }

            }
            System.out.print(blank);


            if (!(new String(blank).contains("_"))) {
                System.out.println(" You won!");
                break;
            }

        }


    }
}
