import java.util.*;
//Print largest string lexicographically
//O(x*n)
public class StringsLargest{
    public static void main(String args[]){
        String a1 = "Helloji";
        System.out.println(a1.substring(0,5));

        String fruits[] = {"apple", "mango","banana"};

        String largest = fruits[0];
        for(int i =1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }

    
}