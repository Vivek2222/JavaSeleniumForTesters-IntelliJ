package Operators;

import java.sql.SQLOutput;

public class Logical {

    public static void main(String[] args) {
        /*Logical Operators
        AND &&
        OR ||
        Not !
         */

        int x = 10;
        int y = 20;
        int z = 30;

        //cond1 : true
        //cond2 : false

        //cond1 && cond2
        //&&
        //True && True = True
        //True && False = False
        //False && True = False
        //False && False = False

        if (z > y  && y > x){ //true && True
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("***************************************");
        if (z > y  && x > y){ //true && false
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println("***********OR************");

        //cond1 || cond2
        //OR
        //True || True = True
        //True || False = True
        //False || True = True
        //False || False = False

        if (z > y  || y > x){ //true && True
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("***************************************");
        if (z > y  || x > y){ //true && false
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println("**************NOT****************");
        //Not
        //True = False
        //False = True
        if (!(z > y  || x > y)){ //!(t || f) => !(T) = F
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
