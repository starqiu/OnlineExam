/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * StairsTest.java
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

public class StairsTest {
	@Test
	public void test1() {
		assertEquals(6, new Stairs().NumberOfSteps(10, 2));
	}

	@Test
	public void test2() {
		assertEquals(-1, new Stairs().NumberOfSteps(3, 5));
	}
}
