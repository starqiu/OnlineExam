/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * HighAndLowTest.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月27日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class HighAndLowTest {
	  @Test
	  public void Test1() {
	    assertEquals("42 -9", HighAndLow.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	  }
}

