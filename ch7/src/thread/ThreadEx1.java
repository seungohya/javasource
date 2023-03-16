package thread;

/*프로세스 : 실행중인 프로그램
 * 프로세스 안에는 최소한 하나 이상의 쓰레드가 존재 (둘 이상의 쓰레드를 가진 프로세스를 멀티 쓰레드 프로세스)
 * 
 * 멀티쓰레드 장점
 * -cpu 사용률을 향상시킨다.
 * -자원을 보다 효율적으로 사용할 수 있다.
 * -사용자에 대한 응답성이 향상됨
 * -작업이 분리되어 코드가 간결해진다.
 * 
 * 멀티 쓰레딩 고려할 부분
 * - 동기화
 * - 교착상태
 * 
 * 쓰레드 구현
 * Thread 클래스 상속
 * Runnable 인터페이스 구현
 * 
 */
public class ThreadEx1 {

	public static void main(String[] args) {
		//멀티쓰레드로 동작할 인스턴스를 생성
		SmallLetters letters = new SmallLetters();
		letters.start();
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}

	}

}
