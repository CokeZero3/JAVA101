package JAVA_BASICS_01;
//숫자와 문자
public class EX01_ABC {
	public static void main(String[] args) {
		//"" 따옴표 없는 숫자는 숫자로 인식한다.
		System.out.println(1+2);
		//소수점 2.5
		System.out.println(1.2+1.3);
		//곱하기
		System.out.println(2*5);
		//나누기
		System.out.println(6/2);
		
		// 문자열
		System.out.println("안녕");
		//작은 따옴표 에러남
//		System.out.println('안녕');
		System.out.println("안녕 세상");
		//문자열에 큰 따옴표를 넣고싶다면?! 따옴표 앞에 \를 넣어주면 된다.
//		System.out.println("내가 말했다, "프로그래밍 세계로 잘 왔다고"");
		System.out.println("내가 말했다, \"프로그래밍 세계로 잘 왔다고\"");
		//줄 띄우기		
		System.out.println("HTML\nCSS\nJavascript");
		//문자와 문자를 더할 때는 아래와 같이 한다.
		System.out.println("생활"+"코딩");
	}
}
