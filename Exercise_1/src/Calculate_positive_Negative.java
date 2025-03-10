import java.util.Scanner;

public class Calculate_positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int positive=0;
        int negative=0;
        int input;
        do{
            System.out.print("Enter a number :");
            input = sc.nextInt();
            i++;
            if(input>0){
                positive +=input;
            }else{
                negative +=input;
            }
        }while(input!=0);
       System.out.println("Total of Positive Number "+positive);
       System.out.println("Total of Negative Number "+negative);

       sc.close();
    }
}
