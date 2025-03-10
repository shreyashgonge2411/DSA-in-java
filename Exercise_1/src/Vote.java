import java.util.Scanner;

public class Vote {
    public static void checkAgeForVoting(int age){
        if(age>=18){
            System.out.println("Person is eligble for vote");
        }else{
            System.out.println("Person is not eligble");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Age :");
        int age = sc.nextInt();

        checkAgeForVoting(age);

        sc.close();
    }
}
