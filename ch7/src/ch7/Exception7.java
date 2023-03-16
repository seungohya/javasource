package ch7;

public class Exception7 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			deleteTemFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");

		}
		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}

	}

	static boolean enoughSpace() {
		return false;

	}

	static boolean enoughMemory() {
		return true;
	}

	static void copyFiles() {
	}

	static void deleteTemFiles() {
	}
}
