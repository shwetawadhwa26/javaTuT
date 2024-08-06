
public class fibonnacci {
    public static void main(String[] args) {
        int num = 6;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print(0 + " ");
            } else if (i == 1) {
                System.out.print(1 + " ");
            } else {
                c = a + b;
                a = b;
                b = c;

            }

        }
        System.out.println(c);
    }

}
