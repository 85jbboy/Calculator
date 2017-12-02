package arithmaticOperation;

import java.util.Scanner;

public class InputValue {
	
	public int getValue(Scanner scanner) {
		System.out.print("피연산자를 입력하세요: ");
		int num = scanner.nextInt();
		return num;
	}
	
	public String getOperator(Scanner scanner) {
		System.out.print("사칙연산자 입력(끝내려면 q를 입력하세요): ");
		String operator = scanner.next();
		return operator;
	}
}
