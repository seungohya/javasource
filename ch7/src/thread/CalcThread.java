package thread;

public class CalcThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                System.out.print("-");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                System.out.print("|");
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY); // t1의 우선순위를 가장 낮은 수인 1로 설정
        t2.setPriority(Thread.MAX_PRIORITY); // t2의 우선순위를 가장 높은 수인 10으로 설정

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
