package April15;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the factorial number:");
        int num = sc.nextInt();
        int i,fact=1;
        for (i=num;i>0;i--){
            fact = fact * i ;
        }
        System.out.println("The factorial of given num = " + fact);
    }
}
