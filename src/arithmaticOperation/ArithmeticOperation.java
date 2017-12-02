package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
	public static int tmpResult = 0;

	public static void main(String[] args) {
		InputValue input = new InputValue();
		OutputValue output = new OutputValue();
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		tmpResult = input.getValue(sc);
		while(true) {
			String operator = input.getOperator(sc);
			if (operator.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			int nextNum = input.getValue(sc);
			tmpResult = calc.calculate(operator, tmpResult, nextNum);
			output.print(tmpResult);
		}
		sc.close();
	}
}