package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
	static int tmpResult = 0;
	
	static int getFirstValue(Scanner scanner) {
		System.out.print("첫번째 값 입력: ");
		tmpResult = scanner.nextInt();
		return tmpResult;
	}
	
	static int getNextValue(Scanner scanner) {
		System.out.print("다음 값 입력: ");
		int nextNum= scanner.nextInt();
		return nextNum;
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
		tmpResult = getFirstValue(sc);
		
		while(true) {
			String operator = getOperator(sc);
			if (operator.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			int nextNum = getNextValue(sc);
			tmpResult = calculate(operator, tmpResult, nextNum);
			print(tmpResult);
		}
		sc.close();
	}
}