public class java_1_7 {
	public static void main(String[] args) {
		double one = 1;
		// double pi = 4;
		// have to use 1.0 in numerator rather than 1
		for (int i = 3; i < 15; i+=2) {
			if (i == 3) {
				one = one - (1.0 / i);
			}
			else if (i == 7) {
				one = one - (1.0 / i);
			}
			else if (i == 11) {
				one = one - (1.0 / i);
			}
			else {
				one = one + (1.0 / i);
			}
		}
	System.out.println(4 * one);
	}

}

