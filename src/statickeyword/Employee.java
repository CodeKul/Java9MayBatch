package statickeyword;

public class Employee {
    int id;
    String name;
    static String companyName;
    Employee(int eid,String nm){
        id = eid;
        name = nm;
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee.companyName = "IBM";

        Employee e1 = new Employee(1,"Amit");
        Employee e2 = new Employee(2,"Nikita");
        Employee e3 = new Employee(3,"Eknath");

        System.out.println("ID: "+e1.id +" Name: "+ e1.name+" Company: "+e1.companyName);
        System.out.println("ID: "+e2.id +" Name: "+ e2.name+" Company: "+e2.companyName);
        System.out.println("ID: "+e3.id +" Name: "+ e3.name+" Company: "+e3.companyName);


    }
}