public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) { // 피보나치 수열 출력
			System.out.println(fibonacci(i) + " ");
		}
	}

	// 피보나치 수열의 결과를 구하는 메서드...
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}

