package inheritance;

/**
 * Hierarchical Inheritance
 */
public class Teacher {
    String teacherName;
    int id;

}
class Physics extends Teacher{
    String subject;
    int noOfStudents;
    double marks;
}
class Maths extends Teacher{
    String subject;
    int noOfStudents;
    double marks;
}

class TeacherImpl{
    public static void main(String[] args) {
        double totalMarks = 0;
        Physics physics = new Physics();
        physics.teacherName = "Patil Sir";
        physics.id = 101;
        physics.subject = "Physics";
        physics.noOfStudents = 40;
        physics.marks = 87;

        Maths maths = new Maths();
        maths.teacherName = "Chaudhari Sir";
        maths.id = 102;
        maths.noOfStudents = 50;
        maths.subject = "Maths";
        maths.marks = 83;
        totalMarks = maths.marks + physics.marks;

        System.out.println("Subjects: " +physics.subject + " "+maths.subject);
        System.out.println("Marks Obtained "+totalMarks);
    }
}