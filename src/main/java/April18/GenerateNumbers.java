package April18;

public class GenerateNumbers {

    public static void main(String[] args) {
        int lb=1,up=10;
        System.out.println("SumOfEvenNumbers = " + EvenNumber(lb,up) );


    }
    public static int EvenNumber(int lb, int up){
        int i,sum = 0;
        for (i=lb;i<=up;i++){
            if(isEven(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static boolean isEven(int num){
        return num%2 == 0;

    }
}



