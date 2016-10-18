package leecode.SingleNumberII;

import java.util.Set;
import java.util.HashSet;

/***
 * Single Number II
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        Set<Integer> noDupSet = new HashSet();
        for(int num : nums){
            sum += num;
            noDupSet.add(num);
        }
        int s = 0;
        for(int num : noDupSet){
            s += num;
        }

        return (3*s-sum)>>1;
    }
}