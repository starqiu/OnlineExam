/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * GroupsTest.java
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
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class GroupsTest {

	@Test
	public void myTests() {
		assertEquals(Groups.groupCheck("()"), true);
		assertEquals(Groups.groupCheck("({"), false);
	}
	@Test
	public void test1() {
		assertEquals(Groups.groupCheck("({})"), true);
	}
	@Test
	public void test11() {
		assertEquals(Groups.groupCheck("[[]()]"), true);
	}
	@Test
	public void test12() {
		assertEquals(Groups.groupCheck("[{()}]"), true);
	}
	@Test
	public void test2() {
		assertEquals(Groups.groupCheck("{(})"), false);
	}
	@Test
	public void test21() {
		assertEquals(Groups.groupCheck("([]"), false);
	}
	@Test
	public void test22() {
		assertEquals(Groups.groupCheck("[])"), false);
	}

}
