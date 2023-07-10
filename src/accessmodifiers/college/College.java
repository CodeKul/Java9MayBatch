package accessmodifiers.college;

import accessmodifiers.Student;

public class College{
    void getStudent(){
        Student student = new Student();
        // student.show(); // default method accessible within a pkg only
    }
}
