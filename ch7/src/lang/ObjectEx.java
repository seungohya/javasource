package lang;

public class ObjectEx {

	public static void main(String[] args) {
		Person p1= new Person(80110581122L);
		Person p2= new Person(80110581122L);
		System.out.println(p1.equals(p2)?"p1 과 p2 는 같은 사람":"p1 과 p2는 다른 사람");
		//toString () 이 오버라이딩 되어 있다면 참조 변수명만 사용해도 됨.
		System.out.println(p1);
		System.out.println(p1.toString());
		
		Card card1 = new Card();
		Card card2 = new Card("HEART",10);
		System.out.println(card1);
		System.out.println(card2);

	}

}

