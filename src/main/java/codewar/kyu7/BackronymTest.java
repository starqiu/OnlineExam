/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * BackronymTest.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import static junit.framework.TestCase.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月27日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class BackronymTest {

	@Test
    public void testExample() {
      assertThat(
        Backronym.makeBackronym("interesting"), 
        is("ingestable newtonian turn eager rant eager stylish turn ingestable newtonian gregarious"));
      assertThat(
        Backronym.makeBackronym("codewars"), 
        is("confident oscillating disturbing eager weird awesome rant stylish"));
    }

}

