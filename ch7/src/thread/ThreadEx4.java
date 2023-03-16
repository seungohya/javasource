package thread;

public class ThreadEx4 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        // "-" 출력 스레드 생성
        Thread hyphenThread = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                System.out.printf("%s", new String("-"));
            }
        });
        
        // "|" 출력 스레드 생성
        Thread pipeThread = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                System.out.printf("%s", new String("|"));
            }
        });
        
        // 스레드 실행
        hyphenThread.start();
        pipeThread.start();
        
        // 스레드 종료 대기
        try {
            hyphenThread.join();
            pipeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();

        System.out.println("소요시간 " + (end - start));
    }
}