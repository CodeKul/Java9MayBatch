package encapsulation;

public class Employee {
    private int eid;
    private String name;
    private Double salary;
    private Double bonus = 500d;
    private Double netSalary;

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getNetSalary() {
        if (this.salary > 20000)
            return this.salary + bonus;
        else
            return this.salary;
    }

    public String getName(){
        return this.name;
    }
}

class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEid(101);
        e1.setName("Amay");
        e1.setSalary(15000d);
        System.out.println(e1.getName() +" "+e1.getNetSalary());

        Employee e2 = new Employee();
        e2.setEid(102);
        e2.setName("Akshada");
        e2.setSalary(25000d);
        System.out.println(e2.getName()+" "+e2.getNetSalary());

    }
}