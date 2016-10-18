package leecode.SingleNumberIII;

import java.util.Arrays;

/***
 * Single Number II
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int xorRes = 0;
        for(int num : nums){
            xorRes ^= num;
        }

        int lowest1Bit = 1;
        while((lowest1Bit & xorRes) == 0){
            lowest1Bit = lowest1Bit<<1;
        }
        int i = 0, j = nums.length-1;

        while(i<j){
            while (((nums[i]&lowest1Bit) == 0) && (i<j)){
                i++;
            }
            while (((nums[j]&lowest1Bit) != 0) && (i<j)){
                j--;
            }
            if(i<j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        int[] res = new int[2];

        res[0] = singleNumber(nums, 0, i-1);
        res[1] = singleNumber(nums, i, nums.length-1);
        return res;
    }

    public int singleNumber(int[] nums, int start, int end) {
        int xorResult = 0;
        for(int i= start; i<=end; i++){
            xorResult ^= nums[i];
        }
        return xorResult;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(new Solution().singleNumber(nums)));
    }
}