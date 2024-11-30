package Variables;

public class StaticVariables {

    static int x;

    public static void main(String[] args) {

        StaticVariables s1 = new StaticVariables();
        StaticVariables s2 = new StaticVariables();

        //s1.x=10; //not required to create the objects
        //System.out.println(s1.x);
        //System.out.println(s2.x);
        StaticVariables.x = 10;

        System.out.println(x);
        System.out.println(x);
    }
}
