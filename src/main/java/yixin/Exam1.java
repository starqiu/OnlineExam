/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Exam1.java
 * 2015年10月14日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package yixin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2015年10月14日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class Exam1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(10);
		System.out.println(list.size());
		list.add("2");
		list.add("2");
		System.out.println(list.size());
		
		File file = new File("Exam1.class");
		
		
	}
}

