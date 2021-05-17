public class Day1KadaneAlgo {
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Largest sum continguos subArray is "+maxsubArray(arr));
    }

    private static int maxsubArray(int[] arr) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i=0;i<n;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
