/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * SumOfK.java
 * 2016年1月29日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 实现功能： 
 * John and Mary want to travel between a few towns A, B, C ... Mary has on a sheet of paper a list of distances between these towns. ls = [50, 55, 57, 58, 60]. John is tired of driving and he says to Mary that he doesn't want to drive more than t = 174 miles and he will visit only 3 towns. Which distances, hence which towns, they will choose so that the sum of the distances is the biggest possible - to please Mary - but less than t - to please John- ?

Example: With list ls and 3 towns to visit they can make a choice between: [50,55,57],[50,55,58],[50,55,60],[50,57,58],[50,57,60],[50,58,60],[55,57,58],[55,57,60],[55,58,60],[57,58,60].

The sums of distances are then: 162, 163, 165, 165, 167, 168, 170, 172, 173, 175.

The biggest possible sum taking a limit of 174 into account is then 173 and the distances of the 3 corresponding towns is [55, 58, 60].

The function chooseBestSum (or choose_best_sum or ... depending on the language) will take as parameters t (maximum sum of distances, integer >= 0), k (number of towns to visit, k >= 1) and ls (list of distances, all distances are positive or null integers and this list has at least one element). The function returns the "best" sum ie the biggest possible sum of k distances less than or equal to the given limit, if that sum exists, or otherwise nil, null, None, Nothing depending on the language.

Examples:

ts = [50, 55, 56, 57, 58] choose_best_sum(163, 3, ts) -> 163

xs = [50] choose_best_sum(163, 3, xs) -> nil

ys = [91, 74, 73, 85, 73, 81, 87] choose_best_sum(230, 3, ys) -> 228
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年1月29日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class SumOfK {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        // your code
    	int len = ls.size();
    	if (t < 0||len < k) {
			return null;
		}
    	if (k == 0) {
			return 0;
		}
    	
    	Collections.sort(ls);
    	
    	if (k ==1) {
    		return chooseBestSumForOne(t, ls);
		}
    	
    	int sum =0;
    	int max = 0;
    	//a stack, store k indexes of ls, push big index first
    	LinkedList<Integer> indexStack = new LinkedList<>();
    	int first = len-1 ;
    	indexStack.push(first);
    	sum += ls.get(first);
    	//the number of remained element should enough
    	while (indexStack.size() < k ) {
    		first --;
    		if (first>=0 ) {
				indexStack.push(first);
				sum += ls.get(first);
				if (sum>t) {
					//the sum of less than or equal k elements has more than t,quit the smallest element
					first = indexStack.pop();
					sum -= ls.get(first);
				}
				if (indexStack.size() == k) {//sum <=t
//					System.out.println(Arrays.toString(indexStack.toArray()));
					if (t == sum) {//has get the max value,return
						return sum;
					}
					max = max<sum?sum:max;//sum <t
					if (first ==0 && indexStack.getLast()==k-1) {//the min k element
						break;
					}
					//the last biggest element get,needn't continue again this time
					indexStack.pop();// k should bigger than 2
					sum -= ls.get(first);
					first = indexStack.pop();
					sum -= ls.get(first);
				}
			}else {
				first = indexStack.pop();
				sum -= ls.get(first);
			}
		}
    	
    	return max>0?max:null;
    }

	private static Integer chooseBestSumForOne(int t, List<Integer> ls) {
		int max = 0;
		if (ls.get(0)> t) {
			return null;
		}else {
			for (Integer e : ls) {
				if (e <= t) {
					max = e;
				}else {
					break;
				}
			}
		}
		return max;
	}
    
    //递归
    public static Integer chooseBestSumRec(int t, int k, List<Integer> ls) {
    	// your code
    	int len = ls.size();
    	if (t < 0||len < k) {
    		return null;
    	}
    	if (k == 0) {
    		return 0;
    	}
    	Collections.sort(ls);
    	
    	Integer sum =0;
    	int max = 0;
    	int e =0;
    	for (int i = len -1 ; i >= 0 ; i--) {
    		e = ls.remove(i);
    		
    		sum = chooseBestSum(t-e, k-1, ls);
    		ls.add(i, e);
    		if (null != sum && max < sum+e) {
    			max = sum+e;
    		}
    	}
    	
    	return max>0?max:null;
    }
    public static void main(String[] args) {
//		System.out.println(null + 3);
	}
}

