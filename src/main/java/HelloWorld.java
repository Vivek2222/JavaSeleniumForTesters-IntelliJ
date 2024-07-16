public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        checkdatatype();
    }

    public static void checkdatatype() {
        int num1 = 45;
        int num2= 50;
        int num3 = num1 + num2;

        float val1 = 23.4f;
        float val2 = 56.7f;
        float val3 = val1 + val2;


        char charval1 = 'c';

        boolean isvalid = true;

        String s = "Vivek";

        System.out.println("char is "+charval1);
        System.out.println("Value is "+isvalid);
        System.out.println("String is "+s);
    }
}