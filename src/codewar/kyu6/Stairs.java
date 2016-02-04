/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Stairs.java
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
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Stairs {
	public static int NumberOfSteps(int n, int m) {
		// Your code is here...
		//the smallest step it should satisfy
		int min = n>>1;
		min = (n%2==1)?min+1:min;
		
		int k1 = n/m;
		int k2 = min/m;
		int mul =1;
		for (int i = k2; i <= k1; i++) {
			mul = i *m;
			if (mul >=min && mul<=n) {
				return mul;
			}
		}
		return -1;
	}
	
}
