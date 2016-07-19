/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * SumOfKTest.java
 * 2016年1月29日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月29日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class SumOfKTest {

//	@Test
//	public void test() {
//		System.out.println("****** Basic Tests small numbers******");
//        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
//        int n = SumOfK.chooseBestSum(163, 3, ts);
//        assertEquals(163, n);
//        ts = new ArrayList<>(Arrays.asList(50));
//        Integer m = SumOfK.chooseBestSum(163, 3, ts);
//        assertEquals(null, m);      
//        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
//        n = SumOfK.chooseBestSum(230, 3, ts);
//        assertEquals(228, n);
//	}
	@Test
	public void test1() {
		System.out.println("****** Basic Tests small numbers1******");
		List<Integer> ts = new ArrayList<>(Arrays.asList(50, 52, 56, 57, 58,59));
		int n = SumOfK.chooseBestSum(51, 1, ts);
		assertEquals(50, n);
	}

}

