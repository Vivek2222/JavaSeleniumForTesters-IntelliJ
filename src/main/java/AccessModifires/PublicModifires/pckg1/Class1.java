package AccessModifires.PublicModifires.pckg1;

public class Class1 {

    public int x=9;

    public void method1(){
        System.out.println("I am in Method1");
    }

    public void method2(){
        System.out.println(x);
        method1();
    }


}
