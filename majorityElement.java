
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
