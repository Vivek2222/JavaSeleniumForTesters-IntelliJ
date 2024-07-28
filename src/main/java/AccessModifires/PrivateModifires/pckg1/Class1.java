package AccessModifires.PrivateModifires.pckg1;
//only access to the same class
public class Class1 {

    private int x=9;

    private void method1(){
        System.out.println("I am in Method1");
    }

    public void method2(){
        System.out.println(x);
        method1();
    }


}
