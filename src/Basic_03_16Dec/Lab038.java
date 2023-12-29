package src.Basic_03_16Dec;

public class Lab038 {

    public static void main(String[] args) {

        int a=50;
        int b=40;
        int c=30;



        int max = (a>b) ? ((a>c)? a:c) : ((b>c)? b:c);
        System.out.println(max);


    }
}
