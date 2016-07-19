/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * HighAndLow.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;


/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月27日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class HighAndLow {
	public static String HighAndLow(String numbers) {
		// Code here or
		String[] intStrArr = numbers.split(" ");
		int len = intStrArr.length;
		if (len <1) {
			return "throw towel";
		}
		int high = Integer.MIN_VALUE;
		int low = Integer.MAX_VALUE;
		int num = 0;
		for (String numStr : intStrArr) {
			num = Integer.valueOf(numStr);
			if ( num < low) {
				low = num;
			}
			if (num > high) {
				high = num;
			}
		}
		return high + " " + low;
	}
}
