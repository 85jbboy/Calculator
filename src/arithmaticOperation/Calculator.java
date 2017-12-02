package arithmaticOperation;

import java.util.Scanner;

public class Calculator {
	
	public int calculate(int[] num, String[] operator) {
		int result = num[0];
	
		for(int i = 1; i < num.length; i++) {
			if (operator[i*2-1].equals("+")) {
				result += num[i];
			} else if (operator[i*2-1].equals("-")) {
				result -= num[i];
			} else if (operator[i*2-1].equals("*")) {
				result *= num[i];
			} else if (operator[i*2-1].equals("/")) {
				result /= num[i];
			}
		}
		return result;
	}
}
