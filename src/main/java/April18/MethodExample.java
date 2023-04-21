package April18;

public class MethodExample {
    public static void main(String[] args) {

        // 1 + 1/2! + 1/3! .... +1/n!
        int n = 5,i,sfact;
        double sum = 0;
        for(i=1;i<=n;i++){
            sfact = factorial(i);
            sum = sum + (1/(double)sfact) ;
        }
        System.out.println("Sum= " + sum);
    }

    public static int factorial(int n){
        int result = 1;
        for(int i=n;i>0;i--){
            result = i * result;
        }
        return result;

    }
}
