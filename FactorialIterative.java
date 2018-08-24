public class FactorialIterative {

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		n * factorial(n - 1);
	}

}