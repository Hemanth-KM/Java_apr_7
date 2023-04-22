package April15;

public class FibanociSeries {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        System.out.print(a + ", " + b + ", ");
        int sum = 1;
        while(sum < n){
            sum = a + b;
            System.out.print(sum + ", ");
            a = b;
            b = sum;
        }

    }
}
