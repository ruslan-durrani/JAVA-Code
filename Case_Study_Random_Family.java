package Russi7kd;
import java.util.*;
public class Case_Study_Random_Family {
    public static void main(String[] args) {
        char[] chars = createArray('a');
        System.out.println("The lowercase letters are:");
        displayArray(chars);
        int[] counts = countLetters(chars, 'a');
        System.out.println();
        System.out.println("The occurrences of small letters are:");
        displayCounts(counts,'a');
        char[] charsUpper = createArray('A');
        System.out.println("\nThe Uppercase letters are:");
        displayArray(charsUpper);
        int[] countUpper = countLetters(charsUpper , 'A');
        System.out.println();
        System.out.println("The occurrences of capital letters are:");
        displayCounts(countUpper,'A');
        char[] charsDigits = createArray('0');
        System.out.println("\nThe random Digits are:");
        displayArray(charsDigits);
        int[] countDigits = countLetters(charsDigits , '0');
        System.out.println();
        System.out.println("The occurrences of digits are:");
        displayCounts(countDigits,'0');
    }



    /** Create an array of characters */

    public static char[] createArray(char a) {
        char[] charsLower = new char[100];
        char[] charsUpper = new char[100];
        char[] charsDigits = new char[100];
        if (a == 'a'){
            for (int i = 0; i < charsLower.length; i++)
                charsLower[i] = randomCharacterLower();
            return charsLower;
        }

        if (a == 'A'){
            for (int i = 0; i < charsUpper.length; i++)
                charsUpper[i] = randomCharacterUpper();
            return charsUpper;
        }
        if (a == '0'){
            for (int i = 0; i < charsUpper.length; i++) {
                charsDigits[i] = randomNumber();
            }
            return charsDigits;
        }
        return charsDigits;
    }
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    public static int[] countLetters(char[] chars , char s) {
        int[] countsLower = new int[26];
        int[] countsUpper = new int[26];
        int[] countsDigits = new int[10];
        if(s == 'a'){
            for (int i = 0; i < chars.length; i++)
                countsLower[chars[i] - 'a']++;
            return countsLower;
        }
        else if (s == 'A'){
            for (int i = 0; i < chars.length; i++)
                countsUpper[chars[i] - 'A']++;
            return countsUpper;
        }
        else if (s == '0'){
            for (int i = 0; i < chars.length; i++)
                countsDigits[chars[i] - '0']++;
            return countsDigits;
        }
        return countsDigits;
    }
    public static void displayCounts(int[] counts , char a) {
        if(a == 'a')
            for (int i = 0; i < counts.length; i++) {
                if ((i + 1) % 10 == 0)
                    System.out.println(counts[i] + " " + (char)(i + 'a'));
                else
                    System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        if(a == 'A')
            for (int i = 0; i < counts.length; i++) {
                if ((i + 1) % 10 == 0)
                    System.out.println(counts[i] + " " + (char)(i + 'A'));
                else
                    System.out.print(counts[i] + " " + (char)(i + 'A') + " ");
            }
        if(a == '0')
            for (int i = 0; i < counts.length; i++) {
                if ((i + 1) % 4 == 0)
                    System.out.println(counts[i] + "  " + (char)(i + '0'));
                else
                    System.out.print(counts[i] + "  " + (char)(i + '0') + "  ");
            }
    }
    public static char random(char ch1, char ch2){
        return  (char)(ch1 + Math.random() * ( ch2 - ch1 + 1));
    }
    public static char randomNumber() {
        return  random('0','9');
    }
    public static char randomCharacterUpper(){
        return  random('A','Z');
    }
    public static char randomCharacterLower() {
        return random('a', 'z');
    }

}