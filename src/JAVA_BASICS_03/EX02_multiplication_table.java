package JAVA_BASICS_03;

import java.util.Scanner;

public class EX02_multiplication_table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(); // 시작 범위
		int e = sc.nextInt(); // 끝 범위

		// 입력의 시작과 끝의 크기가 정해져있지 않으므로 경우를 나누어 진행.
		if (s > e) {	// 시작 범위가 더 클 경우
			for (int i = s; i >= e; --i) {
				for (int j = 1; j < 10; ++j) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);	// 조건을 위한 %2d
					if (j % 3 == 0) {
						System.out.println();	// 조건을 위한 3번째 계산마다 개행
					}
				}
				System.out.println();	// n번째의 구구단이 끝난후 개행
			}
		} else {	// 끝 범위가 더 클 경우
			for (int i = s; i <= e; ++i) {
				for (int j = 1; j < 10; ++j) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
					if (j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}
	}
}
