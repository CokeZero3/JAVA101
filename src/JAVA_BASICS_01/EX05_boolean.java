package JAVA_BASICS_01;

public class EX05_boolean {
	public static void main(String[] args) {
		// Equal 예시
		// == 좌항 우항을 비교해서 서로 값이 같다면 true, 다르다면 false가 된다.
  		System.out.println("===========Equal('==') 예시===========");
  		
  		System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        
        // =! '!'는 부정을 의미한다. 같다의 부정은 같지 않다이다 기호로는 =!로 표시한다 
  		System.out.println("===========Not Equal'=!' 예시===========");
  		
        System.out.println(1!=2);           //true
        System.out.println(1!=1);           //false
        System.out.println("one"!="two");   //true  
        System.out.println("one"!="one");   //false
        
        // < 좌항보다 우항이 크다면 true, 아니면 false
  		System.out.println("===========Greater than'<' 예시===========");

        System.out.println(10>20);       //false
        System.out.println(10>2);            //true
        System.out.println(10>10);           //false
        
        // >= 좌항이 우항보다 크거나 같다. 
  		System.out.println("===========Greater than or Equal'>=' 예시===========");
  		
  		System.out.println(10 >= 20); // false
        System.out.println(10 >= 2); // true
        System.out.println(10 >= 10); // true
        
        // .equals 은 문자열 비교할 때 사용되는 메소드다.
  		System.out.println("===========Equal String'.equal' 예시===========");
  		
  		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));

	}
}
