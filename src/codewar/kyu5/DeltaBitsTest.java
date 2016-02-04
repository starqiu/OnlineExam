/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DeltaBitsTest.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月1日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class DeltaBitsTest {

	@Test
	public void test() throws Exception {
		assertThat(DeltaBits.convertBits(31, 14), is(2));
	}

}
