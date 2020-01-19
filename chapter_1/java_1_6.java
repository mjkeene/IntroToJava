public class java_1_6 {
	// int result = 0;
	// this gives an error since it's a non-static variable
	// declare result var inside of main method
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i < 10; i++) {
		result += i;
		}
	System.out.println(result);
	}
}
