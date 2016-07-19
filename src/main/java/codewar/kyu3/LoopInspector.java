/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * LoopInspector.java
 * 2016年2月15日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu3;

/**
 * 实现功能： Can you get the loop ?
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月15日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class LoopInspector {
	  public int loopSize(Node node) {
		  int l=0;
		  // one step and two steps,get same node
		  Node oneStep = node.getNext();
		  Node twoSteps = node.getNext().getNext();
		  while (oneStep != twoSteps) {
			  oneStep = oneStep.getNext();
			  twoSteps = twoSteps.getNext().getNext();
		  }
		  //two steps stop ,one step go on
		  oneStep = oneStep.getNext();
		  l++;
		  while (oneStep != twoSteps) {
			  oneStep = oneStep.getNext();
			  l++;
		  }
		  
		  return l;
	  }
}

