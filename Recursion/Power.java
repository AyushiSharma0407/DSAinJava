//Print x raised to the power n 
import java.util.*;
public class Power{
    public static void main(String args[]){
        System.out.println(xpower(6, 2));
        System.out.println(optimisedPower(6, 2));

    }
    public static int xpower(int x, int n){
        if(n==0){
            return 1;
        }
        return x*xpower(x, n-1);
    }


    //Optimized approach O(logn)
    public static int optimisedPower(int a, int b){
        if(b==0){
            return 1;
        }
        //int halfPowerSq = optimisedPower(a, b/2)*optimisedPower(a, b/2);//
        int halfPower = optimisedPower(a, b/2);
        int halfPowerSq = halfPower*halfPower;

        if(b%2 != 0){
            halfPowerSq = a* halfPowerSq;
        }
        return halfPowerSq;
    }
}