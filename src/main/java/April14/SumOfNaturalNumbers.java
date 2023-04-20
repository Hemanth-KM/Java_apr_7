package April14;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int  i=1,sum=0;
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of Natural numbers: " + sum);
    }
}
