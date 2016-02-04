/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * PrimeNumberDecomposer.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.LongStream;

public class PrimeNumberDecomposer {
    public static Map<Long, Long> factors(long n) {
    	Map<Long, Long> map = new TreeMap<Long, Long>();
    	for (long i = 2; i <=n; i++) {
			while (n%i == 0 ) {
				n = n/i;
				map.put(i, map.get(i) == null
						?1:map.get(i)+1);
			}
		}
    	return map;
			
    }
	
	/**
	 * Return value: List of all prime factors of a given number n
	 */
	public static Long[] getAllPrimeFactors(long n) {
		long[] arr = factors(n).entrySet().stream()
				.flatMapToLong(e -> 
					LongStream.generate(()->e.getKey()).limit(e.getValue()))
				.toArray();
		Long[] arrLong = new Long[arr.length];
		for(int i=0;i<arr.length;i++){
			arrLong[i] = arr[i];
		}
		return arrLong;
	}

	/**
	 * Return value: List containing two lists, first containg all prime factors
	 * without duplicates, second containing the count, how often each prime
	 * factor occured. Return code always contains two lists.
	 * 
	 * e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2
	 * occurs 2 times, prime 2 occurs 5 times,
	 */
	public static Long[][] getUniquePrimeFactorsWithCount(long n) {
		Map<Long, Long> map = factors(n);
		Long[] keys = new Long[map.size()];
		Long[] values = new Long[map.size()];
		int i=0;
		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			keys[i] = entry.getKey();
			values[i]=entry.getValue();
			i++;
		}
		return new Long[][] { keys, values };
	}

	/**
	 * Return value: List containing product of same prime factors, e.g.: 45 =
	 * 3*3*5 ==> {3^2,5^1} == {9,5} e.g.: getUniquePrimeFactorsWithCount(100) =
	 * {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times,
	 */
	public static Long[] getPrimeFactorPotencies(long n) {
		long[] arr = factors(n).entrySet().stream()
				.mapToLong(e -> (long)Math.pow(e.getKey().doubleValue()
											,e.getValue().doubleValue()))
				.toArray();
		Long[] arrLong = new Long[arr.length];
		for(int i=0;i<arr.length;i++){
			arrLong[i] = arr[i];
		}
		return arrLong;
	}
	
}
