import java.util.Scanner;

public class Circumference_Of_The_Circle {
    public static double calculateCircumference(int r){
        double circumference = Math.PI*2*r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius :");
        int radius = sc.nextInt();

        System.out.println("Curcumference is :"+calculateCircumference(radius));

        sc.close();
    }
}
