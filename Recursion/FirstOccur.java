//Find out the first occurence of an element in an array
import java.util.*;
public class FirstOccur{
    public static void main(String args[]){
        int [] arr = {1, 2, 3,4, 5, 1};
        Element(arr, 1, 0);

    }
    public static void Element(int[] arr, int key, int i){
         if(i>arr.length-1){
            System.out.println("no found");
            return;
        }
        if(key==arr[i]){
            System.out.println(i);
            return;
        }
        Element(arr, key, i+1);

    }
}