import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day1MissingRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printMissingRepeat(arr, n);

    }

    private static void printMissingRepeat(int[] arr, int n) {
        Map<Integer, Boolean> numberMap = new HashMap<>();
        int max = arr.length;
        for (Integer i : arr) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                System.out.print("Repeating number is " + i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                System.out.print("Missing number is" + i);
            }
        }

    }
}
