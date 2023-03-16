package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * URLConnection 클래스 : 어플리케이션과 URL 간의 통신 연결을 나타내는 클래스 
 */
public class UrlConnectionEx1 {

	public static void main(String[] args) {
		BufferedReader input = null;
		String line = "";
		try {
			URL url = new URL("https://www.google.com");
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while ((line = input.readLine()) != null) {
				System.out.println(line);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
		}

	}

}
