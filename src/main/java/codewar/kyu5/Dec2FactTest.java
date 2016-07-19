/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Dec2FactTest.java
 * 2016年2月4日
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
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月4日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Dec2FactTest {

	@Test
	public void test11() {
		assertEquals(Dec2Fact.dec2FactString(1001L), "1212210");
	}
	@Test
	public void test12() {
		assertEquals(Dec2Fact.dec2FactString(463), "341010");
	}
	@Test
	public void test21() {
		assertEquals(Dec2Fact.factString2Dec("1212210"), 1001L);
	}
	@Test
	public void test22() {
		assertEquals(Dec2Fact.factString2Dec("341010"), 463);
	}

}
