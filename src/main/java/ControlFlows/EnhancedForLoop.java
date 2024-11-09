package ControlFlows;

public class EnhancedForLoop {

    public static void main(String[] args) {

        int[] numArray = new int[6];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i + 10;
        }

        for (int x : numArray) {//we cannot print the index position like for loop
            System.out.println(x);
        }
    }
}
