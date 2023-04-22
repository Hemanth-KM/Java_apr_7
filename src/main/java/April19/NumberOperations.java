package April19;

import java.util.Scanner;



public class NumberOperations {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num +" Sum Of Digits = " + SumOfDigits(num));
        System.out.println(num + " Reverse Of Digits = " + ReverseOfDigits(num));
        System.out.println(num + " is a palindrome= " + isPalindrome(num));
        System.out.println(num + " is a Armstrong number= " + isArmstrong(num));
        System.out.println((num + " Sum Of Digits Until Single Digit " + SumOfDigitsUntilSingleDigit(num)));
    }

    public static int SumOfDigits(int num){
        int k,sum=0;
        while(num>0){
            k = num%10;
            sum += k;
            num = num / 10;
            //System.out.println("Sum K = " + sum + k);
        }
        return sum;
    }

    public static int ReverseOfDigits(int num){
        int k,rev=0;
        while(num>0){
            k=num%10;
            rev+=k;
            rev*=10;
            num/=10;
        }
        return rev/10;
    }

    public static boolean isPalindrome(int num){
        return num == ReverseOfDigits(num);
    }

    public static boolean isArmstrong(int num){
        int k,arm=0,num1=num;
        while(num>0){
            k=num%10;
            arm+=(k*k*k);
            num/=10;
            //System.out.println("arm "+ arm );
        }
        return num1 == arm;

    }

    public static int SumOfDigitsUntilSingleDigit(int num){
        int temp1=0,sum=num;
        while( num > 10){
            temp1=num%10;
            num=num/10 ;
            sum = temp1 + num;
            num =  sum;
            //System.out.println("temp1 num sum " + temp1 + " " + num + " " + sum );

        }
        return sum;
    }


}
