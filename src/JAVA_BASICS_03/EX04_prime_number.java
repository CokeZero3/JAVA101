package JAVA_BASICS_03;

import java.util.Scanner;

public class EX04_prime_number {
	static int prime[] = new int[2000005];	// 소수를 담는 배열
	static Scanner sc = new Scanner(System.in);

	// 에라토스테네스의 체
	// 소수 = '0' 소수가 아닌수 = '1' 으로 정리
	static void eratos(int n) {
		prime[1] = 1; // 반복문 범위 밖의 '1'을 제외하기 위함.
		for (int i = 2; i * i <= n; i++) {	// 입력받는 n의 제곱근 이하까지 반복
			if (prime[i] == 0) {	// int형 배열의 초기값은 '0'
				for (int j = i * i; j <= n; j += i) // i의 제곱부터 n까지 i씩 증가 ex) 2의배수 2,4,6,8,...
				{									
					prime[j] = 1; // i의 배수일 때, '1' 대입
				}
			}
		}
	}

	public static void main(String[] args) {

		int cnt = 0;
		int s = sc.nextInt();
		int e = sc.nextInt();

		eratos(e);

		for (int i = s; i <= e; i++) { //입력받은 범위만큼 반복
			if (prime[i] == 0)		// 배열값이 '0'일때 소수이므로, 카운트
				cnt++;
			
		}
		System.out.println(cnt);
	}

}