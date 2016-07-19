/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Decompose.java
 * 2016年2月5日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * 实现功能：Square into Squares. Protect trees!
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月5日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Decompose {
	public String decompose(long n) {
		long nn = n*n;
		long remainder = nn;
		long sqrtRem = 0;
		LinkedList<Long> stack = new LinkedList<>();
		stack.push(n-1);
		long last = stack.peek();
		remainder -= last*last;
		while (remainder > 0) {
			sqrtRem = (long) Math.sqrt(Double.valueOf(String.valueOf(remainder)));
			last = (last<=sqrtRem)?last-1:sqrtRem;
			if (last == 0) {//has push 1
				last = stack.pop();
				remainder += last*last;
				if (stack.isEmpty()) {
					return "";
				}else {
					last = stack.pop();
					remainder += last*last;
				}
			}else {
				stack.push(last);
				remainder -= last*last;
			}
			
			if (remainder == 0) {
				return stack.stream()
						.map(x->String.valueOf(x))
						.collect(Collectors.joining(" "));
			}else if(remainder < 0){
				last = stack.pop();
				remainder += last*last;
			}
		}
		return "";
	}
	
	public static long compose(String str){
		long res = Arrays.stream(str.split(" "))
						 .mapToLong(Long::valueOf)
						 .map(x -> x*x)
						 .sum();
		return (long)Math.sqrt(res);
	}
	
	public static void main(String[] args) {
		System.out.println(compose("1 2 3 7 9"));
		System.out.println(compose("2 5 8 34 624"));
		System.out.println(compose("2 3 5 119 7099"));
		System.out.println();
	}
}
