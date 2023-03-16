package thread;
public class Thread예제2 {
    public static void main(String[] args) {
        System.out.println("Main thread starts..."); // 메인 스레드가 시작됨을 출력

        Thread thread1 = new Thread(() -> { // 스레드 1 생성
            for (int i = 0; i < 5; i++) { // 0부터 4까지 5번 반복하는 for 루프
                System.out.println("Thread 1 is running: " + i); // 현재 스레드 1이 실행 중인 것을 출력
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> { // 스레드 2 생성
            for (int i = 0; i < 5; i++) { // 0부터 4까지 5번 반복하는 for 루프
                System.out.println("Thread 2 is running: " + i); // 현재 스레드 2가 실행 중인 것을 출력
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start(); // 스레드 1 실행
        thread2.start(); // 스레드 2 실행

        try {
        	thread1.join(); // 스레드 1이 종료될 때까지 대기
        	thread2.join(); // 스레드 2가 종료될 때까지 대기
        	} catch (InterruptedException e) {
        	e.printStackTrace();
        	}

        System.out.println("Main thread ends..."); // 메인 스레드 종료를 출력
    }}
