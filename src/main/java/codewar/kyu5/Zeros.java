/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Zeros.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月4日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Zeros {
	public static int zeros(int n) {
		int count = 0;
		//just count how many 5 is this
		while (n > 0) {
			n /= 5;
			count += n;
		}
		return count;
	}

	public static Long fac(int i) {
		if (i <1 ) {
			return -1L;
		}
		Long prod =1L;
		while (i>1) {
			prod *= i;
			i--;
		}
		return prod;
	}

	public static void main(String[] args) {
		System.out.println(fac(25));
		System.out.println(zeros(25));
	}
}
