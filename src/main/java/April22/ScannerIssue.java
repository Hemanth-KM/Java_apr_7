package April22;

import java.util.Scanner;

public class ScannerIssue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empno:");
        int empno = sc.nextInt();
        sc.nextLine();// This is the ISSUE
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter Salary:");
        double Salary = sc.nextDouble();
        Employee emp = new Employee(empno,name,Salary);
        emp.ShowDetails();
    }
}
