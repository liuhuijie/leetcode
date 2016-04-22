
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.	
//
//https://leetcode.com/problems/contains-duplicate-ii/
//
//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.






public class Solution {
    public int majorityElement(int[] nums) {
    	if(nums.length==1){
    		return nums[0];
    	}
    	Arrays.sort(nums);
    	int j=1;
    	for(int i=0;i<nums.length-1;i++){ //注意这里for循环的bound，因为后面用到i+1避免array oob，需要用length－1结束
    		if (nums[i]==nums[i+1]){
    			j++;
    			if(j>nums.length/2){
    				return nums[i];
    			}
    		}else{
    			j=1;
    		}
    	}
    	return 0;
    	
    }
   
} 
