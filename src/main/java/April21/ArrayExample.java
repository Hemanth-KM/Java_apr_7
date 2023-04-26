package April21;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[10];
        for(int i=0; i < arr.length; i++){
            arr[i] = ThreadLocalRandom.current().nextInt(10,100);
            System.out.println("Arr["+i+"] = " + arr[i]);
            sum += arr[i];
        }
        String output = showDetails(arr);
        System.out.println("Array = " + output);
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Sum of an array = " + sum);
        double average = (sum /(double) arr.length);
        System.out.println("Average =" + average);

        String[] names = new String[]{"krish","Manoj","Geetha","Seeta","Sheela","Bala","Peare"};
        System.out.println(names.length);

        for(int i = names.length-1; i>=0 ; i--){
            String name = names[i];
            System.out.println(name);
        }
        for(String name:names){

        }

    }

    public static String showDetails(int[] arr){
        String str ="[]";
        if (arr.length == 0){
            return str;
        }
        else{
            str ="[";
            for(int i=0;i < arr.length-1;i++){
                str += arr[i] + ", ";
            }
            str += arr[arr.length - 1] + "]";
        }
        return str;
    }
}
