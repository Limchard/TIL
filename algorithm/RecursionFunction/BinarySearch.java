public class BinarySearch {

	static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid; // 타겟을 찾았을 때 해당 인덱스 반환
			}

			if (arr[mid] < target) {
				left = mid + 1; // 중간값보다 타겟이 크면, 왼쪽 범위를 제외
			} else {
				right = mid - 1; // 중간값보다 타겟이 작으면, 오른쪽 범위를 제외
			}
		}

		return -1; // 타겟이 배열에 없을 경우 -1 반환
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int target = 11;

		int result = binarySearch(arr, target);

		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found in the array.");
		}
	}
}
