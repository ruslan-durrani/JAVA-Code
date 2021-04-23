package Russi7kd;

import java.util.*;

public class Sort_Students {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Students: ");

        int x = input.nextInt();

        String[] studentNames = new String[x];

        int[] score = new int[x];

        for (int i = 0; i < x ; i++) {

            System.out.print((i+1)+") Student name: ");

            studentNames[i] = input.next();

            System.out.print(" Student score: ");

            score[i] = input.nextInt();
        }

        System.out.println("Sorting Data");

        sort(score,studentNames);

        for (int i = 0; i < x; i++) {

            System.out.println(studentNames[i]+" "+score[i]);

        }
    }


    public static void sort(int[] score , String[] students){

        for (int i = 0; i < score.length; i++) {

            int max = score[i];

            String maxStudent = students[i];

            for ( int j = i; j < score.length ; j++) {

                if (score[j] >= max){

                    max = score[j];

                    score[j] = score[i];

                    score[i] = max;

                    maxStudent = students[j];

                    students[j] =students[i];

                    students[i] = maxStudent;

                }

            }

        }

    }
}

