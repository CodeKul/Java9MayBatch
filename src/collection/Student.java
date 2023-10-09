package collection;


public class Student<T> {
    private T mblNo;

    public void setMblNo(T mblNo) {
        this.mblNo = mblNo;
    }
}

class StudentGenericsDemo{
    public static void main(String[] args) {
        Student s = new Student();
        s.setMblNo(5465465);
        s.setMblNo("6546546");
    }
}