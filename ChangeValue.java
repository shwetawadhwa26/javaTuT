import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 3, 2, 45, 6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
        fun("hello", "hi", "bye", "bye");

    }

    static void change(int[] nums) {
        nums[0] = 99;
    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
