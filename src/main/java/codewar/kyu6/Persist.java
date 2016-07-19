/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Persist.java
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
public class Persist {
	public static int persistence(long n) {
		// your code
		
		if (n / 10 == 0) {// 1 digit
			return 0;
		} else {
			long m = String.valueOf(n).chars()
					 .mapToLong(x->(long)Character.getNumericValue((char)x))
					 .reduce(1L,(e,s)-> e*s);
			return 1 + persistence(m);
		}

	}
	
}
