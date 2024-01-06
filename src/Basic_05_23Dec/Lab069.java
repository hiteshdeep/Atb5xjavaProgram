package src.Basic_05_23Dec;

import java.util.Scanner;

public class Lab069 {

    public static void main(String[] args) {


        Scanner user_input=new Scanner(System.in);
        System.out.println("Enter you name");
        String name = user_input.next();


        System.out.println("Enter you age");
        int age= user_input.nextInt();

        System.out.println("enter you salary");
        double salary = user_input.nextDouble();

        System.out.println(" your detail are" + name +"-"+age + "-"+salary +"-" );
    }
}
