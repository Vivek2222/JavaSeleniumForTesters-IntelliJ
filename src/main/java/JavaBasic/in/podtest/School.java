package JavaBasic.in.podtest;

public class School {

    public static void main(String[] args) {


        Teacher t1 = new Teacher("Mons", "Maths");
        Teacher t2 = new Teacher("Johs", "Physics");


        Student s1 = new Student("Vivek", 1, new int[]{10, 5, 8}, t1);
        Student s2 = new Student("Viv", 2, new int[]{19, 55, 58}, t2);
        Student s3 = new Student("Viek", 100, new int[]{10, 50, 80}, t1);
        Student s4 = new Student("vek", 111, new int[]{50, 5, 8}, t2);

        t1.getTeacherInfo();
        t2.getTeacherInfo();

        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
        s4.getStudentInfo();

       // t1.name = "Mons";


    }
}
