package others;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

/**
 * 题目描述：
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
 * 输出需要删除的字符个数。
 * 输入描述:
 * 输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 * 输出描述:
 * 对于每组数据，输出一个整数，代表最少需要删除的字符个数。
 * 输入例子:
 * abcda
 * google
 * 输出例子:
 * 2
 * 2
 * 思路分析：
 *  首先求s的反串rs，然后对s和rs求最长公共子序列，要删除的字符个数就是LCS.
 * Created by starqiu on 16-7-19.
 */
public class MaxHuiWenSubStr {
    public String lcs(String a, String b){
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int lenA = a.length();
        int lenB = b.length();
        int[][] lcs = new int[lenA+1][lenB+1];
        for (int i = 1; i < lenA+1; i++) {
            for (int j = 1; j < lenB+1; j++) {
                if (aChars[i-1]==bChars[j-1]){
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }else {
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }

        //print
        for (int i = 0; i < lenA+1; i++) {
            System.out.println(Arrays.toString(lcs[i]));
        }

        StringBuilder sb = new StringBuilder();
        int i = lenA,j=lenB;
        while (i>0 && j>0 && lcs[i][j]> 0){
            if (lcs[i][j] != lcs[i-1][j-1]){
                if (lcs[i-1][j] == lcs[i][j-1]){
                    sb.append(aChars[i-1]);
                    i--;
                    j--;
                }else if(lcs[i-1][j] > lcs[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }else {
                i--;
                j--;
            }
        }

        String huiwen = sb.reverse().toString();
        System.out.println("huiwen= "+huiwen);
        return huiwen;
    }

    public String maxHuiWenSubStr(String a){
        String b = reverse(a);
        return  lcs(a,b);
    }

    public int minDeleteNumWithHuiWenSubStr(String a){
        String huiwen = maxHuiWenSubStr(a);
        return a.length() - huiwen.length();
    }

    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }


    @Test
    public void testMinDeleteNumWithHuiWenSubStr(){
        TestCase.assertEquals(2,minDeleteNumWithHuiWenSubStr("abcda"));
        TestCase.assertEquals(2,minDeleteNumWithHuiWenSubStr("google"));
    }

    @Test
    public void testLcs(){
        TestCase.assertEquals("csdn.t",lcs("blog.csdn.net","csdn.blogt"));
    }

}
