import java.util.Scanner;

public class Sum_of_odd_number {
    public static int calculateSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("Sum of all odd number is :"+calculateSum(n));
        sc.close();
    }
}
