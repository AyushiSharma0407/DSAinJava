import java.util.*;
public class PrintSubarray{
    public static void main(String args[]){
        int[] arr = {2, 4, 6, 8, 10};
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                for(int q = i;q<=j;q++){
                    System.out.print(arr[q]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}