package thread;

public class Thread예제 {

	public static void main(String[] args) {
		System.out.println("Main thread starts..."); // 메인 스레드가 시작됨을 출력

		for (int i = 0; i < 5; i++) { // 0부터 4까지 5번 반복하는 for 루프
			System.out.println("Main thread is running: " + i); // 현재 메인 스레드가 실행 중인 것을 출력
			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Main thread ends."); // 메인 스레드가 종료됨을 출력
	}
}
