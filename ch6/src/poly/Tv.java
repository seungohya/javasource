package poly;

//다향성 (polymorphism) : 여러가지 형태를 가질 수 있는 능력.
//                      상속일때만 가능

public class Tv {
	//속성(property)  ==> 멤버변수
	//크기, 길이, 높이, 색상, 볼륨, 채널.....
	String color; //색상
	int channel;  //채널
	boolean power;  //전원상태
	
	//기능(function) ==> 메서드
	//켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경....
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}






