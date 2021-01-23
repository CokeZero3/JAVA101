package JAVA_BASICS_01;

public class EX02_variable {

	public static void main(String[] args) {
		//정수
		int a;
		a = 1;
		
		System.out.println(a+1); //2
		
		a=2;
		System.out.println(a+2); //3
		//실수
		double b = 1.1;
		System.out.println(a+1.1); //2.2
		b = 2.1;
		System.out.println(a+1.1); //3.2
		
		//문자열
		String first = "coding";
		System.out.println(first + " " + "everybody");
		
		String c, d;
		c = "coding";
		d = " everybody";
		
		//변수가 없다면 
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		
		//변수 on 
		int e = 100;
		System.out.println(e + 10);
		System.out.println((e+ 10) / 10);
		System.out.println(((e + 10) / 10) - 10);
		System.out.println((((e + 10) / 10) - 10) * 10);
	}

}
