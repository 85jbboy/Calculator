package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
	static int tmpResult = 0;
	
	static int getValue(Scanner scanner) {
		System.out.print("피연산자를 입력하세요: ");
		int num = scanner.nextInt();
		return num;
	}
	
	static String getOperator(Scanner scanner) {
		System.out.print("사칙연산자 입력(끝내려면 q를 입력하세요): ");
		String operator = scanner.next();
		return operator;
	}
	
	static int calculate(String operator, int tmpResult, int nextNum) {
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
	
	static void print(int tmpResult) {
		System.out.println("현재값: " + tmpResult);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		tmpResult = getValue(sc);
		while(true) {
			String operator = getOperator(sc);
			if (operator.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			int nextNum = getValue(sc);
			tmpResult = calculate(operator, tmpResult, nextNum);
			print(tmpResult);
		}
		sc.close();
	}
}