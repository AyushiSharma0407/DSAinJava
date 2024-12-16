import java.util.*;
public class SelectionSort{
    //O/(n2)
    //Find smallest, push to the front
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};

        for(int i= 0; i<arr.length-1;i++){
            int minPos=i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ //< if decreasing order
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int k = 0; k<arr.length;k++){
            System.out.print(arr[k]);
        }

    }
}