public class FactorialRecursive implements Factorial {

	public int factorial(int n) {

		int total = 1;
		
		for(int i = n; i > 0; i--) {
			total = total * i;
		}
		return total;
	}

}