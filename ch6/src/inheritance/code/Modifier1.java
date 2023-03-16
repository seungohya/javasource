package inheritance.code;

import modifier.Account;

public class Modifier1 {
	 Account acc = new Account (); // The type modifier.Account is not visible(public 이 생략되면)

	private void print() {
//		System.out.println(acc);
		System.out.println();
//		// Account 가 가지고 있는 ano 를 접근하고 싶다면?
		String ano = acc.getAno();
		System.out.println("ano: " + ano);
//
		acc.setAno("111-22");
		System.out.println("ano: " + acc.getAno());
	}

	public static void main(String[] args) {
		// static 메소드에서 non-static 메소드 호출하기.
		//1. 같은 static 만들기
		//2. 객체 생성 후 접근하기.
		
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
	}

}
