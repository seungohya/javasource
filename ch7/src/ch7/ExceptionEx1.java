package ch7;

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
 *   예외 던지기 = main 메소드를 호출하는 곳에서 처리
 */
public class ExceptionEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
//		// 컴파일러 체크 exception
//		try {
//			// 예외가 발생할 수 있는 구문이 들어오면 된다.
//			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			// 예외가 발생하였을 때 처리하기 위한 구문
//			e.printStackTrace();
//		}
		Class.forName("");

	}

}
