import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 4543534354.435345;
        long largeInteger = 3425464345L;

        // String is not primitive
        String name = "Shivansh";

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);

    }

}
