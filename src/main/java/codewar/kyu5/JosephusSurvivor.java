/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * JosephusSurvivor.java
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
public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {
		int f = 0;
		for (int i = 2; i <= n; i++) {
			f = (f + k) % i;
		}

		return f + 1;
	}
}
