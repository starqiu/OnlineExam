package leecode.FindTheDuplicateNumber;

/***
 * FindTheDuplicateNumber
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length ;
        int start = 1;
        int end = len - 1;
        int mid = 0;
        while(start < end){
            mid = (start + end) >> 1;
            int count = 0;
            for(int num : nums){
                if(num > mid && num <= end){
                    count ++ ;
                }
            }
            if(count > mid){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return start;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,1};
        System.out.println(new Solution().findDuplicate(nums));
    }
}