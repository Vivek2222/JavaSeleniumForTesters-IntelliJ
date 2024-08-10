package JavaBasic.in.podtest;

public class Teacher {

    String name;

    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void getTeacherInfo(){
        System.out.println("Teacher Name is: "+ name + " Subject is: "+ subject );
    }
}
