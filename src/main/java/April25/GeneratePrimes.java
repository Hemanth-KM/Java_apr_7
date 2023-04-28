package April25;

import java.util.Arrays;
import java.util.SortedMap;

public class GeneratePrimes {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2 = new int[]{2,4,6,8,10};

        int[] arr = new int[arr1.length + arr2.length];

        int i,j;
        for(i=0,j= 0; i<arr1.length && j<arr2.length ;i++,j++){
            arr[i] = arr1[i];
            arr[i+ arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int pos = 5,c=0;
        int[] newarr =  new int[arr.length-1];
       for(i=0;i<arr.length;i++){
           if(i!=pos){
               newarr[c++]=arr[i];
           }
       }
        System.out.println(Arrays.toString(newarr));
        System.out.println(Arrays.toString(arr));
        int[] newlyarr =  new int[arr.length-1];
       System.arraycopy(arr,0,newlyarr,0,5);
       System.arraycopy(arr,6,newlyarr,5,arr.length-6);
        System.out.println(Arrays.toString(newlyarr));
    }

}
