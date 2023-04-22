package April18;

import java.time.LocalDateTime;

public class PatternExample {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        for(i=5;i>=1;i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int total = SumOfNaturalNumbers(5);
        System.out.println("Total: " + total);
    }

    // Method with return type with arguments
   public static int SumOfNaturalNumbers(int n){
        int sum = (n*(n+1))/2;
        return sum;
   }

   // Method with return type without arguments
    public static LocalDateTime getSystemTime(){
        return LocalDateTime.now();
    }

    // Method without return type with arguments
    public static void showGreetings(String message){
        System.out.println(message);
    }

    // Method without return type without arguments
    public static void showDate(){
        System.out.println(LocalDateTime.now());
    }



}
