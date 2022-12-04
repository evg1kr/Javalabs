import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n,m;
    n = in.nextInt();
    m = in.nextInt();
    int[][] mas = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            mas[i][j]=in.nextInt();
        }
    }
    mas = change(mas,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] change(int[][] array, int m) {
        int tmp;
        for (int left = 0; left < array.length; left++) {
            int value = array[left][0];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i][0]) {
                    for(int j=0;j<m;j++){tmp = array[i + 1][j];
                        array[i + 1][j] = array[i][j];
                        array[i][j] = tmp;}
                } else {
                    break;
                }
            }
            array[i + 1][0] = value;
        }
        return array;
    }
    public static int[][] find(int[][] array, int m) {
        int tmp;
        for (int left = 0; left < array.length; left++) {
            int value = array[left][0];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i][0]) {
                    for(int j=0;j<m;j++){tmp = array[i + 1][j];
                        array[i + 1][j] = array[i][j];
                        array[i][j] = tmp;}
                } else {
                    break;
                }
            }
            array[i + 1][0] = value;
        }
        return array;
    }
}
