public class Power {
	public static void main(String[] args) {

		// 아래 코드는 `Math.pow(2,5);` 와 동일한 값을 갖는다.

		System.out.println(power(2, 5)); // 15
	}
	public static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * power(base, exponent - 1);
		}
	}
}
