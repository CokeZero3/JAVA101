package JAVA_BASICS_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EX09_method {
	//정의
	public static void numbering() {
		int i = 0;
		while( i<10) {
			System.out.println(i);
			i++;
		}
	}
	//매개변수와 인자
	public static void numbering(int limit) {
		int i = 0;
		while( i < limit) {
			System.out.println(i);
			i++;
		}
	}
	//복수의 인자
	/*
	public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    */
	//return
	/*
	public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다.
        return output;
    }
    */
	 public static String numbering(int init, int limit) {
	        int i = init;
	        String output = "";
	        while (i < limit) {
	            output += i;
	            i++;
	        }
	        return output;
	    }
	//
//	 public static int one() {
//	        return 1;
//	        return 2;
//	        return 3;
//	    } 
	 public static String num(int i) {
	        if(i==0){
	            return "zero";
	        } else if(i==1){
	            return "one";
	        } else if(i==2){
	            return "two";
	        }
	        return "none";
	    }
	//복수의 리턴
	public static String getMember1() {
	        return "최진혁";
	    }
	 
    public static String getMember2() {
        return "최유빈";
    }
 
    public static String getMember3() {
        return "한이람";
    }
    
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
	//호출
	public static void main(String[] args) {
		System.out.println("Numbering 1");
		numbering();
		System.out.println("Numbering 2");
		numbering(4);
		System.out.println("Numbering 3");
//		numbering(0,12);
		  // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
        try { // 무시
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } // 무시
        //return one
//        System.out.println("Return One");
//        System.out.println(one());
        System.out.println("Numbering 4 - return 3");
        System.out.println(num(1));
        //복수의 리턴
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
        System.out.println("Return 4");
        String[] members = getMembers();
        System.out.println(members);
	}
}
