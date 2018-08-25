

public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {

		if(n==0 || n==1){
			return n;
		}

		int num1 = 1;
		int num2 = 1;

		for(int i = 2; i <n; i++) {
			int temp = num1;
			num1 = num1 + num2;
			num2 = temp;
		}
		return num1;
	}

}


