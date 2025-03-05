import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Row :");
        int col = sc.nextInt();

        System.out.print("Enter a Number of Column :");
        int row = sc.nextInt();

        //Outer loop for print a Row
        for (int i = 1; i <= col; i++) {
            //Inner loop for print a Col 
            for (int j = 1; j <= row; j++) {
                System.out.print("*"+" ");
            }
            //this print method for print in new line
            System.out.println();
        }
        sc.close();
    }
}
