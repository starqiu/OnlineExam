package leecode.Integer2Roman;

/***
 * FindTheDuplicateNumber
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class Solution {
    public String intToRoman(int num) {
        //1,5,10,50,100,500,1000
        String roman = "IVXLⅭDM";
        int len = roman.length();
        int[] factors = {1, 5, 10, 50, 100, 500, 1000};
        int times = 0;
        StringBuilder res = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            times = num / factors[i];
            num = num - factors[i] * times;
            if (times == 4) {
                if (res.length() < 1) {
                    res.append(roman.charAt(i));
                    res.append(roman.charAt(i + 1));
                } else {
                    res.insert(res.length() - 1, roman.charAt(i));
                }
            } else {
                res.append(repeat(roman.charAt(i), times));
            }

        }
        return res.toString();

    }

    public static String repeat(char ch, int times) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < times; i++) {
            res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 1};
        System.out.println(new Solution().intToRoman(4));
        System.out.println(new Solution().intToRoman(9));
        System.out.println(new Solution().intToRoman(10));
    }
}