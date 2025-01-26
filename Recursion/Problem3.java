//Print sum of first n natural numbers
import java.util.*;
public class Problem3{
    public static void main(String args[]){
        System.out.println(Sum(3));

    }
    public static int Sum(int n){
        int Summ=0;
        if(n>=1){
            Summ= n+Sum(n-1);
        }
        return Summ;
    }
}