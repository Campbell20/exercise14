package com.LowerCaseVowelCounter;

import java.util.Scanner;

/**   
 * Name: John Campbell
 * Section: COSC/ITSE Intro to Programing
 * Exercise 14
 * Description: This program:
 * 1. gets the user's string,
 * 2. finds the lower-case vowels in the string,
 * 3. outputs a counter for each vowel type,
 * 4. outputs a counter for all the non-vowels in the string.
 **/

public class LowerCaseVowelCounter {
    //counter variables for each of the vowels and a single non-vowel counter
    private int intACounter = 0;
    private int intECounter = 0;
    private int intICounter = 0;
    private int intOCounter = 0;
    private int intUCounter = 0;
    private int intNotVowelCounter = 0;

    //string variable for user input
    private String strInput = "";
    private Scanner objInput = new Scanner(System.in);

    //get the user's input and return that value to other functions
    private String UserInput() {
        System.out.println("Type anything you'd like and I will determine how many lower-case vowels you typed.");
        System.out.println("Begin typing now: ");
        strInput = objInput.next();
        return strInput;
    }

    //count all of the vowels and non-vowels in the string
    private void vowelCounter(){
        UserInput();
        for(int intIndex = 0; intIndex < strInput.length(); intIndex++) {
            switch (strInput.charAt(intIndex)) {
                case 'a': //for every "a" add 1 to the "a" counter
                    intACounter++;
                    break;
                case 'e': //for every "e" add 1 to the "e" counter
                    intECounter++;
                    break;
                case 'i': //for every "i" add 1 to the "i" counter
                    intICounter++;
                    break;
                case 'o': //for every "o" add 1 to the "o" counter
                    intOCounter++;
                    break;
                case 'u': //for every "u" add 1 to the "u" counter
                    intUCounter++;
                    break;
                default: //for everything else add 1 to the non-vowel counter
                    intNotVowelCounter++;
                    break;
            }

        }

    }

    //print the vowel count to the console
    public void PrintVowelCounter(){
        vowelCounter();
        System.out.println(
                "Your lower-case vowel count is - \n" +
                        "a: " + intACounter + "\n" +
                        "e: " + intECounter + "\n" +
                        "i: " + intICounter + "\n" +
                        "o: " + intOCounter + "\n" +
                        "u: " + intUCounter + "\n" +
                        "everything else: " + intNotVowelCounter + "\n");
        resetCounters();
    }

    //reset all the counters back to zero
    private void resetCounters(){
        intACounter = 0;
        intECounter = 0;
        intICounter = 0;
        intOCounter = 0;
        intUCounter = 0;
        intNotVowelCounter = 0;
    }
}
