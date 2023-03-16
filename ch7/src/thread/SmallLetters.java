package thread;

public class SmallLetters extends Thread {
	@Override
	public void run() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		super.run();
	}

}
