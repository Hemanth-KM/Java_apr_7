package April20;

import java.util.Scanner;

public class Claci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter num1");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num2");
                    int num2 = sc.nextInt();
                    int result = 0;
                    result = num1 + num2;
                    System.out.println("Result=" + result);
                break;
                case 2:
                    System.out.println("Enter num1");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2");
                    num2 = sc.nextInt();
                    result = 0;
                    result = num1 - num2;
                    System.out.println("Result=" + result);
                break;
                case 3:
                    System.out.println("Enter num1");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2");
                    num2 = sc.nextInt();
                    result = 0;
                    result = num1 * num2;
                    System.out.println("Result=" + result);
                break;
                case 4:
                    System.out.println("Enter num1");
                    num1 = sc.nextInt();
                    System.out.println("Enter num2");
                    num2 = sc.nextInt();
                    result = 0;
                    result = num1 / num2;
                    System.out.println("Result=" + result);
                break;
                case 5: System.exit(0);
            }
        }

    }
}
