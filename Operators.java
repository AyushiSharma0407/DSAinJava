import java.util.*;

public class Operators{
    public static void main(String args[]){

        //post increment
        int a = 10;
        int b =0;
        b = a++;
        System.out.println(a);
        System.out.println(b);

        //pre increment
        int z = 10;
        int x = 0;
        x = ++z;
        System.out.println(x);
        System.out.println(z);

        //post decrement
        int c = 10;
        int d =0;
        d = c--;
        System.out.println(c);
        System.out.println(d);

        //pre decrement
        int e = 10;
        int f = 0;
        f = --e;
        System.out.println(e);
        System.out.println(f);

        //Bitwise Operators 
        //A = 0101 B = 0110
        // & = 0100
        // | = 0111
        // Binary XOR same value= false, diff value true so ^ = 0011
        // Binary ones complement ~A = 0101
        //Binary left shift << so A<<1 = 1010,,,, B<< 1 = 110
        //Binary Right Shift A>>1 = 0010,,,, B>>1 = 0011

   }
}