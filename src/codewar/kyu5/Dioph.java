/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Dioph.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class Dioph {
	public static String solEquaStr(long n) {
		// your code
		long sqrtN = (long) Math.sqrt(n);
		long a =0,b=0;
		List<String> resList = new LinkedList<String>();
		for (long i = 1; i <= sqrtN; i++) {
			if (n%i != 0) {
				continue;
			}
			//get factors
			a = i;
			b = n/i;
			if ((a+b)%2==0 && (b-a)%4 ==0) {
				resList.add(String.format("[%d, %d]", (a+b)>>1,(b-a)>>2));
			}
		}
		return resList.stream().collect(Collectors.joining(", ", "[", "]"));
	}
	public static void main(String[] args) {
		System.out.println(solEquaStr(2));
	}
}

