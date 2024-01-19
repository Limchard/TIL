import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class builder {
	public static void main(String[] args) throws UnsupportedEncodingException {

		String data="자바";

		// String -> byte 배열 (기본 : UTF-8 인코딩)
		byte[] arr1=data.getBytes(); // byte[] arr1=data.getBytes(arr1)):
		System.out.println("arr1: "+ Arrays.toString(arr1));

		// byte 배열 -> String (기본 : UTF-8 디코딩)
		String str1=new String(arr1); // String str1=new String(arr1, "UTF-8");
		System.out.println("str1: "+str1);

		// String -> byte 배열(EUC-KR 인코딩)
		byte[] arr2=data.getBytes("EUC-KR");
		System.out.println("arr2: "+Arrays.toString(arr2));

		// byte 배열 -> String(기본: UTF-8 디코딩)
		String str2=new String(arr2,"EUC-KR");
		System.out.println("str2: "+str2);


		String str=new StringBuilder()
			.append("DEF")
			.insert(0,"ABC")
			.delete(3,4)
			.toString();
		System.out.println(str);

		StringBuilder sb=new StringBuilder();
		sb.append("DEF");
		sb.insert(0,"ABC");
		sb.delete(3,4);
		sb.toString();
		System.out.println(sb);

	}
}
