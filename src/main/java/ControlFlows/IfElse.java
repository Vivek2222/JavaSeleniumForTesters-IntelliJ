package ControlFlows;

public class IfElse {

    public static void main(String[] args) {

        //int x  = 8;
        int x = 100; //else condition executed
        if(x<5){
            System.out.println("Small");
        }
        else if(x>=5 && x<10){
            System.out.println("Large");
        }
        else if (x>=10 && x<15) {
            System.out.println("Very Large");
        }
        else {
            System.out.println("Ultra Large");
        }

        System.out.println("Outside the Loop");
    }

}
