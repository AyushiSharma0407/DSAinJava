//Find out the last occurence of an element in an array
import java.util.*;
public class LastOccur{
    public static void main(String args[]){
        int [] arr = {1, 2, 3,4, 5,5,6,7,5};
        Element(arr, 5, arr.length-1);

    }
    public static void Element(int[] arr, int key, int i){
         if(i<0){
            System.out.println("no found");
            return;
        }
        if(key==arr[i]){
            System.out.println(i);
            return;
        }
        Element(arr, key, i-1);

    }
}