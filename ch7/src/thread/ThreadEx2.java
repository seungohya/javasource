package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread thread = new BigLetters();
		SmallLetters letters = new SmallLetters();
		Thread ex = new Thread(new NumPrint());
		
		thread.start();
		letters.start();
		ex.start();

	}

}
