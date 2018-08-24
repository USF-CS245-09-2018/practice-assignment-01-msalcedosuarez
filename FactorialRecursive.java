public class FactorialRecursive {

	public static int factorial(int n){

		int total = 1;
		for(int i = n; i > 0; i--){
			total *= i;
		}
		return total;
	}

}