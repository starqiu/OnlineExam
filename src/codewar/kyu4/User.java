/*
 * ============================================================
 * The SSE USTC Software License
 * 
 * User.java
 * 2016年2月15日
 * 
 * Copyright (c) 2006 China Payment and Remittance Service Co.,Ltd        
 * All rights reserved.
 * ============================================================
 */
package codewar.kyu4;

/**
 * 实现功能： 
 * <p>
 * date	        author            email		           notes<br />
 * ----------------------------------------------------------------<br />
 *2016年2月15日        邱星         starqiu@mail.ustc.edu.cn	    新建类<br /></p>
 *
 */
public class User {
	private int rank = -8;
	private int progress = 0;
	private int[] ranks = {-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8};
	public int rank(){
//		System.out.println("rank："+rank);
		return rank;
	}
	
	public int progress(){
//		System.out.println("progress："+progress);
		return progress;
	}
	public int getRankIndex(int rank){
		return rank<0?rank+8:rank+7;
	}
	public int incProgress( int rank) {
		if (rank == 0 || rank<-8 || rank >8) {
			throw new RuntimeException("Unsupported rank value!");
		}

		int userRankIndex = getRankIndex(this.rank);
		int activityRankIndex = getRankIndex(rank);
		
		if (activityRankIndex == userRankIndex) {
			progress +=3;
		}else if(activityRankIndex == userRankIndex-1){
			progress +=1;
		}else if(activityRankIndex > userRankIndex){
			int diff = activityRankIndex - userRankIndex;
			progress +=10*diff*diff;
		}
		userRankIndex += progress/100;
		userRankIndex = userRankIndex>15?15:userRankIndex;
		this.rank = ranks[userRankIndex];
		progress = this.rank != 8?progress%100:0;
//		System.out.println("rank："+this.rank+" progress："+progress);
		return progress;
	}
	
	public static void main(String[] args) throws Exception{
		User user = new User();
		user.rank(); // => -8
		user.progress(); // => 0
		user.incProgress(-7);
		user.progress(); // => 10
		user.incProgress(-5); // will add 90 progress
		user.progress(); // => 0 // progress is now zero
		user.rank(); // => -7 // rank was upgraded to -7
	}
}

