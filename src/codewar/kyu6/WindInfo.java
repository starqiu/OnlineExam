/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * WindInfo.java
 * 2016年1月28日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu6;

/**
 * 实现功能：
 * <p>
 * date author email notes<br />
 * ----------------------------------------------------------------<br />
 * 2016年1月28日 邱星 starqiu@mail.ustc.edu.cn 新建类<br />
 * </p>
 *
 */
public class WindInfo {
	public static String message(String rwy, int windDirection, int windSpeed) {
		int angle = Integer.parseInt(rwy.substring(0, 2));
		angle = windDirection - angle*10;
		double angleRadians = Math.PI*angle/180;
		
		int cw = (int) Math.round(Math.sin(angleRadians)*windSpeed);
		int hw = (int) Math.round(Math.cos(angleRadians)*windSpeed);
		
		return String.format("%swind %d knots. Crosswind %d knots from your %s.", 
						hw>=0?"Head":"Tail",
						Math.abs(hw),Math.abs(cw),
						cw>=0?"right":"left");
	}
	
	public static void main(String[] args) {
		System.out.println(Math.sin(Math.PI*10/180)*15);
	}
}
