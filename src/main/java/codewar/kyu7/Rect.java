/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Rect.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import java.util.Map;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月27日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Rect {

	public static int numberOfRectangles(int m, int n) {
		// Your code here!
		if (m == 0 || n == 0) {
			return 0;
		}
		
		if(m<n) return numberOfRectangles(n,m);
		//m>=n
		int num = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				num += (m-i+1)*(n-j+1);
			}
		}
		return num;
	}
	public static void main(String[] args) {
//		System.out.println(numberOfRectangles(3, 2));
//		for (int i = 40; i<100; i++) {
//			for (int j = i; j<100; j++) {
//				if (numberOfRectangles(i, j)==1242528) {
//					System.out.printf("%d %d\n",i,j);
//					return;
//				}
//			}
//		}
		
		String s = "Code_warrior@foo.ac.uk";
		s = s.replace("@", " [at] ");
		s = s.replace(".", " [dot] ");
		System.out.println(s);
		Map<String, Integer> env = null;
//		return 
				env.values().stream().reduce(252, Integer::sum);
	}

}
