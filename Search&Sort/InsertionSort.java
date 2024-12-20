import java.util.*;
public class InsertionSort{
    //O(n2)
    public static void main(String args[]){
        int arr[] = { 5, 4, 1, 2, 3};

        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;

            while(previous>=0 && arr[previous]>current){

                arr[previous+1]= arr[previous];
                previous--;
            }

            arr[previous+1]= current;
        }

        for(int k = 0; k<arr.length; k++){
            System.out.println(arr[k]);
        }


    }

}