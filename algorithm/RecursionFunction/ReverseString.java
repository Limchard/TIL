public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("hello")); // "olleh"
	}
	public static String reverseString(String str){
		if (str.length()==0){
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	// 재귀함수 자체가 호출 스택이다. 즉, 스택 구조로 자료가 쌓인다.
	// 여기서도 뽑아낸 글자가 스택처럼 쌓인다. 결과적으로 마지막에 출력할때에 스택 구조로 인해서 글자가 거꾸로 생성된다.

}
