package lang;

public class StringEx2 {

	public static void main(String[] args) {
		// String 생성자
		char c[] = { 'h', 'e', 'l', 'l', 'o' };
		String str1 = new String(c);
//		System.out.println(str1);
//		// charAt(int index) : char => charAt 을 호출 시 int 매개변수를 넣어서 호출하고 결과값은 char 받는다.
//		System.out.println(str1.charAt(0));//문자열 0 위치에 있는 값
//		System.out.println(str1.charAt(str1.length() - 1));//문자열 마지막 값
//		System.out.println(str1.length());//문자열 길이 값
//		
		String str2 = "자바 프로그래밍";
		
		System.out.println(str2.indexOf("프")>-1? "프가 들어있음":"프가 안들어있음");
		
		boolean found = false;

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == '프') {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("The character '프' is found in the string.");
		} else {
			System.out.println("The character '프' is not found in the string.");
		}
		System.out.println("indexOf(int ch) :" +str1.indexOf('o'));
		System.out.println("indexOf(String str) :" +str1.indexOf("llo"));
		System.out.println("indexOf(int ch , int fromIndex) :" +str1.indexOf('e', 0));//1 int (해당위치에서 String 찾아줘)
		System.out.println("indexOf(int ch , int fromIndex) :" +str1.indexOf('e', 2));//-1
		//indexOf (int ch) : 주어진 문자 ch 가 문자열에 들어있는지 확인하고 위치를 리턴 (못 찾으면 -1 리턴)
		//String str1 = "Hello";
		
		System.out.println("lastIndexOf(int ch): "+ str1.lastIndexOf('o'));// 위치를 찾을 때 오른쪽 끝부터 찾음
		
		
		int index = str2.indexOf("프");

		if (index != -1) {
		    System.out.println("The character '프' was found at index " + index);
		} else {
		    System.out.println("The character '프' was not found in the string.");
		}
		//subString(): 범위에 해당하는 문자열 얻기
		String ssn = "880515-1222012";
		//subString (int beginIndex)
		String result = ssn.substring(3);
		System.out.println(result);
		//sunString( int beginIndex, int endIndex) :endIndex 는 미포함
		System.out.println(ssn.substring(3, 8));
		
		//concat(String str) : + 와 같은 역할의 메소드
		String result2 = str2.concat("안녕하세요");
		System.out.println(result2);
		
		//startswith()
		String str4 = "java.lang.Object";
		System.out.println(str4.startsWith("la"));
		
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("자바", "java"));
		System.out.println(str5);
		str5= str5.replace("자바","java");
		System.out.println(str5);
		
		System.out.println(str1.replace('H', 'h'));
		System.out.println(str5.replaceFirst("java", "자바"));
		System.out.println(str5.replaceAll("java", "자바"));

	}
}