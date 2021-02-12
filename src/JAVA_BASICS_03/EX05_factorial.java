package JAVA_BASICS_03;

import java.util.Scanner;

public class EX05_factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fact(N));

	}

	// 팩토리얼 재귀함수
	private static long fact(int n) { // int형은 13!부터 범위를 벗어남

		if (n <= 1) { // 1일때 리턴
			System.out.println("1! = 1"); // 조건을 위한 출력
			return n;
		} else { // fact 호출을 통한 팩토리얼 구현
			System.out.println(n + "! = " + n + " * " + (n - 1) + "!"); // 조건을 위한 출력
			return fact(n - 1) * n;
		}

	}

}