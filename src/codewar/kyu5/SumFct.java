/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * SumFct.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.math.BigInteger;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		if (BigInteger.ZERO.equals(n)) {
			return BigInteger.valueOf(4);
		}
		BigInteger a = BigInteger.ONE;
		BigInteger b =BigInteger.ONE;
		n= n.subtract(BigInteger.ONE);
		BigInteger m = n.divide(BigInteger.valueOf(2));
		BigInteger sum = a.add(b);
		for (BigInteger i = BigInteger.ZERO; i.compareTo(m)==-1; 
				i=i.add(BigInteger.ONE)) {
			a = a.add(b);
			b = a.add(b);
			sum = sum.add(a.add(b));
		}
		if (n.mod(BigInteger.valueOf(2)).intValue() == 1) {
			sum = sum.add(a.add(b));
		}
		return sum.multiply(BigInteger.valueOf(4));
	}
	public static void main(String[] args) {
		perimeter(BigInteger.TEN);
	}
}

