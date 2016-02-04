/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * EightiesKids1.java
 * 2016年1月27日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu7;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月27日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class EightiesKids1 {
	public static String totalLicks(Map<String, Integer> env) {
		// your code here
		String res;
		res = String.format("It took %d licks to get to the tootsie roll center of a tootsie pop.", 
				env.values().stream().reduce(252, Integer::sum));
		Optional<Entry<String, Integer>> maxPos =  env.entrySet().stream()
				.filter(e->e.getValue()>0)
				.max((e1,e2)->e1.getValue().compareTo(e2.getValue()));
		if (maxPos.isPresent()) {
			
			res = String.format("%s The toughest challenge was %s.", res,maxPos.get().getKey());
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println((char)101);
	}
}
