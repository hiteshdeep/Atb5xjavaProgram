package src.Basic_04_17DEC;

import java.util.Scanner;

public class Lab057 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name Chrome , Firefox, edge,opera");
        String browser=sc.next();
        switch (browser){
            case "Chrome" :
                System.out.println("Execute the Chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code ");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea  which browser  is this");


        }





    }
}
