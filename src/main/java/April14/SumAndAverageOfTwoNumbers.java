package April14;

import java.util.Scanner;

public class SumAndAverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the h1: ");
        float h1 = sc.nextFloat();
        System.out.println("Enter the h2: ");
        float h2 = sc.nextFloat();
        System.out.println("Enter the h3: ");
        float h3 = sc.nextFloat();
        float sum = h1+h2+h3;
        float Avg = sum/3;
        System.out.println("The sum of three h's: "+ sum);
        System.out.println("The average of three h's: "+ Avg);
    }
}
