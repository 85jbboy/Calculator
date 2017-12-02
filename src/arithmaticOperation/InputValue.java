package arithmaticOperation;

import java.util.Scanner;

public class InputValue {
	public String[] getString(Scanner scanner) {
		System.out.print("계산할 내용을 입력하세요: ");
		String str = scanner.nextLine();
		// 3 + 5 - 2 * 6 / 2
		String[] calculation = str.split("\\s");
		return calculation;
		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);	
//		}
//		
		
	}
}