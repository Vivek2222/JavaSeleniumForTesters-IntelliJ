package OOPS.Polymorphism.OverLoading;

//Overloading means multiple methods with the same name but different parameter lists within the same class
public class OverLoading {

    public void walk() {

        System.out.println("Walking");
    }

    public void walk(int x) {

        System.out.println("Variable int x is Walking");
    }

    public void walk(String x) {

        System.out.println("Variable string x is Walking");
    }

    public String walk(Boolean x) {
        return "Walking";
    }


}
