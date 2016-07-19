/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * ProdFib.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import com.sun.xml.internal.ws.api.pipe.Fiber;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月4日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class ProdFib {
	public static long[] productFib(long prod) {
		if (prod <0) {
			return null;//error
		}

		long a =0,b=1;
		long tmp =0;
		while (a*b<prod) {//a<=b
			tmp = b;
			b = a+b;
			a=tmp;
		}
		return a*b==prod?new long[]{a,b,1}
						:new long[]{a,b,0};
	}
	
	public static long fib(long n){
		if (n <0) {
			return -1;//error
		}
		if (n ==0) {
			return 0;
		}else if (n ==1){
			return 1;
		}
		long a =0,b=1;
		long div2 = n>>1;
		for (int i = 0; i < div2; i++) {
			a = a+b;
			b = a+b;
		}
		return (n%2 == 0)?a:b;
	}
}
