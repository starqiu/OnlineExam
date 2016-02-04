/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * SumFctTest.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class SumFctTest {

	@Test
	public void test1() {
		assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
	}
	@Test
	public void test2() {
		assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
	}
	@Test
	public void test3() {
		assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
	}
	@Test
	public void test4() {
		assertEquals(BigInteger.valueOf(4), SumFct.perimeter(BigInteger.valueOf(0)));
	}
	@Test
	public void test5() {
		assertEquals(BigInteger.valueOf(8), SumFct.perimeter(BigInteger.valueOf(1)));
	}
	@Test
	public void test6() {
		assertEquals(BigInteger.valueOf(16), SumFct.perimeter(BigInteger.valueOf(2)));
	}

}

