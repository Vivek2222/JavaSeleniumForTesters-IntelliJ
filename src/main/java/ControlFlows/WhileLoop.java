package ControlFlows;

public class WhileLoop {

    public static void main(String[] args) {

        int[] numArray = new int[6];
        for(int i = 0; i<numArray.length; i++){
            numArray[i] = i + 10;
        }

        int z =0;
        while(z < numArray.length){
            System.out.println("Index: "+z);
            System.out.println("Value: "+numArray[z]);
            z++;
        }
    }
}
