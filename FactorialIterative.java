public class FactorialIterative implements Factorial{

	public int factorial(int n) {

		int result;

		if(n == 0) {
			return 1;
		}
		result = n * factorial(n - 1);	
		return result;
	}
}