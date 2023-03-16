package inheritance.code;

//접근제어자를 사용하는 이유==> 캡슐화
//외부로부터 데이터를 보호하기 위해서
//외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
public class Time {
	private int hour;
	public int min;
	public int second;

	// set 메소드 : 매개변수에 지정된 값을 검사하여 조건에 맞을때만 멤버변수의 값을 변경함

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	// get 메소드 : 멤버변수의 값을 읽는 메소드
	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 0 || min > 59)
			return;

		this.min = min;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;

		this.second = second;
	}

}
