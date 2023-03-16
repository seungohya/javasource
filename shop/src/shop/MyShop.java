package shop;

import java.awt.print.PrinterGraphics;
import java.util.Arrays;
import java.util.Scanner;

public class MyShop implements Ishop {
	private String title;// 쇼핑몰 이름
	User[] users = new User[2];
	Product[] products = new Product[4];
	Product[] cart = new Product[10];
	private int selUser;

	Scanner sc = new Scanner(System.in);

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		// User 2명 생성 후 배열에 저장
		users[0] = new User("승오", PayType.CARD);
		users[1] = new User("다린", PayType.CASH);

	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("애플", 160, "skt");
		products[1] = new CellPhone("삼성", 130, "kt");
		products[2] = new SmartTv("삼성", 100, "1200");
		products[3] = new SmartTv("엘지", 90, "2000");

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("==========================");
		for (int i = 0; i < users.length; i++) {

			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] 종 료 ");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## " + sel + " 선택 ##");
		System.out.println();

		// 0,1 = > productList () 호출
		// 다른걸 입력 시 => 메뉴를 확인해주세요.
		switch (sel) {
		case "x":
		case "X":
			System.exit(0); // 프로그램 종료

			break;
		case "1":
		case "0":
			selUser = Integer.parseInt(sel);
			productList();
			break;

		default:
			System.out.println("메뉴를 확인해 주세요.\n");
			start();
			break;
		}

	}

	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==========================");
		for (int i = 0; i < products.length; i++) {

			System.out.printf("[%d]", i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인 화면 ");
		System.out.println("[c] 체크 아웃 ");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## " + sel + " 선택 ##");
		System.out.println();

		switch (sel) {
		case "c":
		case "C":
			checkOut();
			break;
		case "h":
		case "H":
			start();
			break;
		case "1":
		case "3":
		case "2":
		case "0":
			for (int i = 0; i < cart.length; i++) {
				if (cart[i] == null) {
					cart[i] = products[Integer.parseInt(sel)];
					System.out.println("카트에 담겼습니다.");
					break;
				}
			}

			productList();
			break;

		default:
			System.out.println("다시 확인해 주세요.\n");
			productList();
			break;
		}

	}

	public void checkOut() {
		System.out.println(title + "체크 아웃");
		System.out.println("=====================");
		int total = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {

				String pay = "";

				total += cart[i].getPrice();
				System.out.printf("[%d] %s(%d)\n", i, cart[i].getName(), cart[i].getPrice());

			}
		}
		System.out.println("=====================");
		System.out.printf("결제 방법 : \n" + users[selUser].getPayType());
		System.out.printf("합계 : %d\n", total);
		System.out.println("[p]이전, [q] 결제 완료 \n 선택 :");
		String sel = sc.nextLine();
		switch (sel) {
		case "p":
		case "P":
			productList();
			break;
		case "q":
		case "Q":
			System.out.println("결제가 완료 되었습니다. 감사합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("다시 입력해 주세요");
			checkOut();
			break;

		}

	}

}
