package shop;

public class CellPhone extends Product {
	String carrier; // 통신사 정보
	public CellPhone(String name, int price,String carrier) {
		super(name, price);
		this.carrier= carrier;
	}


	
	
	
	// CellPhone 가격 이름, 출력
	

	// 통신사 정보 출력
	@Override
	public void printExtra (){
		System.out.println("통신사 정보 : " + carrier);
	}

}
