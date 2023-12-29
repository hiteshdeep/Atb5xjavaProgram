package src.Basic_03_16Dec;

public class Lab027 {

    public static void main(String[] args) {

        //Casting - Mold
        // widening  is the  process of converting lower type of higher type

        byte a=10;
        int b= a; //Implicite casting - JVM
        System.out.println(b);


        int  a1=300;
        byte b1=(byte)a1;
        System.out.println(b1);

    }
}
