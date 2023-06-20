package constructor;

public class Student {
    int rno;
    String name;
    double percentage;
    Student(){
        System.out.println("in default constructor");
    }

   Student(int r,String nm){
       rno = r;
       name = nm;
    }

    Student(int r,String nm,double perc){
        rno = r;
        name = nm;
        percentage = perc;
    }
}

class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Rno: "+s1.rno);
        System.out.println("Name: "+s1.name);
        System.out.println("Percentage: "+s1.percentage);
        System.out.println("----------------------------------");
        Student s2 = new Student(1,"XYZ");
        System.out.println("Rno: "+s2.rno);
        System.out.println("Name: "+s2.name);
        System.out.println("Percentage: "+s2.percentage);
        System.out.println("---------------------------------");
        Student s3 = new Student(2,"ABC",87);
        System.out.println("Rno: "+s3.rno);
        System.out.println("Name: "+s3.name);
        System.out.println("Percentage: "+s3.percentage);

    }
}
