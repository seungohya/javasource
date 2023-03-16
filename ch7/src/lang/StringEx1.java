package lang;
/* String 클래스
 * - 변경이 불가능한 (immutable) 클래스
 * - equals () : 값비교
 * - equalsIgnoreCase() : 대소문자 구별하지 않고 값비교
 */

public class StringEx1 {

	public static void main(String[] args) {
		//String 클래스 동작 구형
		//문자열을 다루는 일이 많기 때문에 new 를 사용하지 않아도 인스턴스를 생성할 수 있도록 되어 있음.
		//문자열 만들기 1) 문자열 리터럴 지정 2) new 사용하는 방식
		String str= new String("안녕하세요");
		String str2 = "Hello"; // 1) 문자열 리터럴 지정 : 문자열 재사용 함
		String str4 = "Hello";
		String str3 = "안녕하세요";
		
//		str2=str+str2;
		System.out.println(str2.equals(str));
		System.out.println(str==str3);// == 값의 비교가 아니라 주소비교이기에 false 가 나오므로 String 에 값을 비교하고 싶다면 equals() 를 사용
		System.out.println(str2==str4);

	}

}
