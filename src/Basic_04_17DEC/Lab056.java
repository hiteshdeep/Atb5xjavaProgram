package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab056 {

    public static void main(String[] args) {

            //if->switch condition - multiple condition
        // Loop -> which will repeat something
        // for,  while, dowhile
        //which day is today

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of day I will tell which day it is ");
        // 1 ->  Monday, 7 -> Sunday,  MTWTFSS , invalid -> 99 - are you mad?
        int daynumber = sc.nextInt();

       // String day=null;

        switch (daynumber){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thus");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("YOU ARE MAD ");
                break; //this break optional if default is the last option

        }

        System.out.println("-END OF THE PROGRAM-");




    }
}
