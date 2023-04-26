package April22;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        String data = "10,20,30,40,50,60,70,15,25,35,45";
        String[] arr = data.split(",");
        int[] numArr = new int[arr.length];
        /*for(String chara:arr){
            System.out.print(chara+ " ");
        }*/

        for(int i=0;i<arr.length;i++){
            int chara = Integer.parseInt(arr[i]);
            numArr[i] = chara;
        }
        System.out.println(numArr + " " +numArr[0]);
        System.out.println(Arrays.toString(numArr));
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
