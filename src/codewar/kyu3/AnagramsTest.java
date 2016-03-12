/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * AnagramsTest.java
 * 2016年2月17日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月17日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class AnagramsTest {

	  @Test
	  public void testKnownInputs() {
	    Anagrams anagram = new Anagrams();
	    
	    assertEquals("Position for 'A' incorrect", BigInteger.ONE, anagram.listPosition("A"));
	    assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(2), anagram.listPosition("ABAB"));
	    assertEquals("Position for 'AAAB' incorrect", BigInteger.ONE, anagram.listPosition("AAAB"));
	    assertEquals("Position for 'BAAA' incorrect", BigInteger.valueOf(4), anagram.listPosition("BAAA"));
	    assertEquals("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), anagram.listPosition("QUESTION"));
	    assertEquals("Position for 'BOOKKEEPER' incorrect", BigInteger.valueOf(10743), anagram.listPosition("BOOKKEEPER"));
	  }
}

