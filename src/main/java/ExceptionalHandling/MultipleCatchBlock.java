package ExceptionalHandling;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        MultipleCatchBlock c1 = new MultipleCatchBlock();
        c1.method1(0);

    }

    public void method1(int x) {
        try {
            int y = 0;
            int[] numArray = new int[6];
            System.out.println(numArray[7]);// This will throw ArrayIndexOutOfBoundsException
            y = 100 / x;  // This will throw ArithmeticException if x is 0
            System.out.println("Value of Y is: " + y);
        } catch (ArithmeticException am) {
            System.out.println("Arithmetic exception handled");
            //am.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Array exception handled");
            //a.printStackTrace();
        } catch (Exception e){
            System.out.println("All exception handled");
        }
        //Cannot be able to add the exception type after Exception object
        System.out.println("I am inside method1");
    }
}
