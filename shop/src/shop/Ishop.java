package shop;
//인터페이스는 상수만 가질 수 있다.

//모든 메소드는 추상이다.
//public static abstract 자동으로 들어있다.

public interface Ishop {
	void setTitle(String title);

	void genUser();

	void genProduct();

	void checkOut();

	void start();
}
