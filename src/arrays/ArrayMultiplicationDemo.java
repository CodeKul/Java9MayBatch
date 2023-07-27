package arrays;

public class ArrayMultiplicationDemo {
    public static void main(String[] args) {
        int a[][] = {{3,4},{5,7}};
        int b[][] = {{1,6},{2,8}};
        int c[][] = new int[2][2];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                for (int k=0;k<a.length;k++){
                    c[i][j]+= a[i][k] * b[k][j];
                }
            }
        }

        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
