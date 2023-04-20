package April14;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BillAmount: ");
        double BillAmount = sc.nextDouble();
        double discount =0;
        if(BillAmount >= 10000){
            discount = BillAmount * 0.1;
        }
        double netAmount = BillAmount - discount;
        System.out.println("BillAmount: " + BillAmount);
        System.out.println("discount: "+ discount);
        System.out.println("netAmount: " + netAmount);
    }
}
