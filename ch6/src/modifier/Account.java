package modifier;

public class Account {
	
	//속성 (인스턴스 변수)= private 으로 보통 사용한다.
	//외부에서는 속성에 직접적으로 접근 불가.
	//인스턴스 변수의 값을 얻어내거나 변경하고 싶다면 메소드로 처리한다.
	private String ano;

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	//getter / setter 메소드 활용
	

}
