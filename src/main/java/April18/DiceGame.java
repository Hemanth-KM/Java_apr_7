package April18;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {

        int Generated_num = ThreadLocalRandom.current().nextInt(1,7);
        System.out.println("Generated=" + Generated_num);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess number 1-6: ");
        int Guess_number = sc.nextInt();
        if(Generated_num == Guess_number){
            System.out.println("YourGuess got corrected");
        }
        else {
            System.out.println("Try again");
        }

    }
}
