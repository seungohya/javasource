package network;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip주소 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP 주소: " + ip.getHostAddress());
            System.out.println(ip.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("IP 주소를 가져올 수 없습니다.");
        }
        try {
        	//하나의 도메인에 여러개의 아이피 주소가 매핑 될시 모든 ip 주소 가져오기
        	InetAddress ipArr[]= InetAddress.getAllByName("www.naver.com");
        	for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] : "+ ipArr[i]);
			}
        			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
