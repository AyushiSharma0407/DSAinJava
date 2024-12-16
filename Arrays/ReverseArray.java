import java.util.*;

public class ReverseArray{
    public static void main(String args[]){
        int[] arr = {2, 4, 6, 8, 10};
        int temp;
        for(int i=0; i<arr.length/2;i++){
            temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
        int[] array = {2, 4, 6, 8, 10};

        for(int j = arr.length-1; j>=0;j--){
            System.out.print(array[j] + " ");
        }
    }
}