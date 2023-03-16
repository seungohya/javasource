package io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputEx2 {
    public static void main(String[] args) {
        // 복사할 동영상 파일 경로와 이름을 설정합니다.
        Path sourceFile = Paths.get("C:\\Users\\Lenovo\\Desktop\\KakaoTalk_20220929_110511014.mp4");
        // 복사된 동영상 파일 경로와 이름을 설정합니다.
        Path targetFile = Paths.get("C:\\Users\\Lenovo\\Desktop\\target.mp4");

        try {
            // 시작 시간을 기록합니다.
            long startTime = System.currentTimeMillis();

            // Files.copy() 메소드를 이용하여 파일을 복사합니다.
            Files.copy(sourceFile, targetFile);

            // 종료 시간을 기록합니다.
            long endTime = System.currentTimeMillis();

            // 걸린 시간을 계산합니다.
            long elapsedTime = endTime - startTime;

            // 걸린 시간을 출력합니다.
            System.out.println("동영상을 복사하는 데 걸린 시간: " + elapsedTime + "ms");
        } catch (IOException e) {
            System.out.println("동영상 복사에 실패했습니다.");
        }
    }
}
