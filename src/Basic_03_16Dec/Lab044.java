package src.Basic_03_16Dec;

import com.sun.tools.javac.Main;

public class Lab044 {

    public static void main(String[] args) {


        int a=10;
        System.out.println(--a + a++ +  ++a);
        System.out.println(a);

        // Part - A ( Exp = 9, a = 9  ) -> --a -> O/P -> 9
        // Part - B ( Exp = 9, a = 10  ) -> a++ -> O/P ->10
        // Part - C ( Exp = 10, a = 11  ) -> a++ -> O/P -> 11

    }
}
