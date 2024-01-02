package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab058 {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char , I will tell if it vowel");
        //aeiou

        char user_input= sc.next().toCharArray()[0];
        switch (user_input) {
            case 'a':
                System.out.println("vowelt");
                break;
            case 'e':
                System.out.println("vowelt");
                break;
            case 'i':
                System.out.println("vowelt");
                break;
            case 'o':
                System.out.println("vowelt");
                break;
            case 'u':
                System.out.println("vowelt");
                break;
            default:
                System.out.println("not a vowel it's a consonent");
        }
    }
}
