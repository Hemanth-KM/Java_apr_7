package April20;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DOB in YYYY-MM-DD");
        String dob = sc.next();
        String[] arr = dob.split("-");
        int month = Integer.parseInt(arr[1]);
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString + " " + Integer.parseInt(arr[2]) + ", " + Integer.parseInt(arr[0]));
        String formattedDOB = monthString + " " + arr[2] + ", " + arr[0];
        System.out.println(formattedDOB);
    }
}

