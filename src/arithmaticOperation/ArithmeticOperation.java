package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {
	public static int tmpResult = 0;

	public static void main(String[] args) {
		InputValue input = new InputValue();
		OutputValue output = new OutputValue();
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		String[] str_calc = input.getString(sc);		
		int[] num = Parse.parsing(str_calc);
		int result = calc.calculate(num, str_calc);
		output.print(result);
	}
}