/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * PersistTest.java
 * 2016年1月28日
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
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class PersistTest {

	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		assertEquals(3, Persist.persistence(39));
		assertEquals(0, Persist.persistence(4));
		assertEquals(2, Persist.persistence(25));
		assertEquals(4, Persist.persistence(999));
	}
	@Test
	public void test1() {
		assertEquals(1, Persist.persistence(11111));
	}
	@Test
	public void test12() {
		assertEquals(1, Persist.persistence(11110));
	}
	@Test
	public void test13() {
		assertEquals(2, Persist.persistence(11192));
	}

}
