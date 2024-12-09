package JavaBasic;

public class JavaArray {

    public static void main(String[] args) {

        int[] num;
        num = new int[4];
        num[0] = 10;

        int[] num2 = new int[]{3, 4, 5, 6};
        int[] num3 = new int[6];
        int[] num4 = {10, 11, 12};

        for (int i = 0; i < 6; i++) {
            num3[i] = i + 10;
        }

        for (int i : num3) {
            System.out.println(i);
        }
        System.out.println("==========================================================");
        for (int i : num4) {
            System.out.println(i);
        }
        //Array is not growable
        String[] names = new String[]{"Vivek", "Mania", "Raviv"};
        System.out.println(names.length);
    }
}
