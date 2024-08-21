package ExceptionalHandling;

public class ThrowsKeyword {

    public static void main(String[] args) {

        ThrowsKeyword c1 = new ThrowsKeyword();
        System.out.println("In Main Method");
        try {
            c1.method2(0);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("In Catch");
        }
        System.out.println("In Main Method 2");
    }

    public void method2(int y) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        method1(y);
    }

    public void method1(int x) throws ArithmeticException, ArrayIndexOutOfBoundsException{
            int y = 0;
            int[] numArray = new int[6];
            System.out.println(numArray[7]);

            y = 100 / x;
            System.out.println("Value of Y is: " + y);

        System.out.println("I am inside method1");
    }
}
