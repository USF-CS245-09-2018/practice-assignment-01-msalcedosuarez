public class FactorialIterative {

	public static int factorial(int n) {

		int result;

		if(n == 0) {
			return 1;
		}
		result = n * factorial(n - 1);	
		return result;
	}
}