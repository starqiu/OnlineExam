/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * DirReduction.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class DirReduction {
    public static String[] dirReducRecursive(String[] arr) {
    	String str = String.join(",", arr);
    	if ("".equals(str)) {
			return new String[]{};
		}
    	str = str.replaceAll("WEST,EAST", "");
    	str = str.replaceAll("NORTH,SOUTH", "");
    	str = str.replaceAll("EAST,WEST", "");
    	str = str.replaceAll("SOUTH,NORTH", "");
    	str = str.replaceAll("^,+", "");
    	// 可以使用尾递归优化
    	return str.equals(String.join(",", arr))?arr:dirReducRecursive(str.split(",+"));
    }
    public static String[] dirReduc(String[] arr) {
    	String str =null;
    	while (!String.join(",", arr).equals(str)) {
			str = String.join(",", arr);
			str = str.replaceAll("WEST,EAST", "");
			str = str.replaceAll("NORTH,SOUTH", "");
			str = str.replaceAll("EAST,WEST", "");
			str = str.replaceAll("SOUTH,NORTH", "");
			str = str.replaceAll("^,+", "");
			arr = str.split(",+");
		}
    	return "".equals(str)?new String[]{}:arr;
    }
    public static void main(String[] args) {
		System.out.println(",,gsd,,bh".replaceAll("^,+", ""));
		String[] strings =dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"});
		System.out.println(Arrays.toString(strings));
		System.out.println(new String[]{});
	}
}

