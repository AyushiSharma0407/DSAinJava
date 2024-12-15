//There is an integer array nums sorted in ascending order(with distinct values).
//Prior to being passed to your function nums is possibly rotated at an unknown pivot index k (1<=k<=nums.length) such that the resulting array is nums[k], nums[k+1],....nums[n-1],nums[0], nums[1], ... nums[k-1]]0-indexed
//For example 0,1,2,4,5,6,7 might be rotated at privot index 3 becomes 4,5,6,7,0,1,2

//Given the array nums after the possible rotation and an integer target return the index of target if it is in nums or -1 if it is not in nums. O(log n)

import java.util.*;
public class Array2{
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){//left sorted
                if(nums[start]<=target&& nums[mid]>target){
                    end = mid-1;
                } else{
                    start = mid +1;
                }
            } else {//right part sorted
                if(nums[mid]<target && nums[end]>target){
                    start = mid+1;
                } else{
                    end = mid -1;
                    
                }

            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}