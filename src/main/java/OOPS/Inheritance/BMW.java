package OOPS.Inheritance;

public class BMW extends Car {

    String dashboardType;

    public void playVideoMusic() {

        System.out.println("Music video is playing");
    }

    public void drive() {

        super.drive();
        System.out.println("BMW is driving");
    }


}
