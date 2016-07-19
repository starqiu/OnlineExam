/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Dec2Fact.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.LinkedList;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月4日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Dec2Fact {
	public static String dec2FactString(long nb) {
		long n =1;
		long curBit =0;
		LinkedList<Character> stack = new LinkedList<>();
		while (nb>0) {
			curBit = nb%n;
			nb /= n;
			stack.push(intToChar(curBit));
			n++;
		}
		StringBuilder sb = new StringBuilder(stack.size());
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
	    return sb.toString();
	}
	
	public static Character intToChar(long i){
		if (i>=0 && i<=9) {
			return (char) (i+'0');
		}else if (i>=10 && i<=36) {
			return (char)(i-10+'A');
		}else {
			return null;
		}
	}
	
	public static int charToInt(char ch){
		if (ch>='0' && ch<='9') {
			return ch-'0';
		}else if (ch>='A' && ch<='Z') {
			return ch-'A'+10;
		}else {
			return -1;
		}
	}

	public static long factString2Dec(String str) {
		int len = str.length();
		long res =0;
		for (int i = 0; i < len-1; i++) {
			res = (res +charToInt(str.charAt(i)))*(len-i-1);
		}
		return res;
	}
}
