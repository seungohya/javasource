package inheritance;

public class CreditLineAccount extends Account {
	// 은행 + 마이너스 한도
	private int creditLine;

	public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
		super(ano, owner, balance);
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) {
		// (잔액+마이너스한도)<사용액:잔액이 부족합니다
		if ((getBalance()+creditLine)<amount) {
			System.out.println("잔액이 부족합니다.");
			return amount;
		}
		setBalance(getBalance()+creditLine-amount);
		return amount;	
		//잔액= (잔액+마이너스한도)-사용액 
		//return 사용액;
	}

}
