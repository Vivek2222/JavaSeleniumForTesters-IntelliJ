package JavaBasic.in.podtest;

public class Student {

    String name;

    int rollNo;

    int[] marks;

    Teacher classTeacher;

    Student(String name, int rollNo,int[] marks ,Teacher classTeacher){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.classTeacher = classTeacher;
    }



    //Behaviours
    public void getStudentInfo(){
        System.out.println("Student Name is: "+ name + " Roll no is: "+ rollNo );
        System.out.println("Total Marks are: "+ getTotalMarks() + " ClassTeacher name is: "+ classTeacher.name );
    }

    public int getTotalMarks(){

        int totalMarks = 0;

        for(int i: marks){
            totalMarks = totalMarks + 1;
        }
        return totalMarks;
    }
}
