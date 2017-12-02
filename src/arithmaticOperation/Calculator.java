package arithmaticOperation;

import java.util.Scanner;

public class Calculator {
	public int calculate(String operator, int tmpResult, int nextNum) {
		if (operator.equals("+")) {
			tmpResult += nextNum;			
		} else if (operator.equals("-")) {
			tmpResult -= nextNum;
		} else if (operator.equals("*")) {
			tmpResult *= nextNum;
		} else if (operator.equals("/")) {
			tmpResult /= nextNum;
		} else 
			System.out.println("사칙연산할 수 없습니다.");
		return tmpResult;
	}
}
