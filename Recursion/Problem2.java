//Factorial
//O(n)
import java.util.*;
public class Problem2{
    public static void main(String args[]){
        System.out.println(Fact(5));
    }

    public static int Fact(int n){
        int fact=1;
        if(n>1){
            fact=n*Fact(n-1);
        }
        return fact;
        
    }

}

