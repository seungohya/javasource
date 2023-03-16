package ch7;

import java.util.Scanner;

/*Exception 클래스를 상속받아서 NotExistIdException, WrongPasswordException 작성
 * 
 * 
 */
public class LoginEx {

	public static void main(String[] args) {
		// 사용자로부터 아이디와 비밀번호를 입력받아 login 메소드 호출하기
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
		try {
			
			longin(id, pwd);
		} catch (NotExistIdException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void longin(String id, String pwd) throws NotExistIdException, WrongPasswordException {
		// id 가 blue 와 일치하지 않는다면 NotExistIdException 발생
		if (!id.equals("blue")) {
			throw new NotExistIdException("아이디가 일치하지 않습니다.");
		}
		// pwd 가 1234 와 일치하지 않는다면 WrongPasswordException 발생
		if (!pwd.equals("1234")) {
			throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
		}
	}


	}


