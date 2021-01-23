package JAVA_BASICS_01;

public class EX06_conditionalStatement {
	public static void main(String[] args) {
		//conditional statement 1
		System.out.println("조건문 1)");
		if(true) {
			System.out.println("result: true");
		}
		
//		if(false) {
//			System.out.println("result : true");
//		}
		//conditional statement 2
		System.out.println("조건문 2)");
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
//		if(false) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//		}
//		System.out.println(5);
		
		//conditional statement 3
		System.out.println("조건문 3)");
		if(true) {
			System.out.println(1);
		}else {
			 System.out.println(2);
		}
		//
		if(false) {
			System.out.println(1);
		}else {
			 System.out.println(2);
		}
		//conditional statement 4
		System.out.println("조건문 4)");
		if(false) {
			System.out.println(1);
		}else if (false) {
			System.out.println(2);
		}else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		//
		if(false) {
			System.out.println(1);
		}else if (false) {
			System.out.println(2);
		}else if (false) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		//Login Demo 1
		System.out.println("로그인 예시 1)");
//		String id = args[0];
		String id = "cokezero";
		if(id.equals("cokezero")) {
			System.out.println("Logged in Successfully");
		} else {
			System.out.println("Wrong Information");
		}
		//Login Demo 2
		System.out.println("로그인 예시 2)");
		String password = "1234";
		if(id.equals("cokezero")) {
			if (password.equals("1234")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			
		}  else {
			System.out.println("그냥 실패");
		}
		
		//Switch문
		System.out.println("Switch 1)");
		switch (1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
	
		System.out.println("Switch 2)");
		switch (2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
			
		System.out.println("Switch 3)");
		switch (3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");		
		}
		}
		}
		//Switch with Breaks on
		//Switch문
		System.out.println("Switch 1 w/ break)");
		switch (1) {
		case 1:
			System.out.println("one");	break;
		case 2:
			System.out.println("two");	break;
		case 3:
			System.out.println("three");	break;
		}
		System.out.println("Switch 2 w/ break)");
		switch (2) {
		case 1:
			System.out.println("one"); 	break;
		case 2:
			System.out.println("two");	break;
		case 3:
			System.out.println("three");	break;
		}
			
		System.out.println("Switch 3 w/ break)");
		switch (3) {
		case 1:
			System.out.println("one"); 	break;
		case 2:
			System.out.println("two"); 	break;
		case 3:
			System.out.println("three");	break;		 
		default:
			System.out.println("default");
			break;
		
		}
		//Switch 2
		System.out.println("Switch 2nd e.g)");
		int val = 1;
		if ( val == 1) {
			System.out.println("one");
		} else if (val==2) {
			System.out.println("two");
		} else if (val==2) {
			System.out.println("three");
		}
	}
}
