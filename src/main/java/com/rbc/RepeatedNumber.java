package com.rbc;

public class RepeatedNumber {
	public int whatsRepeated(int[] input) {
		int numSum = (input.length*(input.length-1))/2;
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum - numSum;
	} 
	
}

