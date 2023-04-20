package April15;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
        System.out.println("-".repeat(50));
        for(i=10;i>0;i--){
            System.out.println(number + " * " + i + " = " + (number*i));
        }


    }
}
