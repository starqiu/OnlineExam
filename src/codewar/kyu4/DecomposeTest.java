/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DecomposeTest.java
 * 2016年2月5日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月5日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DecomposeTest {

	public Decompose d = new Decompose();
	
	@Test
	public void test1() {
		assertEquals("1 2 4 10",  d.decompose(11));
	}
	@Test
	public void test2() {
		assertEquals("1 2 3 7 9",  d.decompose(12));
	}
	@Test
	public void test3() {
		assertEquals("2 5 8 34 624",  d.decompose(625));
	}
	@Test
	public void test4() {
		assertEquals("2 3 5 119 7099",  d.decompose(7100));
	}
	@Test
	public void test5() {
		assertEquals("2 5 8 34 624",  d.decompose(625));
	}
	@Test
	public void test6() {
		assertEquals("2 8 32 1571 1234566",  d.decompose(1234567));
	}

}

