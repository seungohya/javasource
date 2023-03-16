package ch7;

import org.graalvm.compiler.core.common.type.ArithmeticStamp;

/*컴파일 에러 : 컴파일 시에 발생하는 에러
 * 런타임 에러 : 실행 시에 발생하는 에러
 * 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는것.
 * 
 * 에러 (error) : 코드에 의해서 수습될 수 없는 심각한 오류
 * 예외 (exception): 코드에 의해서 수습될 수 있는 미약한 오류
 *Exception
 *1) exception : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 *2) RuntimeException : 프로그래머의 실수로 발생하는 예외
 *   - 배열 범위 벗어남, NullPointerException , ClassCastException..
 *   
 *   Exception 처리는 try~ catch 구문을 사용
 *   예외를 던지는 방법/Class.forName("");
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		// 참조형 초기화
		// null = 할당하지 않은 값
		String data = null;// String data = "Hello";
		Account account = null; // Account account = new Account ();

		int[] arr = null;// int [] arr = new int[15] ;

		// 참조변수의 값 출력
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);

		// 참조변수가 가리키고있는 곳을 접근시 java.lang.NullPointerException
		System.out.println(arr[0]);
		System.out.println(data.length());
//		

	}

}
