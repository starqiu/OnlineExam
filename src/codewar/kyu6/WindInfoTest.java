/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * WindInfoTest.java
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
public class WindInfoTest {

	@Test
	public void testMessage() throws Exception {
		assertEquals("Headwind 15 knots. Crosswind 3 knots from your left.",
				WindInfo.message("18L", 170, 15));
		assertEquals("Headwind 10 knots. Crosswind 17 knots from your left.",
				WindInfo.message("22", 160, 20));
	}

}
