//Floor of 2xN, find no of ways that can fit a tile of 2x1
import java.util.*;
public class TilingProblem{
    public static void main(String args[]){
        System.out.println(Ways(4));

    }
    public static int Ways(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticalWays = Ways(n-1);
        int horizontalWays = Ways(n-2);
        int totalWays = verticalWays+horizontalWays;
        return totalWays;
    }
}