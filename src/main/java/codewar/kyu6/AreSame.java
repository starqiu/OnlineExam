/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * AreSame.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class AreSame {
	public static boolean comp(int[] a, int[] b) {
		
		if (null == a || null == b ) {
			return false;
		}
		if (a.length ==0 && b.length ==0) {
			return true;
		}else if (a.length ==0 || b.length ==0){
			return false;
		}
		if (a.length != b.length) {
			return false;
		}
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]*a[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}
