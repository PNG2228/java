package com.pg;

public class SumOfSquares {
	public long calcSumOfSquares(int n) {
		return calculateSumOfSquares(n);
	}

	public long calculateSumOfSquares(int n) {
		if(n<0) {
			return-1;
		}
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}

}
