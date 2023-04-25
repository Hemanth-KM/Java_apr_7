package April20;

import java.util.Scanner;

public class DaysInaMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month MM:");
        int month = sc.nextInt();
        System.out.println("Enter Year YYYY:");
        int Year = sc.nextInt();
        int numdays = 0 ;
        switch (month){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numdays = 31;
                break;

            case 4: case 6: case 9:
            case 11:
                numdays = 30;
                break;
            case 2:
                if( ((Year%4 == 0) && !(Year%100 == 0))  || (Year%400 == 0)){
                    numdays = 29;
                    break;
                }
                else{
                    numdays = 28;
                    break;
                }
            default:
                System.out.println("Enter Correct month");
                break;

        }
        System.out.println("Year " + Year + ", "+ month + " month has " + numdays + " days.");
    }
}
