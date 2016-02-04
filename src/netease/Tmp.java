/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Tmp.java
 * 2015年10月9日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package netease;

import java.util.Scanner;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2015年10月9日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class Tmp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hp1, hp2, a1, a2, t;
		String s1, s2;
		String yes = "YES", no = "NO";
		// while(input.hasNextInt()){
		hp1 = input.nextInt();
		hp2 = input.nextInt();
		a1 = input.nextInt();
		a2 = input.nextInt();
		t = input.nextInt();
		input.nextLine();
		boolean blind = false;
		while (t-- > 0) {
			s1 = input.next();
			s2 = input.next();
			input.nextLine();
			if ("A".equals(s1) && "A".equals(s2)) {
				if (!blind) {
					hp1 -= a2;
				}
				hp2 -= a1;
				blind = false;
			}else if ("A".equals(s1) && "B".equals(s2)) {
				if (blind) {
					blind = false;
				}
			}else if ("B".equals(s1) && "A".equals(s2)) {
				blind =true;
			}else {
				if (blind) {
					blind = false;
				}
			}
			System.out.printf("%d %d\n",hp1,hp2);
			if (hp1 <= 0) {
				System.out.println(yes);
				return;
			}
			if (hp2 <= 0) {
				System.out.println(no);
				return;
			}

		}
		if (hp2 >= hp1) {
			System.out.println(yes);
		} else {
			System.out.println(no);
		}
		// input.nextLine();
		// }
	}
}

