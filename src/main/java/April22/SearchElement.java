package April22;

import java.util.Arrays;

public class SearchElement {


    public static void main(String[] args) {
        System.out.println(isAnagram("cat","tac"));

    }
    private static int getIndex(int[] arr, int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    private static boolean isSubSet(int[] masterArr, int[] subArr){
        if(masterArr.length  < subArr.length){
            return false;
        }
        for(int ele:subArr){
            if(getIndex(masterArr,ele)==-1){
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }

    private static int biggest(int[] arr){
        int max = arr[0];
        for(int ele:arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    private static int smallest(int[] arr){
        int min = arr[0];
        for(int ele:arr){
            if(ele < min){
                min = ele;
            }
        }
        return min;
    }

    private static Employee maxPaidEmployee(Employee[] emparr){
        double maxSalary = getMaxSalary(emparr);
        for (Employee ele:emparr){
            if(ele.getSalary() == maxSalary ){
                return ele;
            }
        }
        throw new IllegalArgumentException("No max paid Employee");

    }
    private static double getMaxSalary(Employee[] empArr){
        double max = empArr[0].getSalary();
        for(Employee ele:empArr){
            if(ele.getSalary() > max){
                max = ele.getSalary();
            }
        }
        return max;
    }

}


