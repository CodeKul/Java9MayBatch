package controlflowstatements;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10};

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        ///for each
        for (int a:arr){
            System.out.println(a);
        }

    }
}
