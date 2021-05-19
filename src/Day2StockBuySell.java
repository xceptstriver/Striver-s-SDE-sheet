import java.util.Scanner;

public class Day2StockBuySell {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("max profit is " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {
        int min_price = arr[0];
        int cost = 0;
        int maxCost = 0;
        for (int i = 0; i < arr.length; i++) {
            min_price = Math.min(min_price, arr[i]);
            cost = arr[i] - min_price;
            maxCost = Math.max(maxCost, cost);
        }
        return maxCost;
    }
}
