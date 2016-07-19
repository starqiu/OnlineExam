/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DiophTest.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DiophTest {

	@Test
	public void test1() {
		assertEquals("[[3, 1]]", Dioph.solEquaStr(5));
	}
	@Test
	public void test2() {
		assertEquals("[[4, 1]]", Dioph.solEquaStr(12));
	}
	@Test
	public void test3() {
		assertEquals("[[7, 3]]", Dioph.solEquaStr(13));
	}
	@Test
	public void test4() {
		assertEquals("[[4, 0]]", Dioph.solEquaStr(16));
	}

}

