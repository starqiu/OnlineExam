/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * PrimeNumberDecomposerTest.java
 * 2016年2月4日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月4日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class PrimeNumberDecomposerTest {

	  private static PrimeNumberDecomposer worker;
	  
	  private final long n;
	  Long[] factors;
	  Long[][] uniqueFactors;
	  Long[] factorProducts;
	  
	  public PrimeNumberDecomposerTest(long n, long[] factors, long[][] uniqueFactors, long[] factorProducts) {
	    this.n = n;
	    this.factors = Long2long(factors);
	    this.uniqueFactors = new Long[2][];
	    this.uniqueFactors[0] = Long2long(uniqueFactors[0]);
	    this.uniqueFactors[1] = Long2long(uniqueFactors[1]);
	    this.factorProducts = Long2long(factorProducts);
	  }
	  
	  @Parameterized.Parameters
	  public static Collection<?> tests() {
	    return Arrays.asList(new Object[][] {
		    {100L, new long[] {2L,2L,5L,5L}, new long[][]{ new long[] {2L,5L}, new long[] {2L,2L}} , new long[] {4L,25L}},
		    {135L, new long[] {3L,3L,3L,5L}, new long[][]{ new long[] {3L,5L}, new long[] {3L,1L}} , new long[] {27L,5L}}
	    });
	  }
	  protected static Long[] Long2long(long[] data) {
	    Long[] result = new Long[data.length];
	    for (int i = 0; i < data.length; i++) {
	      result[i] = data[i];
	    }
	    return result;
	  }
	  private static String arrayAsString(Long[] data) {
	    String result = "";
	    for (int i = 0; i < data.length; i++) {
	      if ( i > 0 ) {
		result += ",";
	      }
	      result += data[i];
	    }
	    return result;
	  }
	  private static String arrayAsString(long[] data) {
	    String result = "";
	    for (int i = 0; i < data.length; i++) {
	      if ( i > 0 ) {
		result += ",";
	      }
	      result += "," + data[i];
	    }
	    return result;
	  }
	  @BeforeClass
	  public static void init(){
	    worker = new PrimeNumberDecomposer();
	  }
	  @Test
	  public void test() {
	    Long[] factors = PrimeNumberDecomposer.getAllPrimeFactors(n);
	    Long[][] uniqueFactors = PrimeNumberDecomposer.getUniquePrimeFactorsWithCount(n);
	    Long[] factorProducts = PrimeNumberDecomposer.getPrimeFactorPotencies(n);
	      /*
		    I tried assertArrayEquals, but if array length is correct and values are different, the message is not printed, making it harder to debug for candidates
	    */
	    assertEquals("Factors should be " + arrayAsString(this.factors) + ", but is " + arrayAsString(factors), arrayAsString(this.factors), arrayAsString(factors));
	    assertEquals("Factors products should be " + arrayAsString(this.factorProducts) + ", but is " + arrayAsString(factorProducts), arrayAsString(this.factorProducts), arrayAsString(factorProducts));
	    assertEquals("getUniquePrimeFactorsWithCount(" + n + "): First dimension of returned array should be size 2, is " +  uniqueFactors.length, 2, uniqueFactors.length);
	    assertEquals("getUniquePrimeFactorsWithCount(" + n + "): Unique primes should be " + arrayAsString(this.uniqueFactors[0]) + ", but are " + arrayAsString(uniqueFactors[0]), arrayAsString(this.uniqueFactors[0]), arrayAsString(uniqueFactors[0]));
	    assertEquals("getUniquePrimeFactorsWithCount(" + n + "): Unique primes count should be " + arrayAsString(this.uniqueFactors[1]) + ", but are " + arrayAsString(this.uniqueFactors[1]), arrayAsString(this.uniqueFactors[1]), arrayAsString(uniqueFactors[1]));
	  }

}

