/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * Guesser.java
 * 2016年2月2日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu5;

import java.lang.reflect.Field;


/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月2日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class Guesser {
	private static  String guessed = "very well";
	public void guess(){
		Class<LittleClass> gClass = LittleClass.class;
//		Method[] methods = gClass.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		LittleClass.isMySecret("has");
		Field[] fields = gClass.getDeclaredFields();
		try {
			fields[0].setAccessible(true);
			System.out.println(fields[0].get(null));
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		}
//		for (Field field : fields) {
//			System.out.println(field);
//			field.setAccessible(true);
//			try {
//				System.out.println(field.getName() + " " + field.get(null));
//			} catch (IllegalArgumentException e) {
//			} catch (IllegalAccessException e) {
//			}
//		}
//		Constructor[] constructors = gClass.getConstructors();
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
		
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args)  {
		new Guesser().guess();
		
	}

}

