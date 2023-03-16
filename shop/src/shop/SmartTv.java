package shop;

public class SmartTv extends Product {
	String resolution;// 해상도
	public SmartTv(String name, int price,String resolution) {
		super(name, price);
		this.resolution = resolution;
		
	}



	

	

	// 해상도 정보출력
	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : " + resolution);
	}
}
