package com.bs.example.practice5.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] lotto;
	public Lotto() {
		// TODO Auto-generated constructor stub
	}
	
	{ // 초기화 블럭
		Random random = new Random();
		lotto = new int[6];
		for(int i=0; i<6 ; i++) {
			lotto[i]=random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					lotto[i]=random.nextInt(45)+1;
					j=0;
				}
			}
		}
	}
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public void informaion() {
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
}
