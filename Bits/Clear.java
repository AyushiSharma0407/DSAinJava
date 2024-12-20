import java.util.*;
public class Clear{
    public static void main(String args[]){
        System.out.println("Ith bits cleared: "+ clearBits(15, 2));
        System.out.println("Ith bits range cleared: "+ clearRangeBits(10, 2, 4));

    }

    //Clear last i bits
    public static int clearBits(int n, int i){
        int bitMask1 = (~0)<<i;
        return n & bitMask1;
    }

    //Clear range of bits, bits are set to 0
    //01 - 1 - 2^1 - 1;
    //011 = 3 = 2^2 - 1

    public static int clearRangeBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitMask = a|b;
        return n & bitMask;
    }
}