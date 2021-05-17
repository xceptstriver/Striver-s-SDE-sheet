import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day1findDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findDuplicate(arr,n);

    }

    private static void findDuplicate(int[] arr, int n) {
        Set<Integer> hs = new HashSet<>();
        for (int x : arr){
            if(!hs.add(x)){
                System.out.println("Duplicate number is = " + x);
            }
            hs.add(x);
        }
    }
}
