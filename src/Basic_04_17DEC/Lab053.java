package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab053 {

    public static void main(String[] args) {


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
    }
}
