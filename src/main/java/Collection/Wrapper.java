package Collection;

public class Wrapper {

    public static void main(String[] args) {
        int x = 9;

        //Boxing
        Integer i = new Integer(x);
        System.out.println(i.intValue());

        //Unboxing
        int y= i.intValue();
        System.out.println("Primitive datatype for y value is: "+y);

        //Autoboxing
        Integer a = 10;
        System.out.println(a.intValue());
    }
}
