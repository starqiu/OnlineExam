/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * WhichAreInTest.java
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
public class WhichAreInTest {

	@Test
	public void test1() {
		String a[] = new String[]{ "live", "arp", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}

}

