//Given a non-negative number represented as an array of digits, plus one to the number.

//The digits are stored such that the most significant digit is at the head of the list.

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits==null){
            return null;
        }
        int len=digits.length;
        for(int i=1;i<=len;i++){
            digits[len-i]=digits[len-i]+1;
            if(digits[len-i]==10){
                digits[len-i]=0;
            }else{
                return digits;
            }
        }
        int[] res=new int[len+1];
        res[0]=1;
        for(int i=1;i<=len;i++){
            res[i]=digits[i-1];
        }
        return res;

    }
}
