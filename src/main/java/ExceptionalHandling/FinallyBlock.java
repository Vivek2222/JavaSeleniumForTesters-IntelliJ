package ExceptionalHandling;

public class FinallyBlock {

    public static void main(String[] args) {

        FinallyBlock c1 = new FinallyBlock();
        c1.method1(0);

    }

    public void method1(int x) {
        try {
            int y = 0;
            y = 100 / x;
            System.out.println("Value of Y is: " + y);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled");
            //e.printStackTrace();
        } finally {
            System.out.println("Exception handled and reached to finally block");
        }
        System.out.println("I am inside method1");
    }

}
