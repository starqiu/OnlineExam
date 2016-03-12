/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * FibonacciTest.java
 * 2016年2月15日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月15日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class FibonacciTest {

	@Test
	public void testFibNeg1() {
		testFib(1, -1);
	}
	@Test
	public void testFibNeg2() {
		testFib(-1, -2);
	}
	@Test
	public void testFib0() {
		testFib(0, 0);
	}

	@Test
	public void testFib1() {
		testFib(1, 1);
	}

	@Test
	public void testFib2() {
		testFib(1, 2);
	}

	@Test
	public void testFib3() {
		testFib(2, 3);
	}

	@Test
	public void testFib4() {
		testFib(3, 4);
	}

	@Test
	public void testFib5() {
		testFib(5, 5);
	}

	private static void testFib(long expected, long input) {
		BigInteger found;
		try {
			found = Fibonacci.fib(BigInteger.valueOf(input));
		} catch (Throwable e) {
			// see https://github.com/Codewars/codewars.com/issues/21
			throw new AssertionError("exception during test: " + e, e);
		}
		assertEquals(BigInteger.valueOf(expected), found);
	}

}
