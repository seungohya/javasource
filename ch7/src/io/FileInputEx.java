package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		// Scanner 객체를 생성합니다.
		Scanner scanner = new Scanner(System.in);
		// 저장할 파일 이름을 설정합니다.
		String fileName = "data.txt";

		try {
			// FileWriter 객체를 생성합니다.
			// 첫 번째 매개변수는 파일 객체이며, 두 번째 매개변수는 파일에 추가할지 덮어쓸지를 결정합니다.
			FileWriter fileWriter = new FileWriter(new File(fileName), true);

			// 무한 반복문을 실행합니다.
			while (true) {
				// 사용자로부터 데이터를 입력받습니다.
				System.out.print("데이터를 입력하세요 (종료하려면 'q'를 입력하세요): ");
				String data = scanner.nextLine();

				// 입력받은 데이터가 "q"와 같은 문자열이면 while문을 탈출합니다.
				if (data.equalsIgnoreCase("q")) {
					break;
				}

				// 파일에 데이터를 저장합니다.
				fileWriter.write(data + "\n");
			}

			// 파일을 닫습니다.
			fileWriter.close();
			// 파일 저장이 완료되었다는 메시지를 출력합니다.
			System.out.println(fileName + " 파일에 데이터를 저장했습니다.");
		} catch (IOException e) {
			// 예외가 발생하면 파일 저장이 실패했다는 메시지를 출력합니다.
			System.out.println(fileName + " 파일에 데이터 저장에 실패했습니다.");
		}

		// Scanner를 닫습니다.
		scanner.close();
	}
}
