/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * ProdFibTest.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月4日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class ProdFibTest {

	@Test
	public void test1() {
		long[] r = new long[] {55, 89, 1};
		assertArrayEquals(r, ProdFib.productFib(4895));
	}
	@Test
	public void test2() {
		long[] r = new long[] {89, 144, 0};
		assertArrayEquals(r, ProdFib.productFib(5895));
	}
	@Test
	public void test3() {
		long[] r = new long[] {21, 34, 1};
		assertArrayEquals(r, ProdFib.productFib(714));
	}
	@Test
	public void test4() {
		long[] r = new long[] {34, 55, 0};
		assertArrayEquals(r, ProdFib.productFib(800));
	}

}

