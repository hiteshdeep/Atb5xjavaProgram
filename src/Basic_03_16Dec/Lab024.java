package src.Basic_03_16Dec;

import com.sun.tools.javac.Main;

public class Lab024 {

    public static void main(String[] args) {


        int a=12;
        //boolean b= a>10 || a < 5;
       // System.out.println(b);

        boolean b= !(a>10 || a < 5);
        System.out.println(b);
    }
}
