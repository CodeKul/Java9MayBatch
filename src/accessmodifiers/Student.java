package accessmodifiers;

/**
 *
 */
public class Student {
    String name;
    void show(){
        System.out.println("in show");
    }
    private void getStudentData(){
        System.out.println("get student details");
    }

    protected void display(){
        System.out.println("in display method");
    }

}
class StudentImpl{
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        //s.getStudentData(); // compile time error
    }
}
