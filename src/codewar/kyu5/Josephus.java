/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Josephus.java
 * 2016年2月2日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年2月2日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class Josephus {
	public static <T> List<T> josephusPermutation(final List<T> items,
			final int k) {
		int len = items.size();
		int n = len;
		
		int[] indexArr = new int[len];
		int m =k-1;//start from 0,not 1
		//f(m,i)=(((m%(n-i)+k)%(n-i+1)+k)%(n-i+2)+k...)%n
		for (int i = 0; i < len; i++) {
			indexArr[i]=m%(len-i);
		}
		int j = 1;
		while (j <len) {
			for (int i = 0; i<len-j; i++) {
				indexArr[i+j] = (indexArr[i+j]+k) % (len-i);
			}
			j++;
		}
//		System.out.println(Arrays.toString(indexArr));
		return Arrays.stream(indexArr)
				.mapToObj(i -> items.get(i))
				.collect(Collectors.toList());

	}
}
