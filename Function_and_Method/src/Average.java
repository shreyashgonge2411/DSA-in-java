import java.util.Scanner;

public class Average {
    public static double calculateAverage(int a,int b,int c){
        double sum = a+b+c;
        return sum/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number :");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number :");
        int b = sc.nextInt();
        System.out.print("Enter a Third Number :");
        int c = sc.nextInt();

        System.out.println("Average is: "+calculateAverage(a, b, c));
        sc.close();
    }
}
