/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * PrimeDecomp.java
 * 2016年2月1日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月1日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class PrimeDecomp {
    public static String factors(int n) {
        // your code
    	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    	for (int i = 2; i <=n; i++) {
			while (n%i == 0 ) {
				n = n/i;
				map.put(i, map.get(i) == null
						?1:map.get(i)+1);
			}
		}
    	return map.entrySet().stream()
    				  .map(e->e.getValue()==1
    				  	?String.format("(%d)", e.getKey())
    				  	:String.format("(%d**%d)", e.getKey(),e.getValue()))
    				  .collect(Collectors.joining());
			
    }
    
    public static void main(String[] args) {
    	System.out.println(Math.sqrt(2*11*17));
	}
}

