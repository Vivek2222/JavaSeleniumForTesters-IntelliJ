package ExceptionalHandling;

public class TryCatchBlock {

    public static void main(String[] args) {

        TryCatchBlock c1 = new TryCatchBlock();
        c1.method1(0);

    }

    public void method1(int x) {
        try {
            int y = 0;
            y = 100 / x;
            System.out.println("Value of Y is: " + y);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception handled");
            //e.printStackTrace();
        }
        System.out.println("I am inside method1");
    }
}
