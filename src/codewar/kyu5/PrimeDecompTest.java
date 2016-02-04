/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * PrimeDecompTest.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class PrimeDecompTest {

    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;        
        assertEquals(
            "(2**2)(3**3)(5)(7)(11**2)(17)",
            PrimeDecomp.factors(lst));
    }

}

