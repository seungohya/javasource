package shop;

public class ShopMain {

	public static void main(String[] args) {
		Ishop shop = new MyShop();
		
		//shop 이름지정
		shop.setTitle("MyShop");
		//user 생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		//shop 시작
		shop.start();

	}

}
