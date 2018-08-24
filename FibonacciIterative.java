public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){

		int total = 0;

		for(int i = 0; i <= n; i++){
			total += i;
		}
		return total;
	}

}


