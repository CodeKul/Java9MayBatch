package oops;

public class Employee {
    int id;
    String name;
    String designation;
    String address;
    String mobileNo;
    String emailId;

    public static void main(String[] args) {
        Employee e1; //reference variable
        e1 = new Employee();
        e1.id = 101;
        e1.name = "Aashish";
        e1.designation = "HR";
        e1.emailId = "aashish@gmail.com";
        e1.address = "Pune";
        e1.mobileNo = "+91-9856321475";

        System.out.println("ID "+e1.id);
        System.out.println("Name "+e1.name);
        System.out.println("Designation "+e1.designation);
        System.out.println("Email "+e1.emailId);
        System.out.println("Mobile "+e1.mobileNo);
        System.out.println("Address "+e1.address);

        Employee e2 = new Employee();
    }
}
