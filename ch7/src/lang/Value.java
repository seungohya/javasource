package lang;

/**
 * @author Lenovo
 *
 */
public class Value {
	int Value;

	public Value(int value) {
		super();
		Value = value;
	}

	// Object 가 equals() 를 주소 비교로 넘겨줘서 값비교로 바꿔주고 싶어서 재정의를 하려고 Override 를 한다
	@Override
	public boolean equals(Object obj) {
		//instanceof 특정 객체의 인스턴스인지 확인
		//obj 가 Value 객체의 인스턴스인가?
		if (obj instanceof Value) {
			Value v = (Value) obj;
			if (this.Value == v.Value) {
				return true;

			}
		}
		return false;
	}
	//toString() : Object 는 패키지명, 클래스명, @hasCode 값
	//자손 toString : 인스턴스에 대한 정보를(멤버변수에 할당된 값)` 문자열로 제공하는 목적으로 사용.

	@Override
	public String toString() {
		return "Value [Value=" + Value + "]";
	}
}
