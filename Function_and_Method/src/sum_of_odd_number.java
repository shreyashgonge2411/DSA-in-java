public class sum_of_odd_number {

    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum +=i;
            }
        }
        System.out.println("Sum of total odd number is: "+sum);
    }
    public static void main(String[] args) {
        sumOfOdd(10);
    }
}
