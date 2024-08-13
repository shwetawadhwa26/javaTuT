import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int a = 19;

        // // String name = "Shivansh Aggarwal ";

        // // syntax for array
        // int[] rnos = new int[5];
        // // or directly
        // int[] rnos2 = { 23, 12, 45, 32, 15 };

        // String[] arr = new String[4];

        // System.out.println(arr[0]);

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 543;
        // arr[4] = 3;

        // System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }

}
