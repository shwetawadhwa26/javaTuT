import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        int num = sum2();
        String str = greet();
        System.out.println(num);
        System.out.println(str);

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static String greet() {
        String greeting = "hello how are you";
        return greeting;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }

    static void greeting() {
        System.out.println("hello ");
    }
}
