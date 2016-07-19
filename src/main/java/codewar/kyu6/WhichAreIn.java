/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * WhichAreIn.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月28日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> reSet = new TreeSet<>();
		for (String a1 : array1) {
			if(Arrays.stream(array2).anyMatch(x->x.contains(a1))){
				reSet.add(a1);
			}
		}
		String[] res = new String[reSet.size()];
		reSet.toArray(res);
		return res;
	}
}

