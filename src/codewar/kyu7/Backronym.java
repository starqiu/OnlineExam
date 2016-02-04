/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Backronym.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月27日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Backronym {
	private static Map<String, String> dictionary = new HashMap<String, String>();

	public static String makeBackronym(String acronym) {
		dictionary.put("A", "asd");
		dictionary.put("B", "asd");
		dictionary.put("C", "asd");
		dictionary.put("D", "asd");

		acronym.chars()
			.mapToObj(x->dictionary.get(String.valueOf((char)x).toUpperCase()))
			.forEach(System.out::println);
		String reString = acronym.chars().parallel()
				.mapToObj(x-> dictionary.get(String.valueOf((char)x).toUpperCase()))
				.collect(Collectors.joining(" "));
		System.out.println(reString);
		return reString;
	}
	
	public static void main(String[] args) {
		makeBackronym("abcd");
	}

}
