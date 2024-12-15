//You are given an array return all triplets such that i != j, i!=k and j!=k and nums[i]+nums[j]+nums[k]==0
//Solution set must not contain duplicate triplets

import java.util.*;
public class Array3{
    public List<List<Integer>> ThreeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
    result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
    return result;

    }
    public static void main(String args[]){
        int nums[]={-1, 0, 1, 2, -1, -4};
        Array3 array3 = new Array3();
        List<List<Integer>> result = array3.ThreeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
        
    }
}