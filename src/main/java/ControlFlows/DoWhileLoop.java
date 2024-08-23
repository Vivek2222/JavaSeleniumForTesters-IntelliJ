package ControlFlows;

public class DoWhileLoop {

    public static void main(String[] args) {

        int x = 0;

        while (x>0){//first check the cond
            System.out.println("While: Executed");
        }

        do {//first executed and then check the condition
            System.out.println("Do While: Executed");
        }while (x>0);
    }
}
