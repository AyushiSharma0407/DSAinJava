import java.util.*;
public class CountingSort{
    //for smaller range becomes linear complexity
    public static void main(String args[]){
        int arr[]={ 1, 4, 2, 3, 5, 1, 8};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            largest= Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++ ){ //i=count.length-1; i>=0; i++ for descending 
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }


        for(int k = 0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }


}