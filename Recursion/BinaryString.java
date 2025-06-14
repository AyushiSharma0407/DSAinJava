import java.util.*;

public class BinaryString{
    public static void main (String args[]){
        Binary(3, 0, "");

    }
    public static void Binary(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        Binary(n-1, 0, str+"0");
        if(lastPlace==0){
            Binary(n-1, 1, str+"1");

        }
    }
}