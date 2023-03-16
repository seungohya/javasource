package network;

import java.net.URL;

/*
 * URL (Uniform Resource Locator)
 * 
 * https://meet.google.com/ogc-tnay-gws
 * 
 * 프로토콜 : https (자원에 접근하기 위해 서버와 통신하는 데 필요한 통신 규칙)
 * 호스트명 : www.naver.com ,meet.google.com (서버 이름)
 * 경로명 : /ogc-tnay-gws  /chat 접근하려는 자원이 저장된 서버상의 위치
 * 파일명 : 마지막에 오는 것
 * 쿼리 : URL 에서 ? 이후에 부분 (쿼리가 없을 수도 있다.)
 */
public class UrlEx1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://my.a-bly.com/login?redirect=%2F");
			System.out.println("url.getAuthority():" + url.getAuthority());
			System.out.println("url.getContent():" + url.getContent());
			System.out.println("url.getDefaultPort():" + url.getDefaultPort());
			System.out.println("url.getPort():" + url.getPort());
			System.out.println("url.getFile():" + url.getFile());
			System.out.println("url.getHost():" + url.getHost());
			System.out.println("url.getPath():" + url.getPath());
			System.out.println("url.getProtocol():" + url.getProtocol());
			System.out.println("url.getQuery():" + url.getQuery());
			System.out.println("url.getUserInfo():" + url.getUserInfo());
			//toExternalFrom(): URL 을 문자열로 변환
			System.out.println("url.toExternalForm():" + url.toExternalForm());
			//toURI () : URL ==> URI
			System.out.println("url.toURI():" + url.toURI());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
