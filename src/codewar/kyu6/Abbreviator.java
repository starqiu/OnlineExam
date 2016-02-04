/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Abbreviator.java
 * 2016年1月29日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月29日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Abbreviator {
	public String abbreviate(String string) {
		String[] strsWithDelimiter = string.split("[^a-zA-Z]");
		for (String str : strsWithDelimiter) {
			string = string.replace(str, abbr(str));
		}
		return string;
	}
	
	
	public String abbr(String string) {
		if (!string.matches("[a-z]+")) {
			return string;
		}
		int len = string.length();
		if (len <= 3)
			return string;
		return String.format("%c%d%c", string.charAt(0), len - 2,
				string.charAt(len - 1));
	}
	
	public static void main(String[] args) {
		System.out.println(new Abbreviator().abbreviate("abbreviation sda"));
	}
}
