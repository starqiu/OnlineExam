/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * LoopInspectorTest.java
 * 2016年2月15日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月15日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class LoopInspectorTest {

	  @Test public void loop_size_of_3() {
		    Node list = Node.createChain(1, 3);
		    int result = new LoopInspector().loopSize(list);
		    assertEquals("Incorrect loop size", 3, result);
		  }
		  
		  @Test public void loop_size_of_29() {
		    Node list = Node.createChain(21, 29);
		    int result = new LoopInspector().loopSize(list);
		    assertEquals("Incorrect loop size", 29, result);
		  }
		  
		  @Test public void loop_size_of_1087() {
		    Node list = Node.createChain(3904, 1087);
		    int result = new LoopInspector().loopSize(list);
		    assertEquals("Incorrect loop size", 1087, result);
		  }
		  

}

