import java.util.*;
public class LargestNum{
    public static void main(String args[]){
        int[] arr = {1, 2, 6, 3, 5, 7, 3};
        //int max = Integer.MIN_VALUE;
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}