/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DigPowTest.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月28日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DigPowTest {

	@Test
	public void Test1() {
		assertEquals(1, DigPow.digPow(89, 1));
	}
	@Test
	public void Test2() {
		assertEquals(-1, DigPow.digPow(92, 1));
	}
	@Test
	public void Test3() {
		assertEquals(51, DigPow.digPow(46288, 3));
	}

}

