package JAVA_BASICS_01;

public class EX07_iteration_loop {
	
	public static void main(String[] args) {
		//조건문
		/*
		while(조건) {
			반복 실행 영역
		}
		while(true) {
			System.out.println("Coding Everybody");
		}
		while(false) {
			System.out.println("Coding Everyone");
		}
		*/
		/*
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값은 0이기 때문에 이 반복문은 실행된다. 
		while(i<10) {
			System.out.println("Coke Everyone"+i);
			
			i++;
		}
		*/
		/*
		 for(초기화; 종료조건; 반복실행){
		 	반복적으로 실행될 구문
		 }
		 */
		/*
		//======break======
		for(int i = 0; i < 11; i++) {	
			System.out.println("Coding Everyone"+i);
		}
		 */
		/*
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }
        */
		//======continue======
		/*
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Coding Everybody " + i);
        }
        */
		//반복문 안에 반복문이 나타날 수 있다. 00부터 99까지를 출력한 것이다.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
	            }
}
}
}