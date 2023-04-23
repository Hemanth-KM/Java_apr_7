package April20;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Is a Prime 2.Reverse of the number 3.Sum of Digits 4.fibonacii series 5.Exit");
            int num,ch;
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter number");
                    num = sc.nextInt();
                    System.out.println(num + " is a Prime: " + isPrime(num));
                    //ch = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter number");
                    num = sc.nextInt();
                    System.out.println(num + " Reverse of the number: " + reverse(num));
                    //ch = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter number");
                    num = sc.nextInt();
                    System.out.println(num + " Sum of Digits: " + sumOfDigits(num));
                    //ch = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Enter number");
                    num = sc.nextInt();
                    System.out.println("\n"+num + " fibonacii series " + " element " + fibonacciSeries(num));
                    //ch = sc.nextInt();
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid input 1-5");
            }
        }

    }

    public static boolean isPrime(int num){
        int i,count=0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count ++;
            }
        }
        return count == 2;
    }

    public static int reverse(int num){
        int k,rev=0;
        while(num>0){
            k=num%10;
            rev+=k;
            rev*=10;
            num/=10;
        }
        return rev/10;
    }

    public static int sumOfDigits(int num){
        int k,sum=0;
        while(num>0){
            k = num%10;
            sum += k;
            num = num / 10;
            //System.out.println("Sum K = " + sum + k);
        }
        return sum;

    }

    public static int fibonacciSeries(int num){
        int a=0,b=1;
        System.out.print(a + ", " + b);
        int sum = 1;
        while(sum < num) {
            sum = a + b;
            if (sum > num){
                break;
            }
            else {
                System.out.print( ", " + sum);
                a = b;
                b = sum;
            }
        }
        return b;
    }
}
