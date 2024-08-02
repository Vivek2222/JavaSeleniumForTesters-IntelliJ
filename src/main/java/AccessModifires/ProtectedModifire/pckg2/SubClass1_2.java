package AccessModifires.ProtectedModifire.pckg2;

import AccessModifires.ProtectedModifire.pckg1.Class1;

//Outside package variable and method are not allowed
public class SubClass1_2 extends Class1 {

    public void method2(){
        System.out.println(x);
        method1();
    }
}
