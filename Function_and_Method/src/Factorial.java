import java.util.Scanner;

public class Factorial {

    public static void calculateFactorial(int a){
        int factorial=1;
        if(a<0){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=a;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n=sc.nextInt();

        calculateFactorial(n);  
        sc.close();     
    }
}
 