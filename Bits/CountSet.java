import java.util.*;
public class CountSet{
    //Count set (1) bits in a number 
    //for any number n = log n + 1 for binary representation
    public static void main(String args[]){
        System.out.println(countSetBits(15));

    }
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}