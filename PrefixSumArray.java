import java.util.*;
public class PrefixSumArray{
    //Time Complexity N csquare
    public static void main(String args[]){
        int[] arr = {2, 4, 6, 8, 10};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];

        for(int i =1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i = 0; i<arr.length; i++){ //start
            for(int j = i; j<arr.length; j++){ //end
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
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