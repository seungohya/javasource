package lang;
/*java.lang 패키지는 import 구문 없이 사용 가능.
 * Object 는 모든 클래스의 부모
 * 
 */

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		if (obj1.equals(obj2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		System.out.println(obj1 == obj2 ? "같음" : "다름");
		
		//Object 의 toString ()메소드
		System.out.println("obj1 toString"+obj1.toString ());//toStringjava.lang.Object@4926097b 패키지 , 클래스 , 주소
		System.out.println("obj2 toString"+obj2.toString ());//obj2 toStringjava.lang.Object@762efe5d

		//Value 부모  : Object 클래스
		//부모 메소드 + Value 객체 메소드 사용 가능
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.equals(v2) ? "v1==v2같음" : "v1!=v2다름");
		System.out.println("v1 toString"+v1.toString ());
	}

}
