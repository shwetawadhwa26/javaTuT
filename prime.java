import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime  number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    static boolean checkPrime(int n) {
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        return flag;

    }
}
