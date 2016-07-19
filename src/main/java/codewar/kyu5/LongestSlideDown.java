/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * LongestSlideDown.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Arrays;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月4日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        // Code Goes Here..
    	int max = 0;
    	int floor = pyramid.length;
    	int[] lastMaxPath = new int[floor];
    	int[] curMaxPath = new int[floor];
    	int curFloor = 0;
    	while (curFloor < floor) {
    		for (int i = 0; i <= curFloor; i++) {
    			curMaxPath[i] = pyramid[curFloor][i];
    			if (i==0) {//start
    				curMaxPath[i] += lastMaxPath[i];
				}else if (i == curFloor) {//end
					curMaxPath[i] += lastMaxPath[i-1];
				}else {
					curMaxPath[i] += Integer.max(lastMaxPath[i], lastMaxPath[i-1]);
				}
			}
    		curFloor++;
    		lastMaxPath = Arrays.copyOf(curMaxPath, curFloor);
    		Arrays.setAll(curMaxPath, x->0);
		}
    	return Arrays.stream(lastMaxPath).max().getAsInt();
    }
}

