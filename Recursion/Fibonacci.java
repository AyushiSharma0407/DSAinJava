//Fibonacci number print nth
import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        System.out.println(Fib(4));

    }
    public static int Fib(int n){
        if(n==0||n==1){
            return n;
        }
        int x = Fib(n-1);
        int y = Fib(n-2);
        return x+ y;

    }
}