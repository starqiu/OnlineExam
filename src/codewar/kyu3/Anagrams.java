/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Anagrams.java
 * 2016年2月17日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月17日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Anagrams {
	public static BigInteger listPosition(String word) {
		int len = word.length();
		if (len <=1) {
			return BigInteger.ONE;
		}
		
		char[] sortedChars = word.toCharArray();
		Arrays.sort(sortedChars);
		int count =0;
		int index =0;
		char curChar = sortedChars[0];
		HashMap<Character, Integer> charIndexMap = new HashMap<>();
		ArrayList<Integer> charCounts = new ArrayList<>();
		for (char c : sortedChars) {
			if (c == curChar) {
				count++;
			}else {
				charIndexMap.put(curChar, index);
				charCounts.add(count);
				curChar = c;
				count = 1;
				index++;
			}
		}
		//the last element
		charIndexMap.put(curChar, index);
		charCounts.add(count);
				
		BigInteger[] factorials = factorials = genFactorials(len);
		
		int i = charIndexMap.get(word.charAt(0));
		int charCountLeCurChar = 0;
		BigInteger sum = BigInteger.ZERO;
		BigInteger curSum =BigInteger.ZERO;
		for (int j = 0; j < i; j++) {
			int charCount = charCounts.get(j);
			curSum = factorials[len-charCounts.get(i)];
			for (int k = 0; k < len; k++) {
				int curCharCount = k==j?charCounts.get(k)-1:charCounts.get(k);
				if (curCharCount!=0 &&curCharCount!=1) {
					curSum = curSum.divide(factorials[charCount]);
				}
			}
			sum=sum.add(curSum);
		}
			
		return sum.add(listPosition(word.substring(1)));
	}

	private static BigInteger[] genFactorials( int len) {
		BigInteger[] factorials = new BigInteger[len];
		factorials[0] =BigInteger.ONE;
		for (int i = 1; i < len; i++) {
			factorials[i] = factorials[i-1].multiply(BigInteger.valueOf(i));
		}
		return factorials;
	}
	
	public static void main(String[] args) {
//		listPosition("ghalglasjgla");
		System.out.println(Arrays.toString(genFactorials(7)));
	}
}
