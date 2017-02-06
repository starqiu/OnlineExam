package leecode.LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

/***
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

 Subscribe to see which companies asked this question

 Show Tags
 Show Similar Problems

 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()){
            return 0;
        }

        Set<Character> chars = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        char[] allChars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i<len;i++) {
            chars.clear();
            chars.add(allChars[i]);
            int j = i+1;
            for (; j < len && !chars.contains(allChars[j]) ; j++) {
                chars.add(allChars[j]);
            }

            if (chars.size() > maxLen){
                maxLen = chars.size();
                start =i;
                end = j-1;
            }
        }
        System.out.println(s.substring(start, end+1));
        return maxLen;

    }

    public static int lengthOfLongestSubstring1(String s) {
        if (null == s || s.isEmpty()){
            return 0;
        }

        int allIndexes[] = new int[256];
        for (int i = 0; i < 256; i++) {
            allIndexes[i] = -1;
        }

        char[] allChars = s.toCharArray();
        int len = s.length();
        int start = 0;
        int maxLen = 0;
        int i = 0;
        for (; i<len;i++) {
            if (allIndexes[allChars[i]] == -1){
                allIndexes[allChars[i]] = i;
            }else{
                if (maxLen < i -start){
                    maxLen = i - start;
                }
                start = allIndexes[allChars[i]] + 1 ;
                i = start -1 ;
                for (int j = 0; j < 256; j++) {
                    allIndexes[j] = -1;
                }

            }
        }

        if (maxLen < i -start){
            maxLen = i - start;
        }

        return maxLen;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabcbb"));
        System.out.println(lengthOfLongestSubstring1("bbbbb"));
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
        System.out.println(lengthOfLongestSubstring1("c"));
    }
}