/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DeltaBits.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

/**
 * 实现功能： Write a function convertBits to determine the number of bits required
 * to convert positive integer A to positive integer B.
 * 
 * For example, you can change 31 to 14 by flipping the 4th and 0th bit:
 * 
 * 31 0 0 0 1 1 1 1 1 14 0 0 0 0 1 1 1 0 --- --------------- bit 7 6 5 4 3 2 1 0
 * Thus 31 and 14 should return 2.
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月1日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class DeltaBits {
	public static int convertBits(int a, int b) {
		int same = a^b;//get different bits
		int count =0;
		while (same >0) {//count different bits
			count++;
			same = same&(same-1);
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(0^1);
	}
}
