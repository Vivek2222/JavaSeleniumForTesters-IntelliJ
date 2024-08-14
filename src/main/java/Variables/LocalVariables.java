package Variables;

import AccessModifires.PublicModifires.pckg1.Class1;

public class LocalVariables {

    int x;

    public void method1(){
        int z; //Scope of the local varibale limited to the local area that is method only
        //System.out.println(z);

    }

    public static void main(String[] args) {
        LocalVariables l1 = new LocalVariables();
        l1.method1();
    }
}
