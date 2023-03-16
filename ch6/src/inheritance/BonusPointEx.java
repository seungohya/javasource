package inheritance;

public class BonusPointEx {

	public static void main(String[] args) {
		BonusPointAccount point = new BonusPointAccount("111-111", "홍길동", 0,0);
		
		int amount = 100000;
		point.deposit(amount);
		
		System.out.println("예금액: "+ amount);
		System.out.println("보너스포인트 :_"+point.getBonusPoint());

	}

}
