//Print out the sum of the numbers in the second row of the array

import java.util.*;
public class Array2D2{
    public static void main(String args[]){
        int [][] nums ={{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        System.out.println(sum);
    }
}