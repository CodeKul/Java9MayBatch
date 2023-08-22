package string;

public class Student {
    private int rno;
    private String name;
    private double percentage;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRno(1);
        s1.setName("Anuja");
        s1.setPercentage(87.5);

        System.out.println(s1.toString());
    }
}
