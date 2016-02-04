/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Main.java
 * 2015Äê9ÔÂ26ÈÕ
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package netease.exam1;

import java.util.*;

public class Main {

	static int gcd(int a,int b){
		if (a<b) {
			return gcd(b, a);
		}
		
		if (b == 0) {
			return a;
		}
		if (b == 1) {
			return 1;
		}
		return gcd(b, a-b);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,a,b;
		while(input.hasNextInt()){
			n = input.nextInt();
			a = input.nextInt();
			input.nextLine();
			while (n-->0) {
				b = input.nextInt();
				if (b <= a) {
					a +=b;
				}else {
					a += gcd(a, b);
				}
			}
			System.out.println(a);
			input.nextLine();
		}
	}
}
