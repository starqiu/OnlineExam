/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Fibonacci.java
 * 2016年2月15日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

import java.math.BigInteger;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月15日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Fibonacci {
	public static BigInteger fib(BigInteger n) {
		return fibIter( BigInteger.ONE, BigInteger.ZERO, 0,1, n);
	}
	
	
	public static BigInteger fib1(BigInteger n) {
		BigInteger a =BigInteger.ONE,b=BigInteger.ZERO,count=n,tmpBigInteger=BigInteger.ZERO;
		int p=0,q=1,tmp=0;
		
		while (!BigInteger.ZERO.equals(count) ) {
			if (count.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
				tmp=p*p+q*q;
				q=(p>>1+q)*q;
				p=tmp;
				count=count.divide(BigInteger.valueOf(2));
			}else {
				tmpBigInteger=b.multiply(BigInteger.valueOf(q)).add(a.multiply(BigInteger.valueOf(q))).add(a.multiply(BigInteger.valueOf(p)));
				b=b.multiply(BigInteger.valueOf(p)).add(a.multiply(BigInteger.valueOf(q)));
				a=tmpBigInteger;
				count=count.subtract(BigInteger.ONE);
			}
		}
		return b;
	}
	
	public static BigInteger fib2(BigInteger n) {
		if (n.equals(BigInteger.ZERO)) {
			return BigInteger.ZERO;
		}else if (n.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		}
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger div2 = n.divide(BigInteger.valueOf(2));
		if (n.compareTo(BigInteger.ZERO)==1) {
			for (BigInteger i = BigInteger.ZERO; 
					i.compareTo(div2)==-1; i = i.add(BigInteger.ONE)) {
				a = a.add(b);
				b = a.add(b);
			}
			return (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))?a:b;
		}else {
			div2 = n.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2)).abs();
			for (BigInteger i = BigInteger.ZERO; 
					i.compareTo(div2)==-1; i = i.add(BigInteger.ONE)) {
				b = b.subtract(a);
				a = a.subtract(b);
				System.out.println(b);
				System.out.println(a);
			}
		}
		return (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))?a:b;
	}
	
	public static BigInteger fibIter(BigInteger a,BigInteger b ,
			int p,int q,BigInteger count) {
		if (BigInteger.ZERO.equals(count) ) {
			return b;
		}else if (count.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
			return fibIter(a, b, p*p+q*q,
					(p>>1+q)*q,
					count.divide(BigInteger.valueOf(2)));
		}else {
			return fibIter(b.multiply(BigInteger.valueOf(q)).add(a.multiply(BigInteger.valueOf(q))).add(a.multiply(BigInteger.valueOf(p))),
					b.multiply(BigInteger.valueOf(p)).add(a.multiply(BigInteger.valueOf(q))), p, q, count.subtract(BigInteger.ONE));
		}
	}
	public static void main(String[] args) {
		fib(BigInteger.valueOf(-3));
//		System.out.println( BigInteger.valueOf(-9).divide(BigInteger.valueOf(2)));
	}
}
