package April18;

public class NestedForLoop {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=10;i++){
             k=i;
            for(j=1;j<=10;j++){
                System.out.println(k + " * " + j + " = " + (k*j));
            }
            System.out.println("----------------------");
        }
    }
}
