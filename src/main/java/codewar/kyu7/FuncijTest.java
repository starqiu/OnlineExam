/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * FuncijTest.java
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

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Random;

import org.junit.Test;


public class FuncijTest {
	
	@Test
	public void test1() {
		assertEquals(BigInteger.valueOf(55), Funcij.sumin(5));
	}
	
	@Test
	public void test2() {
		assertEquals(BigInteger.valueOf(91), Funcij.sumin(6));
	}
	@Test
	public void test12() {
		assertEquals(BigInteger.valueOf(31395), Funcij.sumin(45));
	}
	@Test
	public void test22() {
		assertEquals(BigInteger.valueOf(332833500), Funcij.sumin(999));
	}
	@Test
	public void test32() {
		assertEquals(BigInteger.valueOf(83345832500L), Funcij.sumin(5000));
	}
	
	@Test
	public void test42() {
		assertEquals(BigInteger.valueOf(161), Funcij.sumax(6));
	}
	@Test
	public void test52() {
		assertEquals(BigInteger.valueOf(61755), Funcij.sumax(45));
	}
	@Test
	public void test62() {
		assertEquals(BigInteger.valueOf(665167500), Funcij.sumax(999));
	}
	@Test
	public void test72() {
		assertEquals(BigInteger.valueOf(183345832500L), Funcij.sumax(5000));
	}
	
	@Test
	public void test4() {
		assertEquals(BigInteger.valueOf(372), Funcij.sumax(8));
	}
	@Test
	public void test5() {
		assertEquals(BigInteger.valueOf(576), Funcij.sumsum(8));
	}
	
}

