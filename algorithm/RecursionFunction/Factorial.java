import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(5);
	}
	public static int factorial(int n){
		if (n==0){ // 기본 케이스
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	// return 에 대한 설명 :
	// factorial(5) = 5 * factorial(4)
	// factorial(4) = 4 * factorial(3)
	// factorial(3) = 3 * factorial(2)
	// factorial(2) = 2 * factorial(1)
	// factorial(1) = 1 * factorial(0)
	// factorial(0) = 1
	// 따라서 결과값 : factorial(5)는 5 * 4 * 3 * 2 * 1 * 1 = 120

}
