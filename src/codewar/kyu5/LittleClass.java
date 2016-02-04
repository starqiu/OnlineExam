/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * LittleClass.java
 * 2016年2月2日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;


/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月2日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class LittleClass {
	private static  String secret = "very well";
	public static void isMySecret(String sec){
		if (secret.equals(sec)) {
			System.out.println("success");
		}else {
			System.out.println("try again");
		}
	}
}

