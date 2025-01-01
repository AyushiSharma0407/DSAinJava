import java.util.*;
public class Powerof2{
    //And of 2 power and prev is always 0 cause 4 - 100, 16- 
    public static void main(String args[]){
        System.out.println(isPowerofTwo(16));

    }

    public static boolean isPowerofTwo(int n){
        return (n &(n-1))==0;
    }
}