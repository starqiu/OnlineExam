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
	public BigInteger listPosition(String word) {
		char[] sortedChars = word.toCharArray();
		Arrays.sort(sortedChars);
		System.out.println(Arrays.toString(sortedChars));
		
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
		
		
		int len = word.length();
		BigInteger[] factorials = new BigInteger[len];
		factorials[0] =BigInteger.ONE;
		for (int i = 1; i < len; i++) {
			factorials[i] = factorials[i-1].multiply(BigInteger.valueOf(i));
		}
		for (int k=0;k<len-1;k++) {
			int i = charIndexMap.get(word.charAt(k));
			int charCountLeCurChar = 0;
			for (int j = 0; j < i; j++) {
				charCountLeCurChar +=charCounts.get(j);
			}
			
		}
		return BigInteger.ZERO;
	}
}
