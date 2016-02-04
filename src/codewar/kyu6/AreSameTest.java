/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * AreSameTest.java
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
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月28日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class AreSameTest {

	@Test
	public void test1() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(AreSame.comp(a, b), true); 
	}
	@Test
	public void test3() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
		assertEquals(AreSame.comp(a, b), false); 
	}
	@Test
	public void test2() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(AreSame.comp(a, b), false); 
	}

}

