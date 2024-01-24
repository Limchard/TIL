import java.util.Scanner;

public class BinarySearch_BackUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int key = 11;
		int low = 0;
		int high = arr[arr.length - 1];

		System.out.println(binarySearch(arr, low, high, key));

		// System.out.println(Arrays.toString(arr));
	}

	public static int binarySearch(int[] arr, int low, int high, int key) {
		// 1. 높은 인덱스가 낮은 인덱스보다 작을 경우 배열에서 키를 찾지 못했음을 나타내기 위해 -1을 리턴합니다.
		if (high >= low) {

			int mid = low + (high - low) / 2; // 2 중간값 구하기.
			// 3. 배열의 소요 값이 찾는 값과 동일하면 중간 값을 반환합니다.
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) { // 4. 키 값이 중간값보다 큰 경우 : 중간 인덱스에 1을 더하고 높은 인덱스와 함께 함수를 재귀적으로 호출합니다.
				return binarySearch(arr, mid + 1, high, key);
			} else { // 5. 키보다 중간값이 작은 경우 : 낮은 인덱스와 중간 인덱스에서 1을 뺀 값을 가지고 함수를 재귀적으로 호출합니다.
				return binarySearch(arr, mid - 1, low, key);
			}
		} else {
			return -1;
		}

		// // 1. 높은 인덱스가 낮은 인덱스보다 작을 경우 배열에서 키를 찾지 못했음을 나타내기 위해 -1을 리턴합니다.
		// if (high < low) {
		// 	return -1;
		// }
		// int mid = low + (high - low) / 2; // 2 중간값 구하기.
		// // 3. 배열의 소요 값이 찾는 값과 동일하면 중간 값을 반환합니다.
		// if (key == arr[mid]) {
		// 	return mid;
		// } else if (key > arr[mid]) { // 4. 키 값이 중간값보다 큰 경우 : 중간 인덱스에 1을 더하고 높은 인덱스와 함께 함수를 재귀적으로 호출합니다.
		// 	return binarySearch(arr, mid + 1, high, key);
		// } else { // 5. 키보다 중간값이 작은 경우 : 낮은 인덱스와 중간 인덱스에서 1을 뺀 값을 가지고 함수를 재귀적으로 호출합니다.
		// 	return binarySearch(arr, mid - 1, low, key);
		// }
	}
}
