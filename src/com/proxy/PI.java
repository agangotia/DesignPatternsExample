package com.proxy;

import java.io.Serializable;
import java.math.BigDecimal;

public class PI implements Serializable {
	
	private final int digits;
	
	public PI(int digits){
		this.digits = digits;
	
	}
	
	public BigDecimal execute(){
		return computePI(digits);
	}
	
	public static BigDecimal computePI(int digits){
		
		
		BigDecimal pi = BigDecimal.valueOf((double)22/7);
		pi=pi.setScale(digits, BigDecimal.ROUND_UP);
		return pi.setScale(digits, BigDecimal.ROUND_HALF_UP);
	}
}
