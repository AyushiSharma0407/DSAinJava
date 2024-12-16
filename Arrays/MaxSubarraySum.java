import java.util.*;
public class MaxSubarraySum{
    //Time Complexity N cube
    public static void main(String args[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] arr = {2, 4, 6, 8, 10};
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                currSum = 0;
                for(int q = i;q<=j;q++){
                    System.out.print(arr[q]+" ");
                    currSum+=arr[q];

                }
                System.out.println("Current sum: "+currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Maximum sum: " + maxSum);
    }
}