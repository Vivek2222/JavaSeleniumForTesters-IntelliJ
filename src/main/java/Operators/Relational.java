package Operators;

public class Relational {
    public static void main(String[] args) {

        /*Relational operators
        ==
        !=
        >
        <
        <=
        >=
         */

        int x =10;
        int y =20;

        if(x==y){ //10==20
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        System.out.println("*********************************");
        if(x!=y){ //10!=20
            System.out.println("Not Equal");
        }
        else{
            System.out.println("Equal");
        }
        System.out.println("*********************************");
        if(x>y){ //10>20
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("*********************************");
        if(x<y){ //10<20
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("*********************************");
        if(x<=y){ //10<=20
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("*********************************");
        if(x>=y){ //10>=20
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
