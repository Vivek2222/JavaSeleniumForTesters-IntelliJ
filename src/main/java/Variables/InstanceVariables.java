package Variables;

public class InstanceVariables {

    public int x;

    public float y;

    String name;

    char char1;

    boolean isValid;

    public void method1() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        InstanceVariables c1 = new InstanceVariables();
        InstanceVariables c2 = new InstanceVariables();
        InstanceVariables c3 = new InstanceVariables();

        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.name);
        System.out.println(c1.char1);
        System.out.println(c1.isValid);

        c1.x = 10;

        System.out.println(c1.x);
        System.out.println(c2.x);
    }
}
