public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){

		int total;

		for(int i = 0; i <= n; i++){
			total += i;
		}
		return total;
	}


}


