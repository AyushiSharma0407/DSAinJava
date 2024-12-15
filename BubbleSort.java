import java.util.*;
public class BubbleSort{
    //O(n2)
    //Compare and Swap adjacent
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};
        int temp = 0;
        int swaps = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swaps++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
        if(swaps==0){
                System.out.println("Array sorted");
            }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}