import java.util.*;

public class Arrays{
    public static void update(int marks[], int number){
        number = 10;
        System.out.println(number);
        for(int i=0; i<marks.length; i++){
            marks[i] +=1;
        }
    }
    public static void main(String args[]){
        int[] marks = new int[40];
        int[] num = {1, 2,3};
        int number = 5;
        marks[0]=100;
        System.out.println(marks.length);
        
        //Passing arrays as arguments - pass by reference
        update (num, number);
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]+" ");
        }
        System.out.println(number);
        
        //Linear Search time complexity O(n)
        int[] komal ={0,0,2,3,4,5};
        int key = 3;

        System.out.println("Linear search index: "+linearSearch(komal, key));

        //BINARY SEARCH - sorted array
        int array[] = {2, 3, 4, 6, 8, 10, 12, 14};
        int keyy = 10;
        System.out.println("Binary Search index: "+ BinarySearch(array, keyy));

    }
    public static int linearSearch(int numbers[], int key){

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int numbers[], int key){
        //Time Complexity O(log n)
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;


    }
}