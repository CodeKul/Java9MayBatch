package polymorphism;

public class Addition {
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    float add(int n1,float f1){
        return n1+f1;
    }
    float add(float f1,float f2){
        return f1+f2;
    }

    long add(int n1,long n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(5,10.0f));
        System.out.println(addition.add(5,5l));
    }

    //main method can be overloaded
    public static void main(String[] args,int a) {
        System.out.println("in overloaded ");
    }

}
