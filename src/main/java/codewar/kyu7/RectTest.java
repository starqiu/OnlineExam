/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * RectTest.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月27日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectTest {

	private Rect soln = new Rect();

	@Test
	public void shouldWorkWith4x4() {
		assertEquals("100", 100, soln.numberOfRectangles(4, 4), 0);
	}

	@Test
	public void shouldWorkWith5x5() {
		assertEquals("225", 225, soln.numberOfRectangles(5, 5), 0);
	}

	@Test
	public void test1() {
		assertEquals(18, soln.numberOfRectangles(3, 2));
	}

}
