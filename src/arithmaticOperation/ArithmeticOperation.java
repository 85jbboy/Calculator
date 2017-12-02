package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
	static int tmpResult = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력: ");
		tmpResult = scanner.nextInt();

		
		while (true) {
			System.out.print("사칙연산 기호: ");
			String operator = scanner.next();

			if (operator.equals("quit")) {
				System.out.println("최종 결과값: " + tmpResult);
				return;
			}
			
			System.out.print("두 번째 값 입력: ");
			int nextNum= scanner.nextInt();

			if (operator.equals("+")) {
				tmpResult += nextNum;
				System.out.println("현재값: " + tmpResult);
			} else if (operator.equals("-")) {
				tmpResult -= nextNum;
				System.out.println("현재값: " + tmpResult);
			} else if (operator.equals("*")) {
				tmpResult *= nextNum;
				System.out.println("현재값: " + tmpResult);
			} else if (operator.equals("/")) {
				tmpResult /= nextNum;
				System.out.println("현재값: " + tmpResult);
			} else 
				System.out.println("사칙연산 기호가 아닙니다.");
		}
	}
}
