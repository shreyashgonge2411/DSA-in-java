import java.util.Scanner;

public class Greater {
    public static void checkGreaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is Greater");
        } else {
            System.out.println(b + " is Greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number :");
        int x = sc.nextInt();

        System.out.print("Enter a Second Number :");
        int y = sc.nextInt();

        checkGreaterNumber(x, y);

        sc.close();
    }
}
