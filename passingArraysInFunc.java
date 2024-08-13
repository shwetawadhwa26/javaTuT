import java.util.Arrays;
import java.util.Scanner;

public class passingArraysInFunc {
    public static void main(String[] args) {
        // int[] nums = { 3, 4, 5, 12 };
        // System.out.println(Arrays.toString(nums));
        // change(nums);
        // System.out.println(Arrays.toString(nums));

        // now creating a 2D array

        int[][] arr = new int[3][5];
        Scanner in = new Scanner(System.in);

        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }

}
