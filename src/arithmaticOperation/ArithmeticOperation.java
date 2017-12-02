package arithmaticOperation;

import java.util.Scanner;

public class ArithmeticOperation {

	public int[] getNum() {
		System.out.print("계산할 수 2개를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String sInput = sc.nextLine();
		String[] str_num = sInput.split(" ");
		int[] num = new int[str_num.length];
		
		for (int i = 0; i < str_num.length; i++) {
			num[i] = Integer.parseInt(str_num[i]);
		}
		return num;
	}
	
	public void calPlus(int[] calNum) {
		int sum = 0;
		for(int i = 0; i < calNum.length; i++) {
			sum += calNum[i];
		}
		System.out.println(sum);
	}
	public void calMinus(int[] calNum) {
		int minus = calNum[0];
		for(int i = 1; i < calNum.length; i++) {
			minus -= calNum[i];
		}
		System.out.println(minus);
	}
	public void calTimes(int[] calNum) {
		int times = calNum[0];
		for(int i = 1; i < calNum.length; i++) {
			times *= calNum[i];
		}
		System.out.println(times);		
	}
	public void calDiv(int[] calNum) {
		int div = calNum[0];
		for(int i = 1; i < calNum.length; i++) {
			div /= calNum[i];
		}
		System.out.println(div);
	}
	
	public void showResult() {
		
	}
	
	public static void main(String[] args) {
		ArithmeticOperation arith = new ArithmeticOperation();
		int[] calNum = arith.getNum();
		
		arith.calPlus(calNum);
		arith.calMinus(calNum);
		arith.calTimes(calNum);
		arith.calDiv(calNum);
	}
}
