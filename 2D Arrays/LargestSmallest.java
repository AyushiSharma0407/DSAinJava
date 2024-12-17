import java.util.*;
public class LargestSmallest{
    public static void main(String args[]){
        int arr[][]= {{1,2,3},{4, 5, 6},{7, 8, 9}};

        largest(arr);
        smallest(arr);

    }

    public static void largest(int arr[][]){
        int large = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for(int i= 0; i<n;i++){
            for(int j = 0; j<m ;j++){
                if(arr[i][j]>large){
                    large = arr[i][j];
                }
            }
        }
        System.out.println(large);
    }

    public static void smallest(int arr[][]){
        int small = Integer.MAX_VALUE;
        int n = arr.length;
        int m = arr[0].length;

        for(int i= 0; i<n;i++){
            for(int j = 0; j<m ;j++){
                if(arr[i][j]<small){
                    small = arr[i][j];
                }
            }
        }
        System.out.println(small);
    }
}