package Operators;

public class AssignmentAndCompoundAssignment {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 100;

        int m = 0;
        m = m+y; //20
        System.out.println(m);//20
        m+=y;
        System.out.println(m);//40

        z-=y; //z=z-y
        System.out.println(z);//80

        z*=y; //z=z*y =80*20; 1600
        System.out.println("Value of z is: "+z);

        z/=y; //z=z/y; 1600/20 = 80
        System.out.println(z);

    }




}
