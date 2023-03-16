package thread;

public class BigLetters extends Thread {
	@Override
	public void run() {
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		super.run();
	}

}
