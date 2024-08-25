package ControlFlows;

public class ForLoop {

    public static void main(String[] args) {

        //System.out.println("My Name is ABC");

//        for (int i =0; i<20; i++){
//
//            System.out.println("My Name is ABC");
//        }

        int[] numArray = new int[6];
        for(int i = 0; i<numArray.length; i++){
            numArray[i] = i + 10;
            System.out.println("Index position is: "+i+ " and value is: " + numArray[i]);
        }
    }
}
