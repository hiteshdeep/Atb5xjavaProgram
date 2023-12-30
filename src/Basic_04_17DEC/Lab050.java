package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab050 {

    public static void main(String[] args) {

      /*  if(true){

            System.out.println("True");

        }if(false){

            System.out.println("false");
        }
         if(true){
             System.out.println("true");
         }*/

        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        if(number > 20){
            System.out.println("your number is > 20");
        }else if (number > 10) {
            System.out.println("your number is > 10");
            
        }else {
            System.out.println("your number is < 20");
        }

    }
}
