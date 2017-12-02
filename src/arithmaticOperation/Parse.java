package arithmaticOperation;

public class Parse {
	public static int[] parsing(String[] str_calc) {
		int[] num = new int[str_calc.length/2 + 1];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(str_calc[i*2]);
		}		
		return num;
	}
}