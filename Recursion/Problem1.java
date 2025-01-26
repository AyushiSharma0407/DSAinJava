//Print numbers from n to 1
//Print numbers from n to 1 (increasing order)


import java.util.*;
public class Problem1{
    public static void main(String args[]){
        PrintInc(10);
    }

    public static void PrintDec(int n){
        System.out.println(n);
        if(n>1){
            PrintDec(n-1);
        }
    }

    public static void PrintInc(int n){
        if(n>1){
            PrintInc(n-1);
        }
        System.out.println(n);

    }
}

//Stack overflow- too many calls or too many parameters in memory so base case always required