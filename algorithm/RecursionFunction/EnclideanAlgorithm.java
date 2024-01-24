public class EnclideanAlgorithm {

	public static void main(String[] args) {
		int m = 78696;
		int n = 19332;

		System.out.println(gcd(m, n));
	}

	public static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return gcd(n, m % n);
		}
	}

}
