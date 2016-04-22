
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.	
//
//https://leetcode.com/problems/contains-duplicate-ii/
//


public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],i);
            }else{
                int j=map.get(nums[i]);
                if(i-j<=k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        
        return false;
        
    }
}



