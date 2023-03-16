package inheritance;

public class CheckingAccount extends Account {

	private String cardNo;// 체크카드 번호

	// 은행계좌 + 체크카드
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;

	}
	// 체크카드 사용액을 지불한다.
	// 메소드 >> 카드번호,사용액을 매개변수로 받아서 은행잔고보다 작은경우 사용액을 지불하는 형태
	// 카드번호 일치 확인

	// 은행잔고보다 크거나 카드번호가 일치하지 않으면 지불불가 라는 메세지 출력

	// pay (cardNo, amount):잔액리턴
	int pay(String cardNo, int amount) {
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			System.out.println("카드번호나 잔액을 확인해 주세요.");
			return 0;
		}
		//잔액 = 잔액 - 사용액
//		setBalance(getBalance()-amount);
//		return getBalance();
		return withdraw(amount);
	}

}
