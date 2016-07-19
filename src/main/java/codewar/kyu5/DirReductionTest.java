/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DirReductionTest.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DirReductionTest {

	  @Test
	  public void testSimpleDirReduc() throws Exception {
	    assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
	        new String[]{"WEST"},
	        DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

	    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
	        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
	        DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
	  }
	  @Test
	  public void test1() throws Exception {
		  assertEquals("test1",
				  new String[]{},
				  DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
	  }
	  

}

