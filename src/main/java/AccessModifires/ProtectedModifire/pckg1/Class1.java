package AccessModifires.ProtectedModifire.pckg1;
//Its package restriction and allow in subclasses
public class Class1 {

    protected int x=9;

    protected void method1(){
        System.out.println("I am in Method1");
    }

    public void method2(){
        System.out.println(x);
        method1();
    }


}
