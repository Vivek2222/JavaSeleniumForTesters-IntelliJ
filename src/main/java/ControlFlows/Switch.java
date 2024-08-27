package ControlFlows;

public class Switch {

    public static void main(String[] args) {

        String hooby = "Sing"; //Case sensitive

        switch(hooby) {

            case "Sing": {
                System.out.println("I am Singing");
                break;
            }
            case "Play":{
                System.out.println("I am Playing");
                break;
            }

            default:{
                System.out.println("I have different hobby");
                break;
            }
        }
    }
}
