package JavaBasic;

public class Student01 {

    //name
    String name;

    //ClassName
    String className;

    //gender
    String gender;

    //Methods
    public void getTotalMarks(int marks1, int marks2){
        int sum;
        sum = marks1 + marks2;
        System.out.println("Sum is: "+sum);
    }

    //Constructors
    //Special form of function
    //Name
    //Return Type
    //signature
    //body

    Student01(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Student01 s1 = new Student01("Vivek");
        s1.getTotalMarks(5, 10);
        System.out.println("Name is "+s1.name);
        System.out.println("Name is "+s1.className);

    }

}
