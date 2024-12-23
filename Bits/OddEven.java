import java.util.*;
public class OddEven{
    //Determine if a num is odd or even using bits
    public static void main(String args[]){
        OddorEven(3);
        OddorEven(44);

    }

    public static void OddorEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}