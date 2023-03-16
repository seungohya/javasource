package inheritance.code;

//import 문
//다른 패키지에 있는 클래스를 사용할 때 필요
import java.util.Date;
import java.util.Scanner;
import exam.Account;

// java.lang 패키지에 있는 클래스를 사용할때는 import 구문이 필요없음.
// 자주 사용하는 패키지이기 때문에 기본적으로 사용할 수 있도록 되어 있음.

//접근 제어자 (modifier) : 멤버 또는 클래스에 사용되어 해당하는 멤버 또는 
//                      클래스를 외부에서 접근하지 못하도록 제한
//접근 제어자가 사용되는 곳 - 클래스, 멤버변수, 메소드, 생성자.
//접근 범위 : public > protected > 생략 (default) > private 
// 1) public, protected, default, private

//private : 같은 클래스 내에서만 접근 가능.
//생략 default : 같은 패키지 내에서만 접근 가능.
//protected : 같은 패키지 내에서, 다른 패키지의 자손 클래스에서 접근이 가능.
//public : 접근 제한이 전혀 없음

//패키지가 다른 경우

//패키지가 같은 경우

//제어자
//static(공통적인) - 멤버변수, 메소드, 초기화블럭

//final - 클래스, 메소드, 멤버변수, 지역변수
public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account account = new Account(null, null, 0);

		Date date = new Date();

		String str = "Hello";
	}

}
