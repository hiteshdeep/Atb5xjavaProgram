package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab051 {

    public static void main(String[] args) {


        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // 1. Input from user
        // Score(Data type) -> int  -> Grade ( char or String)
        // DAA- Ask for the confirmation of the doubts


        // 2. Basic login or Brute force Logic write basic rough code
        // if score >= 90 && score  <=100 -> print A
        // else if score >= 80 && score  89 <= 100 -> print B


        // 3. Write the real code


        Scanner sc= new Scanner(System.in);


        int score= sc.nextInt();
        System.out.println("Enter the Student score");
        char grade='F';


        if (score >= 90 && score  <=100 ){


            System.out.println("your score" );


        }if(score >= 80 && score  <=89){

            System.out.println("Your score is ->B");
        }if(score >= 70 && score  <=79) {

            System.out.println("Your score is ->C");
        }if(score >= 60 && score  <=69) {

            System.out.println("Your score is ->D");
        }if(score >= 50 && score  <=59) {

            System.out.println("Your score is ->E");
        }if(score >= 0 && score  <=49) {

            System.out.println("Your score is -> F");
        }




        // 4. Debug the code
        // We are debug and checking the code. ->
        // Other than int -> code fails - we will fix
        // Exceptions - in future.
        // tHIS PROGRAM DOES not run again and again.
    }
}
