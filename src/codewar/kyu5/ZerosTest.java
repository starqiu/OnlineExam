/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * ZerosTest.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月4日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class ZerosTest {

	  @Test
	  public void testZeros() throws Exception {
	    assertThat(Zeros.zeros(0), is(0)); 
	    assertThat(Zeros.zeros(6), is(1)); 
	    assertThat(Zeros.zeros(14), is(2));    
	  }

}

