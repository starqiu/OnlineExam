/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Funcij.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import java.math.BigInteger;

public class Funcij {
	
	public static BigInteger  sumin(int n) {
		BigInteger sum = BigInteger.ZERO;
		for(int i=1;i<=n;i++){
			sum = sum.add(BigInteger.valueOf((i*2-1)*(n+1-i)));
		}
		return sum;
	}
	public static BigInteger  sumax(int n) {
		BigInteger sum = BigInteger.ZERO;
		for(int i=1;i<=n;i++){
			sum = sum.add(BigInteger.valueOf((i*2-1)*i));
		}
		return sum;
	}
	public static BigInteger  sumsum(int n) {
		return sumin(n).add(sumax(n));
	}
}
