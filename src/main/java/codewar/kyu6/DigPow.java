/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DigPow.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月28日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DigPow {
	public static long digPow(int n, int p) {
		// your code
		String intStr = String.valueOf(n);
		int len = intStr.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += Math.pow(Integer.parseInt(intStr.charAt(i)+""), p+i);
		}
		return (sum % n == 0)? sum/n : -1;
	}
}

