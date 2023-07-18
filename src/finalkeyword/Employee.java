package finalkeyword;

public final class Employee {
    private String name;
    private final String PAN_CARD_NO = "AMKDO5635L";
    private final String AADHAR_CARD_NO;//blank final variable or uninitialized final variable
    private static final String LICENCE_NO; //blank final static variable
    Employee(){
        AADHAR_CARD_NO = "";
    }
    public Employee(String name,String AADHAR_CARD_NO) {
        this.name = name;
        this.AADHAR_CARD_NO = AADHAR_CARD_NO;

    }
    static {
        LICENCE_NO = "";
    }

     final void display(){
         System.out.println("in Employee class");

    }
}

//class Manager extends Employee{ //can not extends final class
////    @Override
////    void display() {
////        System.out.println("in Manager class");
////    } can not override final method
//}