package network;

/*
 * 네트워킹
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구성하는 것
 * 
 * 네트워크 어플리케이션 프로그램 작성 시 java.net 패키지를 사용함
 * 
 * 서버와 클라이언트
 * 서버 : 서비스를 제공하는 컴퓨터 (메일서버, 파일서버, 어플리케이션 서버..)
 * 클라이언트 : 서비스를 사용하는 컴퓨터 
 * 
 * IP 주소 : 
 */
import java.net.*;
import java.util.Arrays;

public class InetAddressEx1 {

	public static void main(String[] args) {
		
		
		try {
			InetAddress address = InetAddress.getByName("naver.com");
			System.out.println("Host Name: " + address.getHostName());
			System.out.println("Host Address: " + address.getHostAddress());
			System.out.println("IP Address (in byte array): ");
			System.out.println("toString (): " + address.toString());
			byte[] ipAddress = address.getAddress();

			System.out.println("getAddress (): " + Arrays.toString(ipAddress));
			String result = "";
			for (int i = 0; i < ipAddress.length; i++) {
				result += (ipAddress[i] < 0 ? (ipAddress[i] + 256) : ipAddress[i]) + ".";
			}

			result = result.substring(0, result.length() - 1); // remove the last dot

			System.out.println("IP Address()+256: " + result);
			System.out.println();
			
		} catch (UnknownHostException e) {
			System.err.println("Could not find IP address for naver.com");
		}
	}
}
