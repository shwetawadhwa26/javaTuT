import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = input.next().trim().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("lowercase character");
        } else {
            System.out.println("uppercase character");
        }

    }

}
