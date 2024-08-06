import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "apple":
                System.out.println("red");
                break;
            case "banana":
                System.out.println("yellow");
                break;
            case "Mango":
                System.out.println("light yellow");
                break;

            default:
                System.out.println("hello");

        }

    }

}
