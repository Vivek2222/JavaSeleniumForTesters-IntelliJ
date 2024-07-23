package Operators;

public class IncrementDecrement {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z;

        z = y-x;

        System.out.println(x); //10
        x=x+1;
        System.out.println(x);//11
        System.out.println(x++); //Postfix //11
        System.out.println(x);//12
        System.out.println(++x); //Prefix //13
        System.out.println(x);//13
        System.out.println(x--); //Postfix //13
        System.out.println(x);//12
        System.out.println(--x); //Prefix //11
        System.out.println(x);//11
    }
}












