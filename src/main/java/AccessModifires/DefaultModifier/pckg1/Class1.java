package AccessModifires.DefaultModifier.pckg1;
//Its package restriction
public class Class1 {

    int x=9;//removed the public from variable

    void method1(){
        System.out.println("I am in Method1");
    }//removed the public from variable

    public void method2(){
        System.out.println(x);
        method1();
    }


}
