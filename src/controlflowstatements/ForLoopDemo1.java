package controlflowstatements;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println("Welcome "+i);
        }

        for (int i =1 ;i>0;i++){
            System.out.println("infinite loop 1");
        }

        for (;;){
            System.out.println("infinite loop");
        }
    }
}
