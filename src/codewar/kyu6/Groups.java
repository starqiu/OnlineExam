/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Groups.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import java.util.LinkedList;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Groups {
	public static boolean groupCheck(String s) {
		int len = s.length();
		if ( len == 0) {
			return true;
		}else if(len%2 ==1){
			return false;
		}
		
		LinkedList<Character> stack = new LinkedList<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < len; i++) {
			if (!stack.isEmpty() && match(stack.peek(),s.charAt(i))) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}
	public static boolean match(char m,char n) {
		return  (m=='(' && n ==')' ) ||
				(m=='[' && n ==']' ) ||
				(m=='{' && n =='}' );
	}
}
