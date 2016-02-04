/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * AbbreviatorTest.java
 * 2016年1月29日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月29日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class AbbreviatorTest {
	private Abbreviator abbr = new Abbreviator();

	@Test
	public void testInternationalization() {
		assertEquals("i18n", abbr.abbreviate("internationalization"));
	}
	
	@Test
	public void test2() {
		assertEquals("e6t-r2e", abbr.abbreviate("elephant-ride"));
	}
	@Test
	public void test3() {
		assertEquals("e6t r2e", abbr.abbreviate("elephant ride"));
	}
	@Test
	public void test4() {
		assertEquals("i18n e6t-r2e", abbr.abbreviate("internationalization elephant-ride"));
	}
	
	@Test
	public void test5() {
		assertEquals("t3w the k5n s2k at em", abbr.abbreviate("throw the kitchen sink at em"));
	}
}
