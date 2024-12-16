import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        int [] numbers = { 1, 2,3, 6, 7, 8, 8};
        int key = 6;
        int start = 0;
        int end = numbers.length-1;
        System.out.println(Binary(numbers, key, start, end));

    }
    
    public static int Binary(int[] numbers, int key, int start, int end){
        int mid = (start+end)/2;
        if(key==numbers[mid]){
            return mid;
        } if(key>numbers[mid]){
            Binary(numbers, key, mid+1, end);
        } else if(key<numbers[mid]){
            Binary(numbers, key, start, mid-1);
        }
        return -1;
    }
}