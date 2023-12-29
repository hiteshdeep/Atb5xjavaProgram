package src.basic_02;

import java.sql.SQLOutput;

public class Lab007 {

    /**
     *
     *Author - Pramod Dutta
     * Program - showcase difference between printLn vs Print
     *
     *
     * @param args
     */
    public static void main(String[] args) {
       /* System.out.println("hello world ");
        System.out.println("Hitesh");*/

        int age= 34;
        /*
               %d -> any integer - byte int short  or long
               %s -> String
               %c -> character
        * */
        System.out.println("Your Age is"+ age );
        System.out.printf("Your Age is %d" ,age);
    }
}
