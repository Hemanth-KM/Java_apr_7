package April18;

public class BreakContinueExample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int i,element;
        for(i=0;i<arr.length;i++){
            element = arr[i];
            if (element % 3==0 && element%6==0) {
                break;
            }
            if( element % 3 == 0){
                continue;
            }

            System.out.println(arr[i]);
        }

    }
}
