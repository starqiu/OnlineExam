/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * ModTest.java
 * 2016年2月2日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月2日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class ModTest {

	  @Test
	  public void testValidMod4() throws Exception {
	    String[] validTests = {"[+05620]", "[005624]", "[-05628]", "[005632]", "[555636]", "[+05640]", "[005600]",
	                           "the beginning [-0] the end", "~[4]", "[32]", "the beginning [0] ... [invalid] numb[3]rs ... the end",
	                           "...may be [+002016] will be."};
	    for(String test : validTests) {
	      Matcher m = Mod.mod4.matcher(test);
	      assertTrue(test + " is valid, but no match was made.", m.find());
	    }
	  }
	  
	  @Test
	  public void testInvalidMod4() throws Exception {
	    String[] invalidTests = {"[+05621]", "[-55622]", "[005623]", "[~24]", "[8.04]", "No, [2014] isn't a multiple of 4..."};
	    for(String test : invalidTests) {
	      Matcher m = Mod.mod4.matcher(test);
	      assertFalse(test + " is invalid, but a match was made.", m.find());
	    }
	  }

}

