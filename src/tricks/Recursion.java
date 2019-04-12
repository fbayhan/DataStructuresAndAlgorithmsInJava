package tricks;

public class Recursion {

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
	}

	public int factorial(int n) {
		if (n != 0)
			return n * factorial(n - 1); // recursive call
		else
			return 1;
	}
}
