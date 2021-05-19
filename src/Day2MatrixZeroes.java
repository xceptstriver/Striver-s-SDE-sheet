import java.util.Scanner;

public class Day2MatrixZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        setMatrixZeros(arr, m, n);
    }

    private static void setMatrixZeros(int[][] arr, int m, int n) {
        boolean[] row_arr = new boolean[m];
        boolean[] col_arr = new boolean[n];
        for (int i = 0; i < m; i++) {
            row_arr[i] = false;
        }
        for (int j = 0; j < n; j++) {
            col_arr[j] = false;
        }

        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j] == 0){
                    row_arr[i] = true;
                    col_arr[j] = true;
                }
            }
        }
        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                if (row_arr[i] == true || col_arr[j] == true){
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
