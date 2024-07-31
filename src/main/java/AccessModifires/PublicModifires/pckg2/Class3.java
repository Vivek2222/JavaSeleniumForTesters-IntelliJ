package AccessModifires.PublicModifires.pckg2;

import AccessModifires.PublicModifires.pckg1.Class1;

public class Class3 {

    Class1 c1 = new Class1();

    public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }
}
